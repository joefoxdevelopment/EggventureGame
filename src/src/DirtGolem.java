import java.util.ArrayList;
import java.util.Random;

/**
 * Created by u1771784 on 28/03/2018.
 */
public class DirtGolem extends Character{
    private String name ="Dirt Golem";
    private ArrayList<Collectable> itemDrops;
    public DirtGolem(){
        super.attack=30;
        super.defense=30;
        super.health=110;
        itemDrops.add(new Weapon("",1));
        itemDrops.add(new Shield("",1));
    }
    public Collectable dropItem(){
        Random random=new Random();
        int num=random.nextInt(1);
        return itemDrops.get(num);
    }
}
