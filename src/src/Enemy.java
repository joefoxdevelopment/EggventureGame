/**
 * Created by u1354482 on 28/03/2018.
 */
public class Enemy extends Character {
    private Collectable drop;
    private String name;

    public Enemy(String name, Collectable drop, int health, int attack, int defense) {
        super(health, attack, defense);
        this.name = name;
        this.drop = drop;
    }
}
