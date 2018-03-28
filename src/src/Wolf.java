import java.util.ArrayList;
import java.util.Random;

/**
 * Created by u1771784 on 28/03/2018.
 */
public class Wolf extends Character {
    private String name="Wolf";
    private ArrayList<Collectable> itemDrops;
    public Wolf(){
        super.attack=20;
        super.defense=20;
        super.health=90;
        itemDrops.add(new Weapon("",1));
        itemDrops.add(new Shield("",1));
    }
    public Collectable dropItem(){
        Random random=new Random();
        int num=random.nextInt(1);
        return itemDrops.get(num);
        }
    }
