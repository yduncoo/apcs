/*
 * Sample Graphics
 *

 * into graphics.  Blue Pelican has nothing, Head First...has too much, so use
 * the internet as your reference, and look up the commands below, or just
 * play with it to figure out what they do.
 *

 * vacation-/gonna-get-sleep-soon-related.
 */

import javax.swing.*;  // for JFrame
import java.awt.*;     // for Graphics and Container

public class SampleGraphicsx2
{  
    public static void main (String[] args)
    {
        JFrame win;                 // JFrame Graphics setup
        Container contentPane;
        Graphics g;
      
        win = new JFrame("My First Graphics");  // window setup
        win.setSize(800,600);
        win.setLocation(100,100);
        win.setVisible(true);
      
        contentPane = win.getContentPane();   // activates graphics in window
        g = contentPane.getGraphics();
      
        //  If you get a blank window, your computer's speed (lack thereof?)
        //  requires this delay in order to give the window time to appear

        try {Thread.sleep(400);} catch (Exception e) {}
      
        here:
            // graphic loop reset
            for(int a = 0; a == 0;)
            {
                g.setColor(new Color(135,206,235)); // background color


        
                g.setColor(new Color(212,255,253)); // snowglobe color
               

        
                g.setColor(new Color(171,91,0)); // base color
               

                Polygon base = new Polygon(); //top line corner 1 & 2, bottom line corner 3 & 4




        

        
                g.setColor(Color.WHITE); // snowman color
        



        
                g.setColor(Color.ORANGE); // carrot nose color
        
                Polygon nose = new Polygon();



        

        
                g.setColor(Color.BLACK);
        


        

        



        

        
                Polygon oBase = new Polygon();




        

        
                g.setColor(Color.GREEN);
        

        
                g.setColor(Color.RED);
        

        
                Polygon bow = new Polygon();








        

        
                // snow section
                g.setColor(Color.WHITE);
        
                int reset = 0;

                // snow loop
                for(int i = 0; i < 801; i++)
                {
                    for(int j = 0; j < 601; j++)
                    {
                        try {Thread.sleep(100);} catch (Exception e) {}

                        int x = (int)(800 * Math.random());
                        int y = (int)(600 * Math.random());

                        int flake1 = 1;
                        int flip1 = (int)(10 * Math.random()); // coin flip for x offset
                        if (flip1 < 5)
                        {
                            flake1 = -1;
                        }

                        int flake2 = 1;
                        int flip2 = (int)(10 * Math.random()); // coin flip for y offset
                        if (flip2 < 5)
                        {
                            flake2 = -1;
                        }




                        reset++;
                        if(reset == 500) // resets at 500 snowflakes
                        {
                            continue here;
                        }
                    }
                }
            }
   }
}
