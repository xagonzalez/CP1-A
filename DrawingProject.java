import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;    
import javax.swing.*;

public class DrawingProject extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
        
        Rectangle rectangle = new Rectangle(10, 10, 1425, 885);
        g2.draw(rectangle);

        
        Rectangle square = new Rectangle(301, 300, 500, 500);
        
        g2.setColor(Color.gray);
        g2.fill(square);

	Ellipse2D.Double circle = new Ellipse2D.Double(500, 480, 200, 200);
		
	g2.setColor(Color.lightGray);
	g2.fill(circle);
        
	Ellipse2D.Double circle1 = new Ellipse2D.Double(540, 520, 120, 120);
		
	g2.setColor(Color.darkGray);
	g2.fill(circle1);
	
	 Rectangle square1 = new Rectangle(575, 550, 50, 50);
        g2.setColor(Color.black);
        g2.fill(square1);

 	Rectangle square2 = new Rectangle(320, 310, 75, 75);
        g2.setColor(Color.white);
        g2.fill(square2);

 	Rectangle square3 = new Rectangle(660, 252, 80, 50);
        g2.setColor(Color.lightGray);
        g2.fill(square3);
	}
} 
