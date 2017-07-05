//drawing a rectangle inside a Jframe
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author risper
 */

class RectanleComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        //2D dimmension
        Graphics2D g2 =(Graphics2D) g;
        //rectangle measurements
        Rectangle box = new Rectangle(10,26,20,50);
        //draw rectangle
        g2.draw(box);
        
        
    }
    
}


public class rectangleInFrame
{
    public static void main(String[] args)
    {
       //construct objectof the Jframe
        JFrame frame = new JFrame();
        //set size
        frame.setSize(1000,1000);
        //set title
        frame.setTitle("RECTANGLE");
        //set default close operation to exit the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //make the frame visible
        frame.setVisible(true);
        
        
        
    }
    
    
}
