//HIDE
import java.util.Scanner;
/**
   This program calculates an alternating sum.
*/
public class AlternatingSumTester2
{
   public static void main(String[] args)
   {
      test(new int[]{ 1, 4, 9, 16, 9, 7, 4, 9, 11 }, -2);
      test(new int[]{-4, 6, 12, -3, 9, 2 }, 12);
      test(new int[]{-9 -8 -7 -6 -5 -4 -3 -2 -1}, -45);
   }

   public static void test(int[] values, int expected)
   {
      DataSet data = new DataSet();
      for (int v : values) data.add(v);
      double sum = data.alternatingSum();
      System.out.println("Alternating Sum: " + sum);
      System.out.println("Expected: " + expected);
   }
}
