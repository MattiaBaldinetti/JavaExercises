/**
   Represents a sequence of values.
*/
public class Sequence
{
   private int[] values;

   /**
      Construct a sequence of a given size.
      @param size the size to use.
   */
   public Sequence(int size)
   {
      values = new int[size];
   }

   /**
      Sets a value in the sequence to a new value.
      @param i the position to modify
      @param n the number to use for the new value.
   */
   public void set(int i, int n)
   {
      values[i] = n;
   }

   /**
      Gets a value from the sequence.
      @param i the position of the value to retrieve
      @return the number at position i.
   */
   public int get(int i)
   {
      return values[i];
   }

   /**
      Returns the number of elements in the sequence.
      @return the number at position i.
   */
   public int size()
   {
      return values.length;
   }

   /**
      True if two sequences have the same values in any order.
      @param other the sequence to compare to this one.
      @return true if the two sequences have the same values
         in any order ignoring duplicates.
   */
   public boolean sameValues(Sequence other)
   {
      // Make sure every value in this is also found in other
      for (int i = 0; i < size(); i++)
      {
         boolean found = false;
         int value = get(i);
         for (int j = 0; j < other.size() && ! found; j++)
         {
            if (other.get(j) == value)
            {
               found = true;
            }
         }
         if (! found)
         {
            return false;
         }
      }

      // Now, make sure every value in other is also found in this
      for (int i = 0; i < other.size(); i++)
      {
         boolean found = false;
         int value = other.get(i);
         for (int j = 0; j < size() && ! found; j++)
         {
            if (get(j) == value)
            {
               found = true;
            }
         }
         if (! found)
         {
            return false;
         }
      }

      return true;
   }
}
