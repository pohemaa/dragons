package DragonStart;

import java.awt.*;
import java.lang.String;

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
    private String s;
    

    /**
     * Default Constructor for objects of class Dragon
     */
    public Dragon()
    {
        // initialise instance variables
        x = 50;
        y = 50;
        size = 1;
        c = Color.RED;
        health = 25;
        s = "Hello";
    }
    
    /**
     * Overloaded Constructors go here
     */
    public Dragon(int x, int y, int size, Color c, int health, String s){
        this.x = 50;
        this.y = 50;
        this.size = 1;
        this.c = c;
        this.health = 25;
        this.s = "Hello";
        
        
    }

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
        g.setColor(Color.WHITE);
        g.fillRect(x, y + size * 13, size * 12, size * 10); //draw mouth
        g.setColor(c);
        g.fillRect(x + size * 25, (y + size *25) + size * 50, size * 10, size * 25); //draw leg1
        g.fillRect(x + size * 75, (y + size *25) + size * 50, size * 10, size * 25); //draw leg2
        g.setColor(Color.BLACK);
        g.fillArc(x + size * 5 ,y + size * 10,90,50,0,90); //draw wings
        g.setColor(c);
        g.fillRect(x+ size * -150, y+size*130, size * 100, size * 10);
        g.fillOval(x + size * -25, y +size*100, size * 40, size * 40); //draw cookie
        g.setColor(Color.BLUE); //set text box to blue
        g.drawRect(x - 35, y - 25, size * 90, size * 25); //draw text box
        g.setColor(Color.BLACK);
        g.drawRect(x + size * -150, y+size*130, size * 100, size * 10);
        g.setColor(Color.GREEN);
        g.fillRect(x + size * -149, y+size * 130, size * health, size * 9);
        
        
       
    }
    
    public void health(Graphics g)
    {
        
        
        
        
    }
     public void speak(String s, Graphics g){
         Font currentFont = g.getFont(); //get the current font
         Font newFont = currentFont.deriveFont(currentFont.getSize() * 1.6F); //and increase the size
         g.setFont(newFont); //then change the old font to the increased size
         g.setColor(Color.BLUE); //set the text color to blue
         g.drawString(s, 40, 45); //what will be printed in the text box and what x and y coordinates
         
         
      }
    public void Fire(Graphics g){
        
        
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
