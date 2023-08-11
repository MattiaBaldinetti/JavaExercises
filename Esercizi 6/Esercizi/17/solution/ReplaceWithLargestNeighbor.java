import java.util.Random;

public class ReplaceWithLargestNeighbor
{
   public void replaceWithLargestNeighbor(int[] arr)
   {
      // Start loop at one, and stop before the end
      for (int i = 1; i < arr.length - 1; i++)
      {
         if (arr[i - 1] > arr[i + 1])
         {
            arr[i] = arr[i - 1];
         }
         else
         {
            arr[i] = arr[i + 1];
         }
      }
   }

   public static void main(String[] args)
   {
      int[] randoms = new int[10];
      ReplaceWithLargestNeighbor util = new ReplaceWithLargestNeighbor();
      Random generator = new Random();

      // Create a test array containing random numbers.
      for (int i = 0; i < 10; i++)
      {
         randoms[i] = generator.nextInt(100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      // Replace with largest neighbor
      util.replaceWithLargestNeighbor(randoms);

      // Print again to see new elements.
      for (int i = 0; i < 10; i++)
      {
         System.out.print(randoms[i] + " ");
      }
      System.out.println();
   }
}
