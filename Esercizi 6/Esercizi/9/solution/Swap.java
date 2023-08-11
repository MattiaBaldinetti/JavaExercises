public class Swap
{
   public void swapHalves(int[] a)
   {
      int i = 0;
      int j = a.length / 2;
      int temp;

      while (i < a.length / 2)
      {
         temp = a[i];
         a[i] = a[j];
         a[j] = temp;
         i++;
         j++;
      }
   }

   public static void main(String[] args)
   {
      int[] myArray = { 1, 4, 9, 16, 9, 7, 4, 11 };
      Swap util = new Swap();

      util.swapHalves(myArray);

      System.out.println("Printing the new array...");

      for (int i = 0; i < myArray.length; i++)
      {
         System.out.print(myArray[i] + " ");
      }
      System.out.println();
   }
}
