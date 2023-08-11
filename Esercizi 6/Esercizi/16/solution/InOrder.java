public class InOrder
{
   public boolean inOrder(int[] arr)
   {
      // Assume they are in order.
      boolean ordered = true;

      // Loop through array, checking for out 
      // of order elements
      for (int i = 0; i < arr.length - 1; i++)
      {
         if (arr[i] > arr[i + 1])
         {
            ordered = false;
         }
      }
      return ordered;
   }

   public static void main(String[] args)
   {
      int[] arrOrder = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 42 };
      int[] arrNotOrder = { 2, 1, 3, 4, 5, 6, 7, 8, 9, 42 };
      InOrder util = new InOrder();

      // Check if array 1 is ordered or not.
      if (util.inOrder(arrOrder))
      {
         System.out.println("The array is in order.");
      }
      else
      {
         System.out.println("The array is NOT in order.");
      }
      System.out.println("Expected: The array is in order.");

      // Check if array 2 is ordered or not.
      if (util.inOrder(arrNotOrder))
      {
         System.out.println("The array is in order.");
      }
      else
      {
         System.out.println("The array is NOT in order.");
      }
      System.out.println("Expected: The array is NOT in order.");
   }
}
