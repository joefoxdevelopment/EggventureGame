import java.util.Random;

/**
 * Created by u1771784 on 28/03/2018.
 */
public class Badger extends  Character {
    private String name;
    private Shield drop;
    public Badger() {
        this.name="Lesser Badger";
        super.attack=10;
        super.defense=10;
        super.health=40;
        this.drop=new Shield("Bronze Shield",10);
        //this.drop=new Collectable("Red Egg");
    }
    public void secondLvlBadger(){
        this.name="Greater Badger";
        this.attack+=10;
        this.defense+=10;
        this.health+=20;
        this.drop=new Shield("Silver Shield",10);
    }
    public void thirdLvlBadger(){
        this.name="Dire Badger";
        this.attack+=10;
        this.defense+=10;
        this.health+=20;
        this.drop=new Shield("Gold Shield",10);
    }
    public Shield dropItem(){
        Random rand=new Random();
        int chance=rand.nextInt(9);
        if (chance==5){
            return drop;
        }else{
            return null;
        }
    }
}
