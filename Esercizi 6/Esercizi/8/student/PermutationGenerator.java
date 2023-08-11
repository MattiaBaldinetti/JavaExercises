import java.util.Random;

/**
   This class generates permutations of a sequence 
   of integers 1...length.
*/
public class PermutationGenerator
{
   private Random generator;
   private int length;

   /**
      Construct a PermutationGenerator object.
      @param length the length of the permutations generated
      by this generator.
   */
   public PermutationGenerator(int length)
   {
      generator = new Random(42); // just for testing
      this.length = length;
   }

   /**
      Gets the next permutation.
      @return the array containing the next permutation
   */
   public int[] nextPermutation()
   {  
      int[] p = new int[length];
      for (int i = 0; i < length; i++) 
         p[i] = i + 1;
         
      int[] r = new int[length];
      
      for (int n = length; n > 0; n--)
      {
         int pos = generator.nextInt(n);
         r[n - 1] = p[pos];
         p[pos] = p[n - 1];
      }
      return r;
   }
}
