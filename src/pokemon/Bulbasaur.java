package pokemon;

public class Bulbasaur extends Pokemon {

    public Bulbasaur(String name, int life, int power) {
        super(name, life, power);
        this.setPrecision(80);
        this.setFightShout("BULBABULBASAUURR!!!");
        this.setVictoryShout("BULBABULBA!!");
        this.setDefeatShout("Bulbasaur...");
    }
}
