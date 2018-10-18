package pokemon;

public class Squirtle extends Pokemon {

    public Squirtle(String name, int life, int power) {
        super(name, life, power);
        this.setPrecision(80);
        this.setFightShout("SQUISQUIRTLE!!!");
        this.setVictoryShout("SQUISQUI!!");
        this.setDefeatShout("Squirtle...");
    }
}
