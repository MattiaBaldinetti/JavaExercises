import java.util.Scanner;

public class PrintWithCommas
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter an integer between 1000 and 999999: ");
      String number = in.next();
      String prefix = number.substring(0, number.length() - 3);
      String postfix = number.substring(number.length() - 3, number.length());

      System.out.println(prefix + "," + postfix);
   }
}
