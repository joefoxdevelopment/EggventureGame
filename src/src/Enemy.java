import java.util.Random;

/**
 * Created by u1354482 on 28/03/2018.
 */
public class Enemy extends Character {


    @Override
    public int attack(int targetDefense){
        Random rand = new Random();

        //attack formula is: (base attack * attack item modifier) +- 40% damage randomisation. Rounded to the nearest int.
        int randomPercentage = (rand.nextInt(80) + 60);
        double attackDamage = (attack * attackItemModifier) * randomPercentage / 100;

        //1 in every 10 hits will be a critical hit, for double damage
        int crit = rand.nextInt(9);
        if(crit == 0){
            attackDamage *= 2;
        }

        //defense formula is: attack damage / (base defense percentage * defense item modifier)
        int totalDamage = (int) Math.round(attackDamage / (defense * defenseItemModifier));

        //return the end result as an int, this will be how much damage is caused
        return totalDamage;
    }
}
