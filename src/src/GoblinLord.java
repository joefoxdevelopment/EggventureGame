import java.util.ArrayList;
import java.util.Random;

/**
 * Created by u1771784 on 28/03/2018.
 */
public class GoblinLord extends Character {
    private String name="GoblinLord";
    private ArrayList<Collectable> itemDrops;
    public GoblinLord(){
        super.attack=100;
        super.defense=100;
        super.health=170;
        itemDrops.add(new Weapon("",1));
        itemDrops.add(new Shield("",1));
    }
    public Collectable dropItem(){
        Random random=new Random();
        int num=random.nextInt(1);
        return itemDrops.get(num);
    }
}
