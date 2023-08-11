/**
   A labeled point has x- and y-coordinates and a string label.
*/
public class LabeledPoint implements Comparable<LabeledPoint>
{
   private int x;
   private int y;
   private String label;

   /**
      Constructs a labeled point.
      @param x the x-coordinate
      @param y the y-coordinate
      @param label the string label for the point.
   */
   public LabeledPoint(int x, int y, String label)
   {
      this.x = x;
      this.y = y;
      this.label = label;
   }

   /*
      First sort by x coordinates, and if they are equal,
      sort by y coordinates, and if they are equal, then
      sort by the labels.
   */
   public int compareTo(LabeledPoint other)
   {
      if (x < other.x) return -1;
      else if (x > other.x) return 1;
      else if (y < other.y) return -1;
      else if (y > other.y) return 1;

      return label.compareTo(other.label);
   }

   /**
      @return the label
   */
   public String getLabel()
   {
      return label;
   }

   /**
      @return the x-coordinate
   */
   public int getX()
   {
      return x;
   }

   /**
      @return the y-coordinate
   */
   public int getY()
   {
      return y;
   }

   @Override
   public String toString()
   {
      return getClass().getName() + "[label=" + label + ", x="
        + x + ", y=" + y + "]";
   }
}
