import java.util.Scanner;
/**
   This program calculates taxes based on the original
   U.S. income tax schedule in 1913.
*/
public class TaxCalculator
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Please enter your income: ");
      double income = in.nextDouble();

      TaxReturn aTaxReturn = new TaxReturn(income);

      System.out.println("Tax: " + aTaxReturn.getTax());
   }
}
