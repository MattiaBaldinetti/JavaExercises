import java.util.Scanner;

public class NumOrderInt
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter three numbers: ");
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();

      if (a < b && b < c)
      {
         System.out.println("in order");
      }
      else if (a > b && b > c)
      {
         System.out.println("in order");
      }
      else
      {
         System.out.println("not in order");
      }
   }
}
