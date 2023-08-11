import java.util.Set;
import java.util.TreeSet;
/**
   A demo class to compare LabeledPoint class implementation.
   Insert the LabeledPoints in a TreeSet.
*/
public class LabeledPointDemo
{

   public static void main(String[] args)
   {
      LabeledPoint p1 = new LabeledPoint(10, 45, "Fred");
      LabeledPoint p2 = new LabeledPoint(45, 10, "Amy");
      LabeledPoint p3 = new LabeledPoint(10, 45, "Beth");
      LabeledPoint p4 = new LabeledPoint(10, 33, "Carolyn");
      LabeledPoint p5 = new LabeledPoint(11, 55, "Fred");
      LabeledPoint p6 = new LabeledPoint(11, 55, "Fred");

      // Insert the LabeledPoints in a TreeSet
      Set<LabeledPoint> pointSet = new TreeSet<>();
      pointSet.add(p1);
      pointSet.add(p2);
      pointSet.add(p3);
      pointSet.add(p4);
      pointSet.add(p5);
      pointSet.add(p6);

      System.out.println("In order, one per line, the TreeSet contains: ");
      for (LabeledPoint p : pointSet)
      {
         System.out.println(p);
      }
   }
}
