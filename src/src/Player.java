import java.util.Random;

/**
 * Created by u1354482 on 28/03/2018.
 */
public class Player extends Character {

    private Node location;
    private int attackItemModifier;
    private int defenseItemModifier;
    private String classType;

    public Player(Node startingLocation, String classType){
        location = startingLocation;
        this.classType = classType;

        if(classType.equals("eggstealer")){
            health = 100;
            attack = 8;
            defense = 8;
        }
        else if(classType.equals("eggdrunk")){
            health = 80;
            attack = 12;
            defense = 8;
        }
        else if(classType.equals("eggsaviour")) {
            health = 80;
            attack = 9;
            defense = 12;
        }
        //else rec-egg-nition, which has standard stats
        else{
            health = 80;
            attack = 10;
            defense = 10;
        }

    }

    @Override
    public int attack(int targetDefense){
        Random rand = new Random();

        //attack formula is: (base attack * attack item modifier) +- 40% damage randomisation. Rounded to the nearest int.
        int randomPercentage = (rand.nextInt(80) + 60);
        double attackDamage = (attack * ((100 + attackItemModifier) / 100)) * randomPercentage / 100;

        //1 in every 10 hits will be a critical hit, for double damage
        int crit = rand.nextInt(9);
        if(crit == 0){
            attackDamage *= 2;
        }

        //defense formula is: attack damage - defense )
        int totalDamage = (int) Math.round(attackDamage * (100 - targetDefense) / 100);

        //return the end result as an int, this will be how much damage is caused
        return totalDamage;
    }

    @Override
    public int getDefense(){
        int totalDefense = (int) Math.round(((100 + defense) / 100) * ((100 + defenseItemModifier) / 100));
        return totalDefense;
    }


    //-----GETTERS AND SETTERS-----
    public Node getLocation() {
        return location;
    }

    public void setLocation(Node location) {
        this.location = location;
    }

    public Boolean[] seeExits()
    {
        return location.getExits();
    }

    public int getAttackItemModifier() {
        return attackItemModifier;
    }

    public void setAttackItemModifier(int attackItemModifier) {
        this.attackItemModifier = attackItemModifier;
    }

    public int getDefenseItemModifier() {
        return defenseItemModifier;
    }

    public void setDefenseItemModifier(int defenseItemModifier) {
        this.defenseItemModifier = defenseItemModifier;
    }

    public String getClassType() {
        return classType;
    }

}
