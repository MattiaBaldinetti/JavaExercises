import java.util.Scanner;

public class FindMinimumValue
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      boolean first = true;
      double min = 0.0;
      while (in.hasNextDouble())
      {
         double value = in.nextDouble();
         if (first)
         {
            min = value;
            first = false;
         }
         else if (value < min)
         {
            min = value;
         }
      }
      System.out.println("The minimum value was: " + min);
   }
}