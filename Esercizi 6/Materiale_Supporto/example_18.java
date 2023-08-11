import java.util.Scanner;

public class example_18
{
   public static void main(String[] args)
   {
      System.out.println("Checking values for this table");
      System.out.println("\t 6  9 12 15 18");
      System.out.println("\t 8 12 16 20 24");
      System.out.println("\t10 15 20 25 30");
      System.out.println("\t12 18 24 30 36");
      System.out.println();

      Table table = new Table(4, 5); // 4 x 5 table

      // Fill with a sequence of values.
      for (int i = 0; i < 4; i++)
      {
         for (int j = 0; j < 5; j++)
         {
            table.set(i, j, (3 + i) * (2 + j));
         }
      }

      System.out.println("sum(0, true): " + table.sum(0, true));
      System.out.println("Expected: 60.0");
      System.out.println("sum(0, false): " + table.sum(0, false));
      System.out.println("Expected: 36.0");
      System.out.println("sum(1, true): " + table.sum(1, true));
      System.out.println("Expected: 80.0");
      System.out.println("sum(1, false): " + table.sum(1, false));
      System.out.println("Expected: 54.0");
      System.out.println("sum(2, true): " + table.sum(2, true));
      System.out.println("Expected: 100.0");
      System.out.println("sum(2, false): " + table.sum(2, false));
      System.out.println("Expected: 72.0");
      System.out.println("sum(3, true): " + table.sum(3, true));
      System.out.println("Expected: 120.0");
      System.out.println("sum(3, false): " + table.sum(3, false));
      System.out.println("Expected: 90.0");
      System.out.println("sum(4, false): " + table.sum(4, false));
      System.out.println("Expected: 108.0");

   }
}
