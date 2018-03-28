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

        int maxFill = gridSize * 2 + new Random().nextInt(gridSize*8);

        int[][] startLocation = {
                {1 + new Random().nextInt(gridSize-2), 1 + new Random().nextInt(gridSize-2)}
        };
        Boolean[][] baseGrid = new Boolean[gridSize][gridSize];

        for (int i = 0; i < gridSize; i++)
        {
            for (int j = 0; j < gridSize; j++)
            {
                baseGrid[i][j] = false;
            }
        }

        baseGrid[startLocation[0][0]][startLocation[0][1]] = true;

        int[][] directions = {
                {-1, 0},
                {1, 0},
                {0, -1},
                {0, 1}
        };

        int[][] randomDirection = new int[1][2];
        int randomNum = new Random().nextInt(3);
        randomDirection[0] = directions[randomNum];
        int[][] lastDirection = new int[1][2];

        int[][] currentLocation = {
                {startLocation[0][0], startLocation[0][1]}
        };

        while (maxFill > 0)
        {
            while (currentLocation[0][0] + randomDirection[0][0] >= 0 &&
                    currentLocation[0][0] + randomDirection[0][0] < gridSize &&
                    currentLocation[0][1] + randomDirection[0][1] >= 0 &&
                    currentLocation[0][1] + randomDirection[0][1] < gridSize &&
                    maxFill > 0)
            {
                currentLocation[0][0] = currentLocation[0][0] + randomDirection[0][0];
                currentLocation[0][1] = currentLocation[0][1] + randomDirection[0][1];
                randomNum = new Random().nextInt(3);
                randomDirection[0] = directions[randomNum];
                maxFill--;
                baseGrid[currentLocation[0][0]][currentLocation[0][1]] = true;
            }

            randomNum = new Random().nextInt(3);
            randomDirection[0] = directions[randomNum];

        }

        int[][] downLocation = {
                {currentLocation[0][0], currentLocation[0][1]}
        };

        Node[][] nodeGrid = new Node[gridSize][gridSize];

        for (int i = 0; i < gridSize; i++)
        {
            for (int j = 0; j < gridSize; j++)
            {
                nodeGrid[i][j] = null;
            }
        }

        //TODO: Convert into node.
        nodeGrid[startLocation[0][0]][startLocation[0][1]] = new Node(startLocation[0][0], startLocation[0][1], true, false);
        nodeGrid[downLocation[0][0]][downLocation[0][1]] = new Node(downLocation[0][0], downLocation[0][1], false, true);

        System.out.println("" + startLocation[0][0] + " " + startLocation[0][1]);
        System.out.println("" + downLocation[0][0] + " " + downLocation[0][1]);

        for (int i = 0; i < gridSize; i++)
        {
            for (int j = 0; j < gridSize; j++)
            {
                if (nodeGrid[i][j] != null)
                {
                    if (nodeGrid[i][j].hasUpstair())
                    {
                        System.out.print("u");
                    } else if (nodeGrid[i][j].hasDownstair())
                    {
                        System.out.print("d");
                    } else
                    {
                        System.out.print(1);
                    }
                } else
                {
                    System.out.print(0);
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        return nodeGrid;
    }
}


