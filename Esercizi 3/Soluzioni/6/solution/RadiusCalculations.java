import java.util.Scanner;

public class RadiusCalculations
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter a radius: ");
      double radius = in.nextDouble();

      System.out.println("Area of circle:" + (Math.PI * Math.pow(radius, 2)));
      System.out.println("Circumference of circle: " + (2 * Math.PI * radius));

      System.out.println("Volume of sphere: "
            + (4.0 / 3.0 * Math.PI * Math.pow(radius, 3)));
      System.out.println("Surface area of sphere: "
            + (4.0 * Math.PI * Math.pow(radius, 2)));
   }
}
