import java.util.ArrayList;

/**
 * Created by u1354482 on 28/03/2018.
 */
public class MapLevel {
    private Node[][] nodeGrid;
    private int level;
    private int mapSize;

    public MapLevel(int level)
    {
        this.level = level;
        this.mapSize = 20;
        generateMap();
    }

    public void generateMap()
    {
        MapGenerator.getInstance().generateMap(this.level, mapSize);
    }

    public Node getStartNode() {
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if (nodeGrid[i][j] != null) {
                    if (nodeGrid[i][j].hasUpstair()) {
                        return nodeGrid[i][j];
                    }
                }
            }
        }
        return null;
    }


}
