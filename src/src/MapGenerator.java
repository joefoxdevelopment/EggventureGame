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
        MapGenerator.getInstance().generateMap(1, 20);

    }

    public Node[][] generateMap(int level, int gridSize) {
        // grid generation
        // generate grid
        // generate upstair
        // generate downstair
        // generate connections
        // ensure there's a path from upstair to downstairs
        // completed

        int maxFill = (gridSize * 3) + new Random().nextInt(gridSize*7);

        int[][] startLocation = {
                {8 + new Random().nextInt(gridSize-8), 8 + new Random().nextInt(gridSize-8)}
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
        int randomNum = new Random().nextInt(4);
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
                lastDirection[0][0] = randomDirection[0][0];
                lastDirection[0][1] = randomDirection[0][1];
                randomNum = new Random().nextInt(3);
                randomDirection[0] = directions[randomNum];
                maxFill--;
                baseGrid[currentLocation[0][0]][currentLocation[0][1]] = true;
            }

            randomNum = new Random().nextInt(4);
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

        nodeGrid[startLocation[0][0]][startLocation[0][1]] = new Node(startLocation[0][0], startLocation[0][1], true, false);
        nodeGrid[downLocation[0][0]][downLocation[0][1]] = new Node(downLocation[0][0], downLocation[0][1], false, true);

        for (int i = 0; i < gridSize; i++)
        {
            for (int j = 0; j < gridSize; j++)
            {
                if (baseGrid[i][j] == true && nodeGrid[i][j] == null) {
                    nodeGrid[i][j] = new Node(i,j);
                }
            }
        }

        for (int i = 0; i < gridSize; i++)
        {
            for (int j = 0; j < gridSize; j++)
            {
                if (nodeGrid[i][j] != null) {

                    if (i > 0 && nodeGrid[i-1][j] != null)
                    {
                        // North
                        nodeGrid[i][j].setNorth(nodeGrid[i-1][j]);
                    }

                    if (i < gridSize - 1 && nodeGrid[i+1][j] != null)
                    {
                        // South
                        nodeGrid[i][j].setSouth(nodeGrid[i+1][j]);
                    }

                    if (j > 0 && nodeGrid[i][j-1] != null)
                    {
                        // West
                        nodeGrid[i][j].setWest(nodeGrid[i][j-1]);
                    }

                    if (j < gridSize - 1 && nodeGrid[i][j+1] != null)
                    {
                        // East
                        nodeGrid[i][j].setEast(nodeGrid[i][j+1]);

                    }
                }
            }
        }

        /**
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
                        System.out.print("-");
                    }
                } else
                {
                    System.out.print("#");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
         **/

        return nodeGrid;
    }
}


