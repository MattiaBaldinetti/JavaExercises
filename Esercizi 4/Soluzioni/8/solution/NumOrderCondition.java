import java.util.Scanner;

public class NumOrderCondition
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out
            .println("Enter S for strict ordering, L for lenient (S or L):");
      String answer = in.next();

      System.out.println("Enter three numbers: ");
      double a = in.nextDouble();
      double b = in.nextDouble();
      double c = in.nextDouble();

      if (answer.equals("S") || answer.equals("s"))
      {
         if (a < b && a < c)
         {
            if (b < c)
            {
               System.out.println("increasing");
            }
            else
            {
               System.out.println("neither");
            }
         }
         else if (a > b && a > c)
         {
            if (b > c)
            {
               System.out.println("decreasing");
            }
            else
            {
               System.out.println("neither");
            }
         }
         else
         {
            System.out.println("neither");
         }
      }
      else
      // Lenient ordering
      {
         if (a == b && a == c && b == c)
         {
            System.out.println("increasing and decreasing");
         }
         else if (a <= b && a <= c)
         {
            if (b <= c)
            {
               System.out.println("increasing");
            }
            else
            {
               System.out.println("neither");
            }
         }
         else if (a >= b && a >= c)
         {
            if (b >= c)
            {
               System.out.println("decreasing");
            }
            else
            {
               System.out.println("neither");
            }
         }
         else
         {
            System.out.println("neither");
         }
      }

   }
}
