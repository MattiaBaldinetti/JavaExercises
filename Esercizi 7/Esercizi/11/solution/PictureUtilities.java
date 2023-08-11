import java.awt.Color;

public class PictureUtilities
{
    public static Picture superimpose(Picture pic1, Picture pic2)
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
                    // average the pixel here
                    Color c1 = pic1.getColorAt(x, y);
                    Color c2 = pic2.getColorAt(x, y);
                    Color avg = new Color((c1.getRed() + c2.getRed()) / 2,
                                          (c1.getGreen() + c2.getGreen()) / 2,
                                          (c1.getBlue() + c2.getBlue()) / 2);
                    result.setColorAt(x, y, avg);
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
