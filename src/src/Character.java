/**
 * Created by u1354482 on 28/03/2018.
 */
public abstract class Character {
    protected int health;
    protected int attack;
    protected int defense;

    /**
     * All characters have an attack ability
     * @return the total damage caused to the target
     */
    protected abstract int attack(int targetDefense);

    //------GETTERS AND SETTERS-------
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
