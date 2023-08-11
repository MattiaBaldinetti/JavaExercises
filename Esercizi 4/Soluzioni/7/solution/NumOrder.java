import java.util.Scanner;

public class NumOrder
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter three numbers: ");
      double a = in.nextDouble();
      double b = in.nextDouble();
      double c = in.nextDouble();

      if (a < b && b < c)
      {
         System.out.println("Increasing!");
      }
      else if (a > b && b > c)
      {
         System.out.println("Decreasing!");
      }
      else
      {
         System.out.println("Neither!");
      }
   }
}
