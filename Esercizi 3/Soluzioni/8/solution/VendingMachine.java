import java.util.Scanner;

public class VendingMachine
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      final int PENNIES_PER_DOLLAR = 100;
      final int PENNIES_PER_QUARTER = 25;

      System.out.print("Enter bill value (1 = $1 bill, 5 = $5 bill, etc.): ");
      int billValue = in.nextInt();
      System.out.print("Enter quarter value (1 = $.25, 2 = $.50, etc.): ");
      int quarterValue = in.nextInt();

      System.out.print("Enter item price in pennies: ");
      int itemPrice = in.nextInt();

      int amountDue = PENNIES_PER_DOLLAR * billValue + PENNIES_PER_QUARTER
            * quarterValue - itemPrice;
      System.out.printf("Amount due (in pennies):     %d\n", amountDue);
      int dollarCoins = amountDue / PENNIES_PER_DOLLAR;
      amountDue = amountDue % PENNIES_PER_DOLLAR;
      int quarters = amountDue / PENNIES_PER_QUARTER;

      System.out.printf("Dollar coins: %d\n", dollarCoins);
      System.out.printf("Quarters:     %d\n", quarters);
   }
}
