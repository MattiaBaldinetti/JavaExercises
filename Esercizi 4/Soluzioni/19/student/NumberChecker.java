import java.util.Scanner;

/**
   This program checks whether two floating-point numbers
   are almost the same.
*/
public class NumberChecker
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter two floating-point numbers: ");
      double x1 = in.nextDouble();
      double x2 = in.nextDouble();

      Comparer c = new Comparer(2);
      if (c.areSame(x1, x2))
      {
         System.out.println("They are the same up to two decimal places.");
      }
      else
      {
         System.out.println("They are different.");
      }
   }
}
