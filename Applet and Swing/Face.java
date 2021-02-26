//Java program to draw figure using swing.

import java.awt.*;  
import javax.swing.*;  
  
public class Face extends Canvas
{        
    public void paint(Graphics g) 
    {  
        // Oval for face outline 
        g.setColor(Color.YELLOW);
        g.fillOval(40, 40, 200, 200);
        g.setColor(Color.GRAY);
        g.drawOval(40, 40, 200, 200);

        // Oval for eye outline
        g.setColor(Color.GRAY);
        g.drawOval(60, 85, 60, 30);
        g.drawOval(160, 85, 60, 30);

        // Oval for ear outline
        g.setColor(Color.YELLOW);
        g.fillOval(16, 105, 26, 40);
        g.fillOval(238, 105, 26, 40);
        g.setColor(Color.GRAY);
        g.drawOval(16, 105, 26, 40);
        g.drawOval(238, 105, 26, 40);

        // Oval for eyeballs
        g.setColor(Color.BLACK);
        g.fillOval(75, 91, 30, 20);
        g.fillOval(175, 91, 30, 20);
        
        // Oval for nose outline
        g.setColor(Color.RED);
        g.fillOval(120, 140, 40, 40);
        g.setColor(Color.GRAY);
        g.drawOval(120, 140, 40, 40);

        // Arc for lip outline
        g.setColor(Color.YELLOW);
        g.fillArc(100, 175, 100, 50, 180, 180);
        g.setColor(Color.BLACK);
        g.fillArc(90, 175, 100, 50, 180, 180);
    }  
    public static void main(String[] args)
    {  
        Face m=new Face();
        JFrame f=new JFrame("Figure using Swing");  
        f.add(m);  
        f.setSize(400,400); 
        f.setVisible(true);  
    }  
} 