import java.util.ArrayList;
import java.util.Random;

/**
 * Created by u1771784 on 28/03/2018.
 */
public class StoneGolem extends Character {
    private String name="StoneGolem";
    private ArrayList<Collectable> itemDrops;
    public StoneGolem(){
        super.attack=80;
        super.defense=80;
        super.health=160;
        itemDrops.add(new Weapon("",1));
        itemDrops.add(new Shield("",1));
    }
    public Collectable dropItem(){
        Random random=new Random();
        int num=random.nextInt(1);
        return itemDrops.get(num);
    }
}
