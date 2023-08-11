import java.util.ArrayList;

/**
   Grid to store descriptions in two-dimensions.
*/
public class Grid
{
   private ArrayList<Row> grid;

   /**
      Construct a two-dimensional grid.
   */
   public Grid()
   {
      grid = new ArrayList<Row>();
   }

   /**
      Adds a description to location in grid.
      @param row row of location
      @param column column of location
      @param description text description
   */
   public void add(int row, int column, String description)
   {
      Row theRow = null;
      for (Row aRow : grid)
      {
         if (aRow.getRowNumber() == row)
         {
            theRow = aRow;
         }
      }

      if (theRow == null)
      {
         theRow = new Row(row);
         grid.add(theRow);
      }

      theRow.setColumn(column, description);
   }

   /**
      Retrieve description at location in grid.
      @param row row of location
      @param column column of location
      @return description at specified location
   */
   public String getDescription(int row, int column)
   {
      for (Row theRow : grid)
      {
         if (theRow.getRowNumber() == row)
         {
            return theRow.getDescription(column);
         }
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

      for (Row row : grid)
      {
         locations.addAll(row.getDescribedLocations());
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

   /**
      Represents a row in the grid.
   */
   private static class Row
   {
      private int rowNumber;
      private ArrayList<RowColumn> columns;

      /**
         Create an unbounded row.
         @param rowNumber row number
      */
      public Row(int rowNumber)
      {
         this.rowNumber = rowNumber;
         this.columns = new ArrayList<RowColumn>();
      }

      /**
         Set the column.
         @param columnNumber column number
         @param description the location description
      */
      public void setColumn(int columnNumber, String description)
      {
         int columnIndex = 0;
         boolean done = false;
         for (RowColumn column : columns)
         {
            if (!done)
            {
               if (column.getColumnNumber() == columnNumber)
               {
                  done = true;
               }
               else
               {
                  columnIndex++;
               }
            }
         }

         if (columnIndex < columns.size())
         {
            columns.set(columnIndex, new RowColumn(columnNumber, description));
         }
         else
         {
            columns.add(new RowColumn(columnNumber, description));
         }
      }

      /**
         Get the description at column.
         @param columnNumber column number
         @return description
      */
      public String getDescription(int columnNumber)
      {
         for (RowColumn column : columns)
         {
            if (column.getColumnNumber() == columnNumber)
            {
               return column.getDescription();
            }
         }

         return null;
      }

      /**
         Get the row number.
         @return row number
      */
      public int getRowNumber()
      {
         return rowNumber;
      }

      /**
         Get described locations.
         @return described locations in this row
      */
      public ArrayList<Location> getDescribedLocations()
      {
         ArrayList<Location> locations = new ArrayList<Location>();
         for (RowColumn column : columns)
         {
            locations.add(new Location(rowNumber, column.getColumnNumber()));
         }

         return locations;
      }
   }

   /**
      Represents a column in a row.
   */
   private static class RowColumn
   {
      private int columnNumber;
      private String description;

      /**
         Create an column in a  row.
         @param columnNumber column number
         @param description location description
      */
      public RowColumn(int columnNumber, String description)
      {
         this.columnNumber = columnNumber;
         this.description = description;
      }

      /**
         Retrieve the column number.
         @return column number
      */
      public int getColumnNumber()
      {
         return columnNumber;
      }

      /**
         Retrieve the description.
         @return location description
      */
      public String getDescription()
      {
         return description;
      }
   }
}
