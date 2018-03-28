import java.util.ArrayList;
import java.util.Random;

/**
 * Created by u1771784 on 28/03/2018.
 */
public class MonsterInfo {

    public Enemy getMonster(int level) {
        Random rand = new Random();
        int num=rand.nextInt(3);
        switch(num) {
            case(0):
                return this.getLevelledSpider(level);
            case(1):
                return this.getLevelledBadger(level);
            default:
                return this.getLvlWorm(level);
        }
    }

    private Enemy getLevelledSpider(int level) {
        switch(level) {
            case(1):
                return new Enemy("Lesser Spider",new Egg("Red Egg",10),40,10,10);
            case(2):
                return new Enemy("Greater Spider",new Egg("Red Egg",20),60,20,10);
            default:
                return new Enemy("Dire Spider",new Egg("Red Egg",25),80,30,15);
        }

    }
    private Enemy getLevelledBadger(int level){
        switch(level) {
            case(1):
                return new Enemy("Lesser Badger",new Shield("Bronze Shield",10),40,10,10);
            case(2):
                return new Enemy("Greater badger",new Shield("Silver Shield",15),60,20,10);
            default:
                return new Enemy("Dire Badger",new Shield("Gold Shield",20),80,30,15);
        }
    }
    private Enemy getLvlWorm(int level){
        switch(level) {
            case(1):
                return new Enemy("Lesser Worm",new Weapon("Bronze Sword",10),40,10,10);
            case(2):
                return new Enemy("Greater Worm",new Weapon("Silver Sword",25),60,20,10);
            default:
                return new Enemy("Dire Worm",new Weapon("Gold Sword",35),80,30,15);
        }
    }

}
