import java.util.Random;

/**
 * Created by u1771784 on 28/03/2018.
 */
public class Nibbler extends Character{
    private String name;
    private Shield drop;
    public Nibbler(){
        this.name="Lesser Nibbler";
        super.attack=50;
        super.defense=50;
        super.health=100;
        this.drop=new Shield("Platinum Shield",50);
        //this.drop=new Collectable("Red Egg");
    }
    public void secondLvlWorm(){
        this.name="Greater Nibbler";
        this.attack+=70;
        this.defense+=70;
        this.health+=120;
        this.drop=new Shield("Vorpal Shield",65);
    }
    public void thirdLvlWorm(){
        this.name="Dire Nibbler";
        this.attack+=90;
        this.defense+=90;
        this.health+=140;
        this.drop=new Shield("Templars Ward",70);
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

