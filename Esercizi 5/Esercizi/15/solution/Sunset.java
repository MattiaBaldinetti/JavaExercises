import java.awt.Color;

public class Sunset
{
   public static void main(String[] args)
   {
      Picture pic = new Picture();
      pic.load("queen-mary.png");
      for (int x = 0; x < pic.getWidth(); x++)
      {
         for (int y = 0; y < pic.getHeight(); y++)
         {
            Color original = pic.getColorAt(x, y);
            int green = original.getGreen();
            green = Math.min((int)(green * 1.3), 255);
            Color sunset = new Color(original.getRed(),
               green,
               original.getBlue());
            pic.setColorAt(x, y, sunset);
         }
      }
   }
}
