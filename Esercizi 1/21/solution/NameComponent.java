import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;


/**
   Draws a name in red inside a blue rectangle.
*/
public class NameComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;

      String message ="Your Name";
	
      // draw the blue rectangle

      Rectangle box = new Rectangle(10, 10, 250, 50);
      g2.setColor(Color.BLUE);
      g2.fill(box);
		
      // draw the name inside the rectangle

   	g2.setColor(Color.RED);
      g2.drawString(message, 20, 30);
   }
}
