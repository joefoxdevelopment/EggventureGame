import java.util.Random;

/**
 * Created by u1771784 on 28/03/2018.
 */
public class QuillFiend extends Character {
    private String name;
    private Weapon drop;
    public QuillFiend(){
        this.name="Lesser Quillfiend";
        super.attack=50;
        super.defense=50;
        super.health=100;
        this.drop=new Weapon("Platinum Sword",10);
        //this.drop=new Collectable("Red Egg");
    }
    public void secondLvlWorm(){
        this.name="Greater Quillfiend";
        this.attack+=70;
        this.defense+=70;
        this.health+=120;
        this.drop=new Weapon("",10);
    }
    public void thirdLvlWorm(){
        this.name="Dire Quillfiend";
        this.attack+=90;
        this.defense+=90;
        this.health+=140;
        this.drop=new Weapon("",10);
    }
    public Weapon dropItem(){
        Random rand=new Random();
        int chance=rand.nextInt(1);
        if (chance==1){
            return drop;
        }else{
            return null;
        }
    }
}

