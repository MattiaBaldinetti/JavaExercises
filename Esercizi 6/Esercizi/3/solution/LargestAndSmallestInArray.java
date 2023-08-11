import java.util.Scanner;

public class LargestAndSmallestInArray
{
   public static void main(String[] args)
   {
      final int LENGTH = 100;
      double[] data = new double[LENGTH];
      int size = 0;

      // Read inputs

      System.out.println("Please enter values, Q to quit:");
      Scanner in = new Scanner(System.in);
      while (in.hasNextDouble() && size < data.length)
      {
         data[size] = in.nextDouble();
         size++;
      }

      // Find the largest and smallest value

      double largest = data[0];
      double smallest = data[0];
      for (int i = 1; i < size; i++)
      {
         if (data[i] > largest)
         {
            largest = data[i];
         }
         if (data[i] < smallest)
         {
            smallest = data[i];
         }
      }

      // Print all values, marking the largest and smallest
      for (int i = 0; i < size; i++)
      {
         System.out.print(data[i]);
         if (data[i] == largest)
         {
            System.out.print(" <== largest value");
         }
         if (data[i] == smallest)
         {
            System.out.print(" <== smallest value");
         }
         System.out.println();
      }
   }
}