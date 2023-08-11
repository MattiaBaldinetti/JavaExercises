import java.util.Scanner;

public class Scores
{
   /**
      Computes the sum of all values except the smallest in an array.
      @param data an array of values
      @return the sum of all but the least value in data
   */
   public double sumWithoutSmallest(double[] data, int currentSize)
   {
      double total = 0;
      double smallest = data[0];
      for (int i = 0; i < currentSize; i++)
      {
         if (data[i] < smallest)
         {
            smallest = data[i];
         }
         total = total + data[i];
      }
      return total - smallest;
   }

   public static void main(String[] args)
   {
      final int LENGTH = 100;
      double[] scores = new double[LENGTH];
      int size = 0;

      // Read inputs
      System.out.println("Please enter scores, Q to quit:");
      Scanner in = new Scanner(System.in);
      while (in.hasNextDouble() && size < scores.length)
      {
         scores[size] = in.nextDouble();
         size++;
      }
      if (scores.length == 0)
      {
         System.out.println("At least one score is required.");
         return;
      }
      Scores util = new Scores();
      double total = util.sumWithoutSmallest(scores, size);
      System.out.println("Final score without least one: " + total);
   }
}
