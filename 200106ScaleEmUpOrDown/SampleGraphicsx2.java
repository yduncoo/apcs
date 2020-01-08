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
public class SampleGraphicsx2
{  
    public static void main (String[] args)
    {
        JFrame win;                 // JFrame Graphics setup
        Container contentPane;
        Graphics g;
      
        win = new JFrame("My First Graphics");  // window setup
        win.setSize(1600,1200);
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
                g.fillRect(0,0,1600,1200);   // fills background
        
                g.setColor(new Color(212,255,253)); // snowglobe color
               
                g.fillArc(300,520,1000,1000,0,360); // fills snowglobe (arc)
        
                g.setColor(new Color(171,91,0)); // base color
               
                // draw a base of snowglobe (trapezoid)
                Polygon base = new Polygon(); //top line corner 1 & 2, bottom line corner 3 & 4
                base.addPoint(300,1020); // corner 2
                base.addPoint(250,1200); // corner 6
                base.addPoint(1350,1200); // corner 8
                base.addPoint(1300,1020); //corner 4
        
                g.fillPolygon(base); // fills base
        
                g.setColor(Color.WHITE); // snowman color
        
                g.fillOval(820,820,200,200); // bottom snowman ball
                g.fillOval(850,740,140,140); // middle snowman ball
                g.fillOval(880,680,80,80); // top snowman ball
        
                g.setColor(Color.ORANGE); // carrot nose color
        
                Polygon nose = new Polygon();
                nose.addPoint(840,706);
                nose.addPoint(890,720);
                nose.addPoint(890,700);
        
                g.fillPolygon(nose); // fills nose
        
                g.setColor(Color.BLACK);
        
                g.fillRect(900,620,40,60); // top hat
                g.fillRect(880,670,80,20);
        
                g.fillOval(900,700,14,14); // eye
        
                g.fillOval(910,760,14,14); // button top
                g.fillOval(910,780,14,14); // button middle
                g.fillOval(910,800,14,14); // button bottom
        
                g.drawArc(300,520,1000,1000,0,360); // snowglobe outline
        
                Polygon oBase = new Polygon();
                oBase.addPoint(300,1020); // corner 2
                oBase.addPoint(250,1200); // corner 6
                oBase.addPoint(1350,1200); // corner 8
                oBase.addPoint(1300,1020); //corner 4
        
                g.drawPolygon(oBase); // outlines base
        
                g.setColor(Color.GREEN);
        
                g.fillRect(540,800,200,218); // present box
        
                g.setColor(Color.RED);
        
                g.fillRect(620,800,40,218); // present ribbon
        
                Polygon bow = new Polygon();
                bow.addPoint(610,770);
                bow.addPoint(600,780);
                bow.addPoint(610,790);
                bow.addPoint(640,800);
                bow.addPoint(670,790);
                bow.addPoint(680,780);
                bow.addPoint(670,770);
                bow.addPoint(640,790);
        
                g.fillPolygon(bow); // fills bow
        
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
                        g.fillOval(x, y, 6, 6);
                        g.drawOval(x + flake1, y + flake2, 8, 8); // ensures every snow flake is "unique"
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
