import java.util.ArrayList;

/**
 * Created by u1354482 on 28/03/2018.
 */
public class Node {
    private Boolean hasUpstair;
    private Boolean hasDownstair;
    private ArrayList<Node> connectedNodes;
    private ArrayList<Enemy> containedEnemies;
    private int gridX;
    private int gridY;

    public Node()
    {
        this.gridX = 0;
        this.gridY = 0;
        this.hasUpstair = false;
        this.hasDownstair = false;
        this.connectedNodes = new ArrayList<>();
        this.containedEnemies = new ArrayList<>();
    }

    public Node(int gridX, int gridY)
    {
        this.gridX = gridX;
        this.gridY = gridY;
        this.hasUpstair = false;
        this.hasDownstair = false;
        this.connectedNodes = new ArrayList<>();
        this.containedEnemies = new ArrayList<>();
    }

    public Node(int gridX, int gridY, Boolean hasUpstair, Boolean hasDownstair)
    {
        this.gridX = gridX;
        this.gridY = gridY;
        this.hasUpstair = hasUpstair;
        this.hasDownstair = hasDownstair;
        this.connectedNodes = new ArrayList<>();
        this.containedEnemies = new ArrayList<>();
    }

    public void setConnectedNodes(ArrayList<Node> connectedNodes)
    {
        this.connectedNodes = connectedNodes;
    }

    public ArrayList<Node> getConnectedNodes()
    {
        return this.connectedNodes;
    }

    public void setContainedEnemies(ArrayList<Enemy> containedEnemies)
    {
        this.containedEnemies = containedEnemies;
    }

    public ArrayList<Enemy> getContainedEnemies()
    {
        return this.containedEnemies;
    }

    public Boolean hasUpstair()
    {
        return this.hasUpstair;
    }

    public Boolean hasDownstair()
    {
        return this.hasDownstair;
    }

}