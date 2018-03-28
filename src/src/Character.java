/**
 * Created by u1354482 on 28/03/2018.
 */
public abstract class Character {
    private int health;
    private int attack;
    private int defense;

    public Character(int health, int attack, int defense) {
        this.attack   = attack;
        this.defense  = defense;
        this.health   = health;
    }
}
