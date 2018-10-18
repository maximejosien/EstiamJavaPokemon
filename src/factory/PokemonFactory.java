package factory;

import pokemon.*;

public class PokemonFactory {

    public Pokemon getPokemon(String race, String name) {
        if (race == null) {
            return null;
        }
        if (race.equalsIgnoreCase("PIKACHU")) {
            return new Pikachu(name, 100, 10);
        } else if (race.equalsIgnoreCase("BULBASAUR")) {
            return new Bulbasaur(name, 100, 10);
        } else if (race.equalsIgnoreCase("CHARMANDER")) {
            return new Charmander(name, 100, 10);
        } else if (race.equalsIgnoreCase("SQUIRTLE")) {
            return new Squirtle(name, 100, 10);
        }

        return null;
    }
}
