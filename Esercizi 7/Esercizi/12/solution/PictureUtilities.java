import java.awt.Color;

public class PictureUtilities
{
   /**
      Create a greenscreen picture
      @param pic1 the first Picture
      @param pic2 the second Picture
      @return a picture as described below.

      -  The returned picture should be the
         larger of the two widths and heights.
      -  Where the pictures overlap, use the pixels from pic1,
         unless the pixel is "green". Then use the pixel from pic2.
      -  A pixel is "green" if the green value is > 125% of the
         average pixel value.
      -  Use the Picture(int width, int height) constructor
   */
   public static Picture greenscreen(Picture pic1, Picture pic2)
   {
      int p1X = pic1.getWidth();
      int p2X = pic2.getWidth();
      int p1Y = pic1.getHeight();
      int p2Y = pic2.getHeight();

      int width = Math.max(p1X, p2X);
      int height = Math.max(p1Y, p2Y);

      Picture result = new Picture(width, height);

      for (int x = 0; x < width; x++)
      {
         for (int y = 0; y < height; y++)
         {
            if (x < p1X && x < p2X && y < p1Y && y < p2Y)
            {
               Color c = pic1.getColorAt(x, y);
               int avg = (c.getRed() + c.getGreen() + c.getBlue()) / 3;
               if (c.getGreen() > avg * 1.25)
               {
                   result.setColorAt(x, y, pic2.getColorAt(x, y));
               }
               else
               {
                  result.setColorAt(x, y, pic1.getColorAt(x, y));
               }
            }
            else if (x < p1X && y < p1Y)
            {
               result.setColorAt(x, y, pic1.getColorAt(x, y));
            }
            else if (x < p2X && y < p2Y)
            {
               result.setColorAt(x, y, pic2.getColorAt(x, y));
            }
         }
      }

      return result;
    }
}
