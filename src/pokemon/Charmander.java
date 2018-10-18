package pokemon;

public class Charmander extends Pokemon {

    public Charmander(String name, int life, int power) {
        super(name, life, power);
        this.setPrecision(80);
        this.setFightShout("CHARCHARCHARMANDER!!!");
        this.setVictoryShout("CHARCHAR!!");
        this.setDefeatShout("Charmander...");
    }
}
