/**
 * Created by JOE FOX on 28/03/2018.
 */
public abstract class Collectable {

    protected int health  = 0;
    protected int attack  = 0;
    protected int defense = 0;

    protected String name;

    public Collectable(String name) {
        this.name = name;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getHealth() {
        return this.health;
    }

    public String getName() {
        return this.name;
    }
}
