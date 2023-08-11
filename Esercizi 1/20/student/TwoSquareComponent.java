import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
. . .

public class TwoSquareComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      . . .
   }
}
