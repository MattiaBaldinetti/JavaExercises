//HIDE
//OUT frame.png
/**
   Replacement for javax.swing.JFrame in student programs for
   saving the output to a file. Can be put in codecheck if
   the student program has import javax.swing.*.
   Modified 6/16/2015 by Stephen Gilbert
   Used code from BJLO Canvas.java as a model for saving the picture.
*/

import java.awt.image.BufferedImage;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.Icon;


public class JFrame
{
   private Dimension size = new Dimension(0, 0);
   private ArrayList<Component> components = new ArrayList<Component>();
   public static final int EXIT_ON_CLOSE = 0;

   public void setSize(int width, int height)
   {
      size = new Dimension(width, height);
   }

   public void setDefaultCloseOperation(int op) {}

   public void setTitle(String str) { }
   public void pack() { }

   public void add(Component c) { components.add(c); }

   public void setVisible(boolean b) {}

   public JFrame()
   {
      final String SAVEFILE ="frame.png";
      final Thread currentThread = Thread.currentThread();
      Thread watcherThread = new Thread()
      {
          public void run()
          {
              try
              {
                  final int DELAY = 10;

                  while (currentThread.getState() != Thread.State.TERMINATED)
                  {
                      Thread.sleep(DELAY);
                  }
                  saveToDisk(SAVEFILE);
              }
              catch (Exception ex)
              {
                  ex.printStackTrace();
              }
          }
      };
      watcherThread.start();
   }

   private void saveToDisk(String fileName)
   {
      Icon icon = ((JLabel)(components.get(0))).getIcon();
      Rectangle rect = new java.awt.Rectangle(0, 0, icon.getIconWidth(), icon.getIconHeight());
      BufferedImage image = new BufferedImage(rect.width, rect.height, BufferedImage.TYPE_INT_RGB);
      Graphics2D g = (Graphics2D) image.getGraphics();
      g.setColor(java.awt.Color.WHITE);
      g.fill(rect);
      g.setColor(java.awt.Color.BLACK);
      icon.paintIcon(new JComponent(){}, g, 0, 0);
      try
      {
         String extension = fileName.substring(fileName.lastIndexOf('.') + 1);
         ImageIO.write(image, extension, new File(fileName));
      }
      catch(Exception e)
      {
         System.err.println("Was unable to save the image to " + fileName);
         e.printStackTrace();
      }
      g.dispose();
   }
}
