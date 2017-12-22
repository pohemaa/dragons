package DragonStart;

import java.awt.*;
import java.lang.String;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
   public static void main(String args[]) throws InterruptedException{
       DrawingPanel panel = new DrawingPanel(800,800);
       Graphics g = panel.getGraphics();
       Scanner input = new Scanner(System.in);
       ArrayList<Dragon> dragons = new ArrayList<Dragon>();
       int num;
       do{
           System.out.println("How many dragons would you like to create");
           num = input.nextInt();
        }
        while(num <= 0);
        //Create correct number of Dragons.
        for(int i = 1; i<=num; i++){
            
       
       dragonScene d = new dragonScene();
       d.drawScene(g);
       Dragon jen = new Dragon();
       jen.speak("Hello", g);
       jen.drawDragon(g);
     
       System.out.println(jen);
       
       Dragon sarah = new Dragon();
       sarah.drawDragon(g);
       
       System.out.println(sarah);
       
       
       
    }
}
