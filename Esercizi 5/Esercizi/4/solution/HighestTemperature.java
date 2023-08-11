import java.util.Scanner;

/**
   This program reads in twelve temperatures, one for
   each month of the year. Output is the number of the
   month with the highest temperature.
*/
public class HighestTemperature
{
   public static void main(String[] args)
   {  
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter twelve temperature values:");
      double highestValue = highestValue = in.nextDouble();
      int highestMonth = 1;

      for (int currentMonth = 2; currentMonth <= 12; currentMonth++)
      {
         double nextValue = in.nextDouble();
         if (nextValue > highestValue)
         {
            highestValue = nextValue;
            highestMonth = currentMonth;
         }
      }

      System.out.println("Highest Month: " + highestMonth);
      System.out.println("Highest Value: " + highestValue);
   }
}
