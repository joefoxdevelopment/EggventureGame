import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by u1460287 on 28/03/2018.
 */
public class Console {
    public static void main(String[] args){
        initialiseCharacter(welcomeScreen());
        playGame();
        gameOver();
    }

    private static int welcomeScreen() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("[][][][][][][][][][][][][]--|WELCOME TO EGG-VENTURE|--[][][][][][][][][][][][][]");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("Please select your class: ");
        System.out.println("1) EGGSTEALER:");
        System.out.println("Story: Cadbunny's requires bigger eggster eggs! As the wage slave you are, go rob a dragon's egg for eggster. ");
        System.out.println();
        System.out.println("2) EGGDRUNK:");
        System.out.println("Story: As a drunken bet, a man challenged you to steal the dragon's egg. You aren't one to back down from a challenge! ");
        System.out.println();
        System.out.println("3) EGGSAVIOUR:");
        System.out.println("Story: To make your kids happy this eggster, go find them a dragon's egg, like the good parent you are. ");
        System.out.println();
        System.out.println("4) REC-EGG-NITION:");
        System.out.println("Story: Your parents were overachievers, and you've achieved nothing. Egg stealers get all the fame, but nobody's ever tried to steal a dragon's egg before... ");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Please enter the number of the character you wish to play as: ");

        BufferedReader br = null;
        int input = 1;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            input = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return input;
    }

    private static void initialiseCharacter(int type){
        String classType;
        if(type == 1){
            classType = "eggstealer";
        }
        else if(type == 2){
            classType = "eggdrunk";
        }
        else if(type == 3){
            classType = "eggsaviour";
        }
        else{
            classType = "receggnition";
        }

        Node startingNode = MapLevel.getStartNode();

        Player player = new Player(startingNode, classType);

        playGame(player);
    }

    private static void playGame(Player player){
        boolean gameover = false;

        while(gameover == false){
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("You enter the dungeon.");

            while(gameover == false){
                System.out.println("--------------------------------------------------------------------------------");

                //show player stats
                System.out.println("Current Health: " + player.getHealth());
                System.out.println("Current Attack: " + player.getAttack());
                System.out.println("Current Defense: " + player.getDefense());
                System.out.println("Current Attack modifier: " + player.getAttackItemModifier() + "%");
                System.out.println("Current Defense modifier: " + player.getDefenseItemModifier() + "%");

                System.out.println("--------------------------------------------------------------------------------");

                //show options
                System.out.println("Your movement options are: ");
                System.out.println(player.currentExits());

                System.out.println("--------------------------------------------------------------------------------");

                //wait for player input
                BufferedReader br = null;
                int input = 1;

                try {
                    br = new BufferedReader(new InputStreamReader(System.in));
                    input = Integer.parseInt(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }

                //carry out player action

            }



        }
    }

    private static void gameOver(){

    }

}
