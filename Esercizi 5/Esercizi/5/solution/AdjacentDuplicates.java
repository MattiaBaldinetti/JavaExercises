import java.util.Scanner;

public class AdjacentDuplicates
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter a series of numbers, then type Q to process: ");
      int previous = in.nextInt();
      // Find and print adjacent duplicates
      while (in.hasNextInt())
      {
         int input = in.nextInt();
         if (input == previous)
         {
            System.out.print(input + " ");
         }
         previous = input;
      }
   }
}
