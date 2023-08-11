import java.awt.Point;
import java.util.Objects;
/**
   A labeled point has x- and y-coordinates and a string label.
   This implementation uses the Java.awt Point class.
*/
public class LabeledPoint
{
   private Point p;
   private String label;

   /**
      Constructs a labeled point.
      @param x the x-coordinate
      @param y the y-coordinate
      @param label the string label for the point.
   */
   public LabeledPoint(int x, int y, String label)
   {
      p = new Point(x, y);
      this.label = label;
   }

   /**
      Returns the hashcode for this object.
      @return the hashcode
   */
   public int hashCode()
   {
      return Objects.hash(p, label);
   }

   /*
      Two labeled points considered the same when they
      have the same location and label.
      @param otherObject the object to compare this to.
   */
   public boolean equals(Object otherObject)
   {
      if (otherObject == this) return true; // same object
      if (otherObject == null ||
         otherObject.getClass() != this.getClass())
      {
         return false;
      }
      LabeledPoint other = (LabeledPoint) otherObject;

      return label.equals(other.getLabel()) &&
             p.equals(other.getLocation());
   }

   /**
      @return the label
   */
   public String getLabel()
   {
      return label;
   }

   /**
      @return the location
   */
   public Point getLocation()
   {
      return p;
   }

   @Override
   public String toString()
   {
      return  getClass().getName() + "[label=" + label
         + ", p=" + p + "]";
   }
}
