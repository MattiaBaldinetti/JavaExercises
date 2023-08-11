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
      True if two sequences have the same values in the same order.
      @param other the sequence to compare to this one.
      @return whether the two sequences have the same values
         in the same order.
   */
   public boolean equals(Sequence other)
   {
      if (values.length != other.values.length)
      {
         return false;
      }
      for (int i = 0; i < values.length; i++)
      {
         if (values[i] != other.values[i])
         {
            return false;
         }
      }
      return true;
   }
}
