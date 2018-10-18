package pokemon;

public abstract class Pokemon {

    private String name;

    private int life;

    private int power;

    private int precision;

    private String fightShout;

    private String victoryShout;

    private String defeatShout;

    public Pokemon(String name, int life, int power) {
        this.name = name;
        this.life = life;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public String getFightShout() {
        return fightShout;
    }

    public void setFightShout(String fightShout) {
        this.fightShout = fightShout;
    }

    public String getVictoryShout() {
        return victoryShout;
    }

    public void setVictoryShout(String victoryShout) {
        this.victoryShout = victoryShout;
    }

    public String getDefeatShout() {
        return defeatShout;
    }

    public void setDefeatShout(String defeatShout) {
        this.defeatShout = defeatShout;
    }

    public boolean takeDamage(int dammage) {
        int shout = (int)(Math.random() * (100));

        // Permet au pokemon de rater leurs attaques en fonction de leurs précision
        if (!(shout < this.precision)) {
            return false;
        }

        this.life = this.life - dammage;
        return true;
    }

    public boolean giveDamage(Pokemon pokemon) {
        if (!pokemon.takeDamage(this.power)) {
            System.out.println(this.name + ": À rater son attaque");
            return false;
        }
        System.out.println(this.name + " inflige " + this.power + " degat(s) à " + pokemon.getName() + ".");
        return true;
    }

    public void speakFightShout() {
        this.speak(this.fightShout);
    }

    public void speakVictoryShout() {
        this.speak(this.victoryShout);
    }

    public void speakDefeatShout() {
        this.speak(this.defeatShout);
    }

    private void speak(String value) {
        System.out.println(this.name + ": " + value);
    }
}
