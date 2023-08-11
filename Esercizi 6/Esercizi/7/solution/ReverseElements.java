import java.util.Arrays;

public class ReverseElements
{
   /**
      Reverses an array.
      @param data the input array
      @return an array with the elements of data in reverse order
   */
   public double[] reverse(double[] data)
   {
      double[] revData = Arrays.copyOf(data, data.length);
      int j = 0;
      for (int i = data.length - 1; i >= 0; i--)
      {
         revData[j] = data[i];
         j++;
      }
      return revData;
   }

   public static void main(String[] args)
   {
      double[] data = { 1, 4, 9, 16, 9, 7, 4, 9, 11 };

      ReverseElements util = new ReverseElements();
      double[] reversed = util.reverse(data);
      for (int i = 0; i < reversed.length; i++)
      {
         System.out.print(reversed[i] + " ");
      }
      System.out.println();
   }
}
