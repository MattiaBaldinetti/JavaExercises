import java.util.ArrayList;

/**
   Grid to store descriptions in two-dimensions.
*/
public class Grid
{
   private String grid[][];

   /**
      Construct a two-dimensional grid.
      @param numRows number of rows
      @param numColumns number of columns
   */
   public Grid(int numRows, int numColumns)
   {
      grid = new String[numRows][numColumns];
   }

   /**
      Adds a description to location in grid.
      @param row row of location
      @param column column of location
      @param description text description
   */
   public void add(int row, int column, String description)
   {
      if (row >= 0 && row < grid.length && column >= 0
            && column < grid[row].length)
      {
         grid[row][column] = description;
      }
   }

   /**
      Retrieve description at location in grid.
      @param row row of location
      @param column column of location
      @return description at specified location
   */
   public String getDescription(int row, int column)
   {
      if (row >= 0 && row < grid.length && column >= 0
            && column < grid[row].length)
      {
         return grid[row][column];
      }

      return null;
   }

   /**
      Gather the grid locations that have descriptions.
      @return list of locations
   */
   public ArrayList<Location> getDescribedLocations()
   {
      ArrayList<Location> locations = new ArrayList<Location>();

      for (int row = 0; row < grid.length; row++)
      {
         for (int column = 0; column < grid[row].length; column++)
         {
            if (grid[row][column] != null)
            {
               locations.add(new Location(row, column));
            }
         }
      }

      return locations;
   }

   /**
      Represents a location in the grid.
   */
   public static class Location
   {
      private int row;
      private int column;

      /**
         Create a location.
         @param row row of location
         @param column column of location
      */
      public Location(int row, int column)
      {
         this.row = row;
         this.column = column;
      }

      /**
         Retrieve the row.
         @return the row
      */
      public int getRow()
      {
         return row;
      }

      /**
         Retrieve the column.
         @return the column
      */
      public int getColumn()
      {
         return column;
      }
   }
}
