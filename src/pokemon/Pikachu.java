package pokemon;

public class Pikachu extends Pokemon {

    public Pikachu(String name, int life, int power) {
        super(name, life, power);
        this.setPrecision(80);
        this.setFightShout("PIKAPIKACHU!!!");
        this.setVictoryShout("PIKAPIKA!!");
        this.setDefeatShout("Pikachuuu...");
    }
}
