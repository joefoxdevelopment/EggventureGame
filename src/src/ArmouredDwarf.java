import java.util.ArrayList;
import java.util.Random;

/**
 * Created by u1771784 on 28/03/2018.
 */
public class ArmouredDwarf extends Character {
    private String name="Armoured Dwarf";
    private ArrayList<Collectable> itemDrops;
    public ArmouredDwarf(){
        super.attack=40;
        super.defense=40;
        super.health=130;
        itemDrops.add(new Weapon("",1));
        itemDrops.add(new Shield("",1));
    }
    public Collectable dropItem(){
        Random random=new Random();
        int num=random.nextInt(1);
        return itemDrops.get(num);
    }
}
