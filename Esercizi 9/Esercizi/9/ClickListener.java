import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
   An action listener that prints a message.
*/
public class ClickListener implements ActionListener
{
   private String name;

   public ClickListener(String theName)
   {
      name = theName;
   }

   public void actionPerformed(ActionEvent event)
   {
      System.out.println("Button " + name + " was clicked!");
   }
}
