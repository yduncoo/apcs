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

public class SampleGraphics
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
        //  before attempting to draw on it
        try {Thread.sleep(400);} catch (Exception e) {}
      
        here:
            // graphic loop reset
            for(int a = 0; a == 0;)
            {
                g.setColor(new Color(135,206,235)); // background color

                g.fillRect(0,0,800,600);   // fills background
        
                g.setColor(new Color(212,255,253)); // snowglobe color
               
                g.fillArc(150,260,500,500,0,180); // fills snowglobe (arc)
        
                g.setColor(new Color(171,91,0)); // base color
               
                // draw a base of snowglobe (trapezoid)
                Polygon base = new Polygon(); //top line corner 1 & 2, bottom line corner 3 & 4
                base.addPoint(150,510); // corner 1
                base.addPoint(125,600); // corner 3
                base.addPoint(675,600); // corner 4
                base.addPoint(650,510); //corner 2
        
                g.fillPolygon(base); // fills base
        
                g.setColor(Color.WHITE); // snowman color
        
                g.fillOval(410,410,100,100); // bottom snowman ball
                g.fillOval(425,370,70,70); // middle snowman ball
                g.fillOval(440,340,40,40); // top snowman ball
        
                g.setColor(Color.ORANGE); // carrot nose color
        
                Polygon nose = new Polygon();
                nose.addPoint(420,353);
                nose.addPoint(445,360);
                nose.addPoint(445,350);
        
                g.fillPolygon(nose); // fills nose
        
                g.setColor(Color.BLACK);
        
                g.fillRect(450,310,20,30); // top hat
                g.fillRect(440,335,40,10);
        
                g.fillOval(450,350,7,7); // eye
        
                g.fillOval(455,380,7,7); // button top
                g.fillOval(455,390,7,7); // button middle
                g.fillOval(455,400,7,7); // button bottom
        
                g.drawArc(150,260,500,500,0,180); // snowglobe outline
        
                Polygon oBase = new Polygon();
                oBase.addPoint(150,510); // corner 1
                oBase.addPoint(125,600); // corner 3
                oBase.addPoint(675,600); // corner 4
                oBase.addPoint(650,510); //corner 2
        
                g.drawPolygon(oBase); // outlines base
        
                g.setColor(Color.GREEN);
        
                g.fillRect(270,400,100,109); // present box
        
                g.setColor(Color.RED);
        
                g.fillRect(310,400,20,109); // present ribbon
        
                Polygon bow = new Polygon();
                bow.addPoint(305,385);
                bow.addPoint(300,390);
                bow.addPoint(305,395);
                bow.addPoint(320,400);
                bow.addPoint(335,395);
                bow.addPoint(340,390);
                bow.addPoint(335,385);
                bow.addPoint(320,395);
        
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

                        g.fillOval(x, y, 3, 3);
                        g.drawOval(x + flake1, y + flake2, 4, 4); // ensures every snow flake is "unique"

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