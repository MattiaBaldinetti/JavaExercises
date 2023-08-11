import java.util.Scanner;

public class NumberDoubleAbs
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter a floating-point number: ");
      double i = in.nextDouble();

      String abs = "";
      if (Math.abs(i) < 1.0)
      {
         abs = "small";
      }

      if (Math.abs(i) > 1000000.0)
      {
         abs = "large";
      }

      if (i == 0)
      {
         System.out.println("It's a zero.");
      }
      else if (i > 0)
      {
         System.out.println("It's a " + abs + " positive number.");

      }
      else
      {
         System.out.println("It's a " + abs + " negative number.");

      }
   }
}
