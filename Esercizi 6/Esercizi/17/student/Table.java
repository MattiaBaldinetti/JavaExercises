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
      @param row the row of the element.
      @param column the colum of the element.
      @return the average of the adjacent elements.
   */
   public double neighborAverage(int row, int column)
   {
      . . .
   }
}
