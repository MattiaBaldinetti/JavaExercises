import javax.swing.*;
import java.awt.Color;

/**
   This class demonstrates the brighter method of the Color class.
 */
public class BrighterDemo
{
	public static void main(String[] args)
	{
	   JFrame frame = new JFrame();
	   frame.setSize(200, 200);
	   Color myColor = ...;
	   frame.getContentPane().setBackground(myColor);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setVisible(true);
	}
}
