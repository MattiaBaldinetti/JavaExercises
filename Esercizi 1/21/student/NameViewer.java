import javax.swing.*;

/**
   Shows a frame that draws a name.
 */
public class NameViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 100);
      frame.setTitle("NameViewer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      NameComponent component = new NameComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
