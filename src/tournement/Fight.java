package tournement;

import pokemon.Pokemon;

public class Fight {

    private Pokemon pokemonOne;

    private Pokemon pokemonTwo;

    public Fight(Pokemon pokemonOne, Pokemon pokemonTwo) {
        int random = (int)(Math.random() * 2);

        // Le premier pokemon à attaquer et aléatoire
        if (random == 1) {
            this.pokemonOne = pokemonOne;
            this.pokemonTwo = pokemonTwo;
        } else {
            this.pokemonOne = pokemonTwo;
            this.pokemonTwo = pokemonOne;
        }
    }

    // Retourne le Pokemon perdant
    public Pokemon start() {
        System.out.println("\n" + this.pokemonOne.getName() + " affronte " + this.pokemonTwo.getName() + " dans un combat qui s'annonce extraordinaire\n");

        this.pokemonOne.speakFightShout();
        this.pokemonTwo.speakFightShout();

        while (true) {
            if (this.PokemonOneIsAlive()) {
                this.pokemonOne.giveDamage(pokemonTwo);
            } else {
                this.pokemonOne.speakDefeatShout();
                this.pokemonTwo.speakVictoryShout();
                return this.pokemonOne;
            }
            if (this.PokemonTwoIsAlive()) {
                this.pokemonTwo.giveDamage(pokemonOne);
            } else {
                this.pokemonTwo.speakDefeatShout();
                this.pokemonOne.speakVictoryShout();
                return this.pokemonTwo;
            }
        }
    }

    private boolean PokemonOneIsAlive() {
        return (this.pokemonOne.getLife() > 0);
    }

    private boolean PokemonTwoIsAlive() {
        return (this.pokemonTwo.getLife() > 0);
    }
}
