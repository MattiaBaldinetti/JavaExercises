import java.util.Scanner;

public class RectangleCalculations
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Please enter width of rectangle: ");
      double width = in.nextDouble();

      System.out.print("Please enter height of rectangle: ");
      double height = in.nextDouble();

      System.out.println("Area of rectangle: " + (width * height));
      System.out.println("Perimeter of rectangle: " + (2 * width + 2 * height));

      double diagonalLength = Math.sqrt(Math.pow(width, 2)
            + Math.pow(height, 2));
      System.out.println("Length of diagonal: " + diagonalLength);
   }
}
