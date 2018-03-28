import java.util.Random;

/**
 * Created by u1354482 on 28/03/2018.
 */
public class MapGenerator {

    private static MapGenerator ourInstance = new MapGenerator();

    public static MapGenerator getInstance() {
        return ourInstance;
    }

    private MapGenerator() {
    }

    public static void main(String[] args) {
        MapGenerator.getInstance().generateMap(10);

    }

    public Node[][] generateMap(int gridSize) {
        // grid generation
        // generate grid
        // generate upstair
        // generate downstair
        // generate connections
        // ensure there's a path from upstair to downstairs
        // completed

        Boolean[][] baseGrid = new Boolean[gridSize][gridSize];

        for (int i = 0; i < gridSize; i++)
        {
            for (int j = 0; j < gridSize; j++)
            {
                baseGrid[i][j] = new Random().nextBoolean();
            }
        }

        for (int i = 0; i < gridSize; i++)
        {
            for (int j = 0; j < gridSize; j++)
            {
                System.out.print(baseGrid[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }


        return new Node[gridSize][gridSize];
    }
}


