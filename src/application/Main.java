package application;

import factory.PokemonFactory;
import pokemon.Pokemon;
import tournement.Tournement;

public class Main {

    public static void main(String[] args) {
        // Création d'une instance de PokemonFactory
        PokemonFactory pokemonFactory = new PokemonFactory();

        // Création des Pokemon avec une factory
        Pokemon pikachu = pokemonFactory.getPokemon("PIKACHU", "Pikachu");
        Pokemon bulbasaur = pokemonFactory.getPokemon("BULBASAUR", "Bulbasaur");
        Pokemon charmander = pokemonFactory.getPokemon("CHARMANDER", "Charmander");
        Pokemon squirtle = pokemonFactory.getPokemon("SQUIRTLE", "Squirtle");

        // Création d'une instance d'un tournoi
        Tournement tournement = new Tournement();

        try {
            // On ajoute les pokemons au tournoi
            tournement.addPokemon(pikachu);
            tournement.addPokemon(bulbasaur);
            tournement.addPokemon(charmander);
            tournement.addPokemon(squirtle);

            // Le tournoi commence
            tournement.start();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
