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
public class SampleGraphicsM125
{  
    public static void main (String[] args)
    {
        JFrame win;                 // JFrame Graphics setup
        Container contentPane;
        Graphics g;
      
        win = new JFrame("My First Graphics");  // window setup
        int winSizeX = 1000;
        int winSizeY = 750;
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
                g.fillRect(0,0,1000,750);   // fills background
        
                g.setColor(new Color(212,255,253)); // snowglobe color
               
                g.fillArc(187,325,625,625,0,180); // fills snowglobe (arc)
        
                g.setColor(new Color(171,91,0)); // base color
               
                // draw a base of snowglobe (trapezoid)
                Polygon base = new Polygon(); //top line corner 1 & 2, bottom line corner 3 & 4
                base.addPoint(187,637); // corner 1
                base.addPoint(156,750); // corner 3
                base.addPoint(843,750); // corner 5
                base.addPoint(812,637); //corner 2
        
                g.fillPolygon(base); // fills base
        
                g.setColor(Color.WHITE); // snowman color
        
                g.fillOval(512,512,125,125); // bottom snowman ball
                g.fillOval(531,462,87,87); // middle snowman ball
                g.fillOval(550,425,50,50); // top snowman ball
        
                g.setColor(Color.ORANGE); // carrot nose color
        
                Polygon nose = new Polygon();
                nose.addPoint(525,441);
                nose.addPoint(556,450);
                nose.addPoint(556,437);
        
                g.fillPolygon(nose); // fills nose
        
                g.setColor(Color.BLACK);
        
                g.fillRect(562,387,25,37); // top hat
                g.fillRect(550,418,50,12);
        
                g.fillOval(562,437,8,8); // eye
        
                g.fillOval(568,475,8,8); // button top
                g.fillOval(568,487,8,8); // button middle
                g.fillOval(568,500,8,8); // button bottom
        
                g.drawArc(187,325,625,625,0,180); // snowglobe outline
        
                Polygon oBase = new Polygon();
                oBase.addPoint(187,637); // corner 1
                oBase.addPoint(156,750); // corner 3
                oBase.addPoint(843,750); // corner 5
                oBase.addPoint(812,637); //corner 2
        
                g.drawPolygon(oBase); // outlines base
        
                g.setColor(Color.GREEN);
        
                g.fillRect(337,500,125,136); // present box
        
                g.setColor(Color.RED);
        
                g.fillRect(387,500,25,136); // present ribbon
        
                Polygon bow = new Polygon();
                bow.addPoint(381,481);
                bow.addPoint(375,487);
                bow.addPoint(381,493);
                bow.addPoint(400,500);
                bow.addPoint(418,493);
                bow.addPoint(425,487);
                bow.addPoint(418,481);
                bow.addPoint(400,493);
        
                g.fillPolygon(bow); // fills bow
        
                // snow section
                g.setColor(Color.WHITE);
        
                int reset = 0;
                // snow loop
                for(int i = 0; i < winSizeX + 1; i++)
                {
                    for(int j = 0; j < winSizeY + 1; j++)
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
                        g.fillOval(x, y, 3, 3);
                        g.drawOval(x + flakeX, y + flakeY, 5, 5); // ensures every snow flake is "unique"
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
