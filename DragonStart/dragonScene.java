package DragonStart;
import java.awt.*;


/**
 * Write a description of class dragonScene here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class dragonScene extends TestClass
{
    // instance variables - replace the example below with your own
    private int x;
    private Color c;
    private int width;
    private int height;
    private Color horizonColor;
    private Color groundColor;
    private Color sunColor;
    

    /**
     * Constructor for objects of class dragonScene
     */
    public dragonScene()
    {
        // initialise instance variables
        x = 0;
        c = Color.CYAN;
        horizonColor = Color.CYAN;
        groundColor = Color.GREEN;
        sunColor = Color.YELLOW;
    }
    
    public dragonScene(int width, int height)
    {
        this.width = width;
        this.height = height;
        horizonColor = Color.CYAN;
        groundColor = Color.GREEN;
        sunColor = Color.YELLOW;
    }
    
    public void drawScene(Graphics g)
    {
        g.setColor(c);
        g.fillRect(0,0,800,800);
        g.setColor(groundColor);
        g.fillRect(6,500,800, 300);
    }
    
  
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
