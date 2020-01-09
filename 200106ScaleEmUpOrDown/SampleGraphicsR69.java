/*
 * Sample Graphics
 *
 * Since we have a few days to fill till Christmas break, let's dip our toes
 * into graphics.  Blue Pelican has nothing, Head First...has too much, so use
 * the internet as your reference, and look up the commands below, or just
 * play with it to figure out what they do.
 *
 * Then, draw a Christmas tree.  Or a snowflake?  Or something else holiday-/
 * vacation-/gonna-get-sleep-soon-related.
 */
import javax.swing.*;  // for JFrame
import java.awt.*;     // for Graphics and Container
public class SampleGraphicsR69
{  
    public static void main (String[] args)
    {
        JFrame win;                 // JFrame Graphics setup
        Container contentPane;
        Graphics g;
      
        win = new JFrame("My First Graphics");  // window setup
        int winSizeX = 552;
        int winSizeY = 413;
        win.setSize(winSizeX,winSizeY);
        win.setLocation(100,100);
        win.setVisible(true);
      
        contentPane = win.getContentPane();   // activates graphics in window
        g = contentPane.getGraphics();
      
        //  If you get a blank window, your computer's speed (lack thereof?)
        //  requires this delay in order to give the window time to appear
        //  before attempting to draw on it
        try {Thread.sleep(400);} catch (Exception e) {}
      
        here:
            // graphic loop reset
            for(int a = 0; a == 0;)
            {
                g.setColor(new Color(135,206,235)); // background color
                g.fillRect(0,0,552,413);   // fills background
        
                g.setColor(new Color(212,255,253)); // snowglobe color
               
                g.fillArc(103,179,345,345,0,180); // fills snowglobe (arc)
        
                g.setColor(new Color(171,91,0)); // base color
               
                // draw a base of snowglobe (trapezoid)
                Polygon base = new Polygon(); //top line corner 1 & 2, bottom line corner 3 & 4
                base.addPoint(103,351); // corner 0
                base.addPoint(86,413); // corner 2
                base.addPoint(465,413); // corner 2
                base.addPoint(448,351); //corner 1
        
                g.fillPolygon(base); // fills base
        
                g.setColor(Color.WHITE); // snowman color
        
                g.fillOval(282,282,69,69); // bottom snowman ball
                g.fillOval(293,255,48,48); // middle snowman ball
                g.fillOval(303,234,27,27); // top snowman ball
        
                g.setColor(Color.ORANGE); // carrot nose color
        
                Polygon nose = new Polygon();
                nose.addPoint(289,243);
                nose.addPoint(307,248);
                nose.addPoint(307,241);
        
                g.fillPolygon(nose); // fills nose
        
                g.setColor(Color.BLACK);
        
                g.fillRect(310,213,13,20); // top hat
                g.fillRect(303,231,27,6);
        
                g.fillOval(310,241,4,4); // eye
        
                g.fillOval(313,262,4,4); // button top
                g.fillOval(313,269,4,4); // button middle
                g.fillOval(313,276,4,4); // button bottom
        
                g.drawArc(103,179,345,345,0,180); // snowglobe outline
        
                Polygon oBase = new Polygon();
                oBase.addPoint(103,351); // corner 0
                oBase.addPoint(86,413); // corner 2
                oBase.addPoint(465,413); // corner 2
                oBase.addPoint(448,351); //corner 1
        
                g.drawPolygon(oBase); // outlines base
        
                g.setColor(Color.GREEN);
        
                g.fillRect(186,276,69,75); // present box
        
                g.setColor(Color.RED);
        
                g.fillRect(213,276,13,75); // present ribbon
        
                Polygon bow = new Polygon();
                bow.addPoint(210,265);
                bow.addPoint(206,269);
                bow.addPoint(210,272);
                bow.addPoint(220,276);
                bow.addPoint(231,272);
                bow.addPoint(234,269);
                bow.addPoint(231,265);
                bow.addPoint(220,272);
        
                g.fillPolygon(bow); // fills bow
        
                // snow section
                g.setColor(Color.WHITE);
        
                int reset = 0;
                // snow loop
                for(int i = 0; i < winSizeX + 0; i++)
                {
                    for(int j = 0; j < winSizeY + 0; j++)
                    {
                        try {Thread.sleep(100);} catch (Exception e) {}
                        int x = (int)(winSizeX * Math.random());
                        int y = (int)(winSizeY * Math.random());
                        int flakeX = 1;
                        int flip1 = (int)(10 * Math.random()); // coin flip for x offset
                        if (flip1 < 5)
                        {
                            flakeX = -1;
                        }
                        int flakeY = 1;
                        int flip2 = (int)(10 * Math.random()); // coin flip for y offset
                        if (flip2 < 5)
                        {
                            flakeY = -1;
                        }
                        g.fillOval(x, y, 2, 2);
                        g.drawOval(x + flakeX, y + flakeY, 2, 2); // ensures every snow flake is "unique"
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
