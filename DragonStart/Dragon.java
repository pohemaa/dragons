package DragonStart;

import java.awt.*;
/**
 * A customized dragon that can be altered to make any type of dragon.
 *
 * @author Ohemaa Prempeh
 * @version version 1- 12/4/17
 */
public class Dragon
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int size;
    private Color c;
    private int health;
    

    /**
     * Default Constructor for objects of class Dragon
     */
    public Dragon(int x, int y, int size, Color c, int health )
    {
        // initialise instance variables
        this.x = 50;
        this.y = 50;
        this.size = 1;
        this.c = Color.RED;
        this.health = 25;
    }
    
    /**
     * Overloaded Constructors go here
     */

    /** 
     * Accessor Methods
     */
    /**
     * drawDragon(Graphics g)
     * Starting of drawing, complete your Dragon....
     */
    public void drawDragon(Graphics g)
    {
        g.setColor(c);
        g.fillRect(x, y , size * 25, size * 25);
        g.fillRect(x+ size * 25, y+size*25, size * 60, size * 50); //draw body
        g.fillRect(x + size * 25, (y + size *25) + size * 50, size * 10, size * 50); //draw legs
        g.fillRect(x + size * 75, (y + size *25) + size * 50, size * 10, size * 50); //draw legs
        g.fillRect(x+ size * 85, y+size*25, size * 30, size * 20);
        g.fillRect(x+ size * 95, y+size*35, size * 20, size * 10);
    }
    
    public void health(Graphics g)
    {
        
        
        
        
    }
    
    /**
     * Mutator Methods
     */
    
    /**
     * toString
     */
    public String toString(){
        return "x coor: " + x + " y coord: " + y + " size: " + size;
    }
}
