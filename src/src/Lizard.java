import java.util.Random;

/**
 * Created by u1771784 on 28/03/2018.
 */
public class Lizard extends Character {
    private String name;
    private Egg drop;
    public Lizard(){
        this.name="Lesser Lizard";
        super.attack=50;
        super.defense=50;
        super.health=100;
        this.drop=new Egg("Platinum Egg",10);
        //this.drop=new Collectable("Red Egg");
    }
    public void secondLvlSpider(){
        this.name="Greater Lizard";
        this.attack+=70;
        this.defense+=70;
        this.health+=120;
        this.drop=new Egg("Vorpal Egg",20);
    }
    public void thirdLvlSpider(){
        this.name="Dire Lizard";
        this.attack+=90;
        this.defense+=90;
        this.health+=140;
        this.drop=new Egg("Thsasyth's Light",30);
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

