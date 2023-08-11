import java.util.Arrays;
/**
   Prints some permutations.
*/
public class example_8
{  
   public static void main(String[] args)
   {  
      PermutationGenerator gen = new PermutationGenerator(10);      
      
      System.out.println(Arrays.toString(gen.nextPermutation()));
      System.out.println("Expected: [5, 7, 3, 2, 8, 10, 9, 6, 4, 1] ");
      System.out.println(Arrays.toString(gen.nextPermutation()));
      System.out.println("Expected: [5, 4, 7, 2, 6, 8, 1, 10, 9, 3] ");
      System.out.println(Arrays.toString(gen.nextPermutation()));
      System.out.println("Expected: [7, 10, 8, 9, 2, 6, 3, 4, 5, 1] ");
      System.out.println(Arrays.toString(gen.nextPermutation()));
      System.out.println("Expected: [7, 5, 8, 10, 3, 6, 9, 2, 4, 1] ");

      gen = new PermutationGenerator(5);
      System.out.println(Arrays.toString(gen.nextPermutation()));
      System.out.println("Expected: [2, 3, 4, 5, 1] ");
      System.out.println(Arrays.toString(gen.nextPermutation()));
      System.out.println("Expected: [5, 4, 3, 2, 1] ");
      System.out.println(Arrays.toString(gen.nextPermutation()));
      System.out.println("Expected: [4, 5, 1, 2, 3] ");
   }
}
