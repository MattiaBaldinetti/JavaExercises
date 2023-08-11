import java.util.ArrayList;
import java.util.Scanner;

public class BarChart
{
   /**
     Read a sequence of positive integers from input and construct an
     array list out of them.
     @return an array list of values from user input
   */
   public ArrayList<Integer> readValues()
   {
      ArrayList<Integer> list = new ArrayList<Integer>();
      System.out.println("Enter a sequence of positive integers.  "
            + "Enter a negative value to quit: ");

      Scanner in = new Scanner(System.in);

      int n = in.nextInt();
      while (n >= 0)
      {
         list.add(n);
         n = in.nextInt();
      }
      return list;
   }

   /**
      Return the largest element in the array list.
      @param list the input list
      @return the largest element in list
   */
   private int findMax(ArrayList<Integer> list)
   {
      int max = list.get(0);
      for (int x : list)
      {
         if (x > max)
         {
            max = x;
         }
      }
      return max;
   }

   /**
      Prints a chart of asterisks based on the input list and largest
      element in the list.
      @param list the input list
   */
   public void printBarChart(ArrayList<Integer> list)
   {
      // This solution truncates instead of rounding bar heights
      final int MAX_HEIGHT = 20;                // 20 is the maximum height
      int max = findMax(list);                  // maximum value
      double scale = (double) MAX_HEIGHT / max; // scale value for each number

      for (int row = 0; row < MAX_HEIGHT; row++)   // print all rows every time
      {
         for (int col = 0; col < list.size(); col++)  // print 1 column for each item
         {
            int n = list.get(col);        // get the number
            n = (int) (n * scale);        // scale the number
            if (row >= MAX_HEIGHT - n)    // spaces at top (upward growing)
            {
               System.out.print("*");
            }
            else
            {
               System.out.print(" ");
            }
         }
         System.out.println();
      }
   }
}
