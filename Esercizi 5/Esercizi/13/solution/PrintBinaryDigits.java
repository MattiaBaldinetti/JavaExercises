import java.util.Scanner;

public class PrintBinaryDigits
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number to print in binary: ");
      int number = in.nextInt();

      while (number != 0)
      {
         System.out.println(number % 2);
         number = number / 2;
      }
   }
}