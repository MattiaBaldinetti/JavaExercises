import java.util.Objects;
/**
   A labeled point has x- and y-coordinates and a string label.
*/
public class LabeledPoint
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

   /**
      Returns the hashcode for this object.
      @return the hashcode
   */
   public int hashCode()
   {
      return Objects.hash(x, y, label);
   }

   /*
      Two labeled points considered the same when they
      have the same location and label.
      @param o the object to compare this to.
   */
   public boolean equals(Object o)
   {
      if (o == this) return true; // same object
      if (o == null || o.getClass() != this.getClass()) return false;

      LabeledPoint other = (LabeledPoint) o;

      return label.equals(other.getLabel()) &&
         x == other.getX() &&
         y == other.getY();
   }

   /**  @return the label */
   public String getLabel() { return label; }

   /**  @return the x-coordinate */
   public int getX() { return x; }

   /**  @return the y-coordinate */
   public int getY() { return y; }

   @Override
   public String toString()
   {
      return  getClass().getName() + "[label=" + label
         + ", x=" + x + ", y=" + y + "]";
   }
}
