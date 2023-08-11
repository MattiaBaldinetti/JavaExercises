import java.util.Scanner;

public class TableTester
{
   public static void main(String[] args)
   {
      Table table = new Table(4, 5); // 4 x 5 table

      // Fill it with a sequence of values.
      for (int i = 0; i < 4; i++)
      {
         for (int j = 0; j < 5; j++)
         {
            table.set(i, j, (3 + i) * (2 + j));
         }
      }

      System.out.println("Checking values for this table");
      System.out.println("\t 6  9 12 15 18");
      System.out.println("\t 8 12 16 20 24");
      System.out.println("\t10 15 20 25 30");
      System.out.println("\t12 18 24 30 36");
      System.out.println();

      System.out.println("neighborAverage(1, 1): " + table.neighborAverage(1, 1));
      System.out.println("Expected: 12.0");
      System.out.println("neighborAverage(2, 3): " + table.neighborAverage(2, 3));
      System.out.println("Expected: 25.0");
      // Upper-left corner
      System.out.println("neighborAverage(0, 0): " + table.neighborAverage(0, 0));
      System.out.println("Expected: 9.666667");
      // Lower-right corner
      System.out.println("neighborAverage(3, 4): " + table.neighborAverage(3, 4));
      System.out.println("Expected: 28.333333");
      // Right-hand side
      System.out.println("neighborAverage(1, 4): " + table.neighborAverage(1, 4));
      System.out.println("Expected: 21.6");
      // Left-hand side
      System.out.println("neighborAverage(1, 0): " + table.neighborAverage(1, 0));
      System.out.println("Expected: 10.4");
      // Bottom row
      System.out.println("neighborAverage(3, 2): " + table.neighborAverage(3, 2));
      System.out.println("Expected: 21.6");
      // Top row
      System.out.println("neighborAverage(0, 2): " + table.neighborAverage(0, 2));
      System.out.println("Expected: 14.4");

   }
}
