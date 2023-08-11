import java.util.Scanner;

public class NumDigits
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter an integer number: ");
      long num = in.nextLong();

      if (num < 0)
      {
         num = num * -1;
      }

      int digits;

      if (num > 999999999)
      {
         digits = 10;
      }
      else if (num > 99999999)
      {
         digits = 9;
      }
      else if (num > 9999999)
      {
         digits = 8;
      }
      else if (num > 999999)
      {
         digits = 7;
      }
      else if (num > 99999)
      {
         digits = 6;
      }
      else if (num > 9999)
      {
         digits = 5;
      }
      else if (num > 999)
      {
         digits = 4;
      }
      else if (num > 99)
      {
         digits = 3;
      }
      else if (num > 9)
      {
         digits = 2;
      }
      else
      {
         digits = 1;
      }

      System.out.println("The number " + num + " has " + digits + " digits.");
   }
}
