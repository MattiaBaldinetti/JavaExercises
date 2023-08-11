import java.util.Scanner;

public class CurrencyConversion
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter today's US Dollar to Japanese yen exchange "
            + "rate (yen per Dollar): ");
      double exchangeRate = in.nextDouble();

      // Initialize dollars to something other than the sentinel of 0.0
      double dollars = -1.0;

      // If the user inputs 0, we quit the conversion
      while (dollars != 0.0)
      {
         System.out.println("Enter US Dollar amount to convert to Japanese"
               + " yen (type 0 to quit):");
         dollars = in.nextDouble();
         if (dollars != 0.0)
         {
            System.out.printf("%f US Dollars equals %f Japanese yen.%n",
                  dollars, dollars * exchangeRate);
         }
         else
         {
            System.out.println("Goodbye!");
         }
      }
   }
}