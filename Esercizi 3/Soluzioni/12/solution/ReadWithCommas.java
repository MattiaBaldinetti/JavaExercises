import java.util.Scanner;

public class ReadWithCommas
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter an integer between 1,000 and 999,999,"
            + "using a comma after the thousands: ");

      String number = in.next();
      String prefix = number.substring(0, number.length() - 4);
      String postfix = number.substring(number.length() - 3, number.length());

      System.out.println(prefix + postfix);
   }

}
