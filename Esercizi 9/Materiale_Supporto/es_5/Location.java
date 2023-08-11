/** Classe interna contenuta in Grid**/
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
