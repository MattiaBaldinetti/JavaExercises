import java.util.Scanner;

public class NumberInt
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter a number: ");
      int i = in.nextInt();

      if (i < 0)
      {
         System.out.println("It's a negative number.");
      }
      else if (i == 0)
      {
         System.out.println("It's a zero.");
      }
      else
      {
         System.out.println("It's a positive number.");
      }

   }
}
