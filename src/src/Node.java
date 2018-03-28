import java.util.ArrayList;

/**
 * Created by u1354482 on 28/03/2018.
 */
public class Node {
    private Boolean hasUpstair;
    private Boolean hasDownstair;
    private Node north;
    private Node east;
    private Node south;
    private Node west;
    private Enemy enemy;
    private int gridX;
    private int gridY;

    public Node()
    {
        this.gridX = 0;
        this.gridY = 0;
        this.hasUpstair = false;
        this.hasDownstair = false;
        this.north = null;
        this.east = null;
        this.south = null;
        this.west = null;
        this.enemy = null;
    }

    public Node(int gridX, int gridY)
    {
        this.gridX = gridX;
        this.gridY = gridY;
        this.hasUpstair = false;
        this.hasDownstair = false;
        this.north = null;
        this.east = null;
        this.south = null;
        this.west = null;
        this.enemy = null;
    }

    public Node(int gridX, int gridY, Boolean hasUpstair, Boolean hasDownstair)
    {
        this.gridX = gridX;
        this.gridY = gridY;
        this.hasUpstair = hasUpstair;
        this.hasDownstair = hasDownstair;
        this.north = null;
        this.east = null;
        this.south = null;
        this.west = null;
        this.enemy = null;
    }

    public void setEnemy(Enemy enemy)
    {
        this.enemy = enemy;
    }

    public Enemy getEnemy()
    {
        return this.enemy;
    }

    public Boolean hasUpstair()
    {
        return this.hasUpstair;
    }

    public Boolean hasDownstair()
    {
        return this.hasDownstair;
    }

    public void setNorth(Node north)
    {
        this.north = north;
    }

    public Node getNorth()
    {
        return this.north;
    }

    public Boolean hasNorth()
    {
        if (this.north == null)
        {
            return false;
        } else {
            return true;
        }
    }

    public void setEast(Node east)
    {
        this.east = east;
    }

    public Node getEast()
    {
        return this.east;
    }

    public Boolean hasEast()
    {
        if (this.east == null)
        {
            return false;
        } else {
            return true;
        }
    }

    public void setSouth(Node south)
    {
        this.south = south;
    }

    public Node getSouth()
    {
        return this.south;
    }

    public Boolean hasSouth()
    {
        if (this.south == null)
        {
            return false;
        } else {
            return true;
        }
    }

    public void setWest(Node west)
    {
        this.west = west;
    }

    public Node getWest()
    {
        return this.west;
    }

    public Boolean hasWest()
    {
        if (this.west == null)
        {
            return false;
        } else {
            return true;
        }
    }

    public Boolean[] getExits()
    {
        Boolean[] exits = {
                hasNorth(),
                hasEast(),
                hasSouth(),
                hasWest()
        };
        return exits;
    }
}