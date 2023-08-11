/**
   A tester class to compare LabeledPoint class implementation.
*/
public class LabeledPointTester
{
   public static void main(String[] args)
   {
      LabeledPoint p1 = new LabeledPoint(10, 45, "point1");
      LabeledPoint p2 = new LabeledPoint(45, 10, "point2");
      LabeledPoint p3 = new LabeledPoint(33, 45, "point3");
      LabeledPoint p4 = new LabeledPoint(10, 33, "point4");
      LabeledPoint p5 = new LabeledPoint(11, 55, "point1");
      LabeledPoint p6 = new LabeledPoint(11, 55, "point1");

      // different x, y, and label
      System.out.println(p1.equals(p2));
      System.out.println("Expected: false");

      // same y, different x and label
      System.out.println(p1.equals(p3));
      System.out.println("Expected: false");

      // same x, different y and label
      System.out.println(p1.equals(p4));
      System.out.println("Expected: false");

      // same label, different x and y
      System.out.println(p1.equals(p5));
      System.out.println("Expected: false");

      // same x, y, and label
      System.out.println(p5.equals(p6));
      System.out.println("Expected: true");
      System.out.println(p5.getLocation().equals(p6.getLocation()));
      System.out.println("Expected: true");

      // same x, y, and label
      System.out.println(p5.hashCode() == p6.hashCode());
      System.out.println("Expected: true");

      // same point
      System.out.println(p3.equals(p3));
      System.out.println("Expected: true");
   }
}
