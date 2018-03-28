import java.util.Random;

/**
 * Created by u1771784 on 28/03/2018.
 */
public class Spider extends Character {
    private String name;
    private Egg drop;
    public Spider() {
        this.name="Lesser Spider";
        super.attack=10;
        super.defense=10;
        super.health=40;
        this.drop=new Egg("Red Egg",10);
        //this.drop=new Collectable("Red Egg");
    }
    public void secondLvlSpider(){
        this.name="Greater Spider";
        this.attack+=10;
        this.defense+=10;
        this.health+=20;
        this.drop=new Egg("Red Egg",20);
    }
    public void thirdLvlSpider(){
        this.name="Dire Spider";
        this.attack+=10;
        this.defense+=10;
        this.health+=20;
        this.drop=new Egg("Red Egg",30);
    }
    public Egg dropItem(){
        Random rand=new Random();
        int chance=rand.nextInt(9);
        if (chance==5){
            return drop;
        }else{
            return null;
        }
    }
}
