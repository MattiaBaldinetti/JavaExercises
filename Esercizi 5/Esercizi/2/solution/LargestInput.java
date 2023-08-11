import java.util.Scanner;

public class LargestInput
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter a series of numbers, then type Q to process: ");
      int largest = in.nextInt();
      int smallest = largest;

      // Loop on input and check for a new min or max      
      while (in.hasNextInt())
      {
         int input = in.nextInt();
         if (input > largest)
         {
            largest = input;
         }

         if (input < smallest)
         {
            smallest = input;
         }
      }

      // Output the results
      System.out.print("Largest: " + largest + "\n" + "Smallest: " + smallest);
   }
}
