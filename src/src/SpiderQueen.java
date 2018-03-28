import java.util.ArrayList;
import java.util.Random;

/**
 * Created by u1771784 on 28/03/2018.
 */
public class SpiderQueen extends Character {
    private String name="StoneGolem";
    private ArrayList<Collectable> itemDrops;
    public SpiderQueen(){
        super.attack=60;
        super.defense=60;
        super.health=150;
        itemDrops.add(new Weapon("",1));
        itemDrops.add(new Shield("",1));
        itemDrops.add(new Egg("",1));
    }
    public Collectable dropItem(){
        Random random=new Random();
        int num=random.nextInt(2);
        return itemDrops.get(num);
    }

    public static void main(String[] args) {
        Random random=new Random();
        int num=random.nextInt(2);
        for (int l=0;l<20;l++){
        System.out.println(num);
    }
}}
