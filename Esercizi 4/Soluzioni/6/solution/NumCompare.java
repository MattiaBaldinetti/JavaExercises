import java.util.Scanner;

public class NumCompare
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter three numbers: ");
      double a = in.nextDouble();
      double b = in.nextDouble();
      double c = in.nextDouble();

      if (a == b && b == c)
      {
         System.out.println("all the same");
      }
      else if (a != b && b != c && c != a)
      {
         System.out.println("all different");
      }
      else
      {
         System.out.println("neither");
      }

   }
}
