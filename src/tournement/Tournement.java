package tournement;

import exception.PokemonAlreadyExistException;
import exception.PokemonNotFoundException;
import exception.TournamentInvalidxception;
import pokemon.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Tournement {

    private List<Pokemon> pokemons = new ArrayList<>();
    private List<Fight> figths = new ArrayList<>();

    public void addPokemon(Pokemon pokemon) throws PokemonAlreadyExistException {
        if (this.pokemons.contains(pokemon)) {
            throw new PokemonAlreadyExistException("Pokemon already register in the tournement");
        }
        this.pokemons.add(pokemon);
    }

    public void removePokemon(Pokemon pokemon) throws PokemonNotFoundException {
        if (!this.pokemons.contains(pokemon)) {
            throw new PokemonNotFoundException("Pokemon is not register in the tournement");
        }
        this.pokemons.remove(pokemon);
    }
    
    public void start() throws PokemonNotFoundException, TournamentInvalidxception {
        // Permet de vérifier que le tournoi possède un nombre de Pokemon suffisant pour s'affronter
        if (Integer.bitCount(this.pokemons.size()) != 1 || this.pokemons.size() < 2) {
            throw new TournamentInvalidxception("The tournament canno't start");
        }
        int nbTurn = 0;

        while (!this.checkWinner()) {
            System.out.println("Tour numéro " + nbTurn + ".");
            this.addPokemonsFigths();
            this.startFigths();
            nbTurn++;
        }
        this.victoryMessage();
    }

    private void addPokemonsFigths() {
        for (int i = 0; i < pokemons.size(); i = i + 2) {
            Fight fights = new Fight(pokemons.get(i), pokemons.get(i + 1));

            this.figths.add(fights);
        }
    }

    private void startFigths() throws PokemonNotFoundException {
        for (Fight fights: this.figths) {
            Pokemon loser = fights.start();

            // Une fois le combat terminé, on supprime alors le perdant du tournois
            this.removePokemon(loser);
        }
        this.figths.clear();

        for (Pokemon pokemon: this.pokemons) {
            System.out.println(pokemon.getName());
        }
    }

    private boolean checkWinner() {
        return (this.pokemons.size() == 1);
    }

    private void victoryMessage() {
        System.out.println("\nLe gagnant de notre magnifique tournoi est " + this.pokemons.get(0).getName() + ".");
    }
}
