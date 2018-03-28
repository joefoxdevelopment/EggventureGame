import java.util.Random;

/**
 * Created by u1771784 on 28/03/2018.
 */
public class Worm extends  Character {
    private String name;
    private Weapon drop;
    public Worm() {
        this.name="Lesser Worm";
        super.attack=10;
        super.defense=10;
        super.health=40;
        this.drop=new Weapon("Bronze Sword",10);
        //this.drop=new Collectable("Red Egg");
    }
    public void secondLvlWorm(){
        this.name="Greater Worm";
        this.attack+=10;
        this.defense+=10;
        this.health+=20;
        this.drop=new Weapon("Silver Sword",10);
    }
    public void thirdLvlWorm(){
        this.name="Dire Worm";
        this.attack+=10;
        this.defense+=10;
        this.health+=20;
        this.drop=new Weapon("Gold Sword",10);
    }
    public Weapon dropItem(){
        Random rand=new Random();
        int chance=rand.nextInt(9);
        if (chance==5){
            return drop;
        }else{
            return null;
        }
    }
}
