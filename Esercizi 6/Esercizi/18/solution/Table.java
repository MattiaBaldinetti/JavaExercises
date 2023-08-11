/**
   Represents a table of values.
*/
public class Table
{
   private int[][] values;

   /**
      Construct a table with given rows and columns.
      @param rows the rows in the table.
      @param columns the columns in the table.
   */
   public Table(int rows, int columns)
   {
      values = new int[rows][columns];
   }

   /**
      Sets a value in the table.
      @param i the row of the item to modify
      @param j the column of the item to modify
      @param n the number to use for the new value.
   */
   public void set(int i, int j, int n)
   {
      values[i][j] = n;
   }

   /**
      Returns the average of the adjacent elements in a table.
      @param i the row or column to sum.
      @param horizontal if true, then i represents a row, else a column.
      @return the sum of the given row or column.
   */
   public double sum(int i, boolean horizontal)
   {
      double sum = 0;

      final int ROWS = values.length;
      final int COLS = values[0].length;

      if (horizontal)
      {
         for (int col = 0; col < COLS; col++)
         {
            sum += values[i][col];
         }
      }
      else
      {
         for (int row = 0; row < ROWS; row++)
         {
            sum += values[row][i];
         }
      }

      return sum;
   }
}
