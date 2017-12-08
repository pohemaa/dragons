package DragonStart;

import java.awt.*;
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
   public static void main(String args[]){
       DrawingPanel panel = new DrawingPanel(800,800);
       Graphics g = panel.getGraphics();
       
       Dragon jen = new Dragon(100, 100, 1, Color.BLACK);
       
       jen.drawDragon(g);
     
       System.out.println(jen);
       
       Dragon sarag = new Dragon(300,300,2, Color.PINK);
       sarag.drawDragon(g);
    }
}
