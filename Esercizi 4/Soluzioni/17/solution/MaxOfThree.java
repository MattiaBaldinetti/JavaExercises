import java.util.Scanner;
/**
 * Read three floating-point numbers and print
 * the largest of the three.
 */
public class MaxOfThree
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Please enter three numbers: ");
      double x = in.nextDouble();
      double y = in.nextDouble();
      double z = in.nextDouble();

      double largest = 0;

      if (x > y)
      {
         if (z > x)
         {
            largest = z;
         }
         else
         {
            largest = x;
         }
      }
      else
      {
         if (z > y)
         {
            largest = z;
         }
         else
         {
            largest = y;
         }
      }
      System.out.println("The largest number is " + largest + ".");
   }
}
