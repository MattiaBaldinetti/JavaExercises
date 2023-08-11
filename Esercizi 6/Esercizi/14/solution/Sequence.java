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
      Returns the sum of two sequences.
      @param other the sequence to add to this one.
      @return the sum of two sequences.
   */
   public Sequence sum(Sequence other)
   {
      // Find the size of the sequence
      int aLen = size();
      int bLen = other.size();
      int largerLen = Math.max(aLen, bLen);

      Sequence result = new Sequence(largerLen);

      for (int i = 0; i < largerLen; i++)
      {
         if (i < aLen && i < bLen) // can use both indexes
         {
            result.set(i, get(i) + other.get(i));
         }
         else if(i < aLen) // can only use current item
         {
            result.set(i, get(i));
         }
         else
         {
            result.set(i, other.get(i));
         }
      }

      return result;
   }
}
