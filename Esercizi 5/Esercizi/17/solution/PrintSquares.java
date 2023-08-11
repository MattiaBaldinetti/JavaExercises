import java.util.Scanner;

public class PrintSquares
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter side length: ");
      int sideLength = in.nextInt();

      for (int row = 1; row <= sideLength; row++)
      {
         // Print the first square
         for (int column = 1; column <= sideLength; column++)
         {
            System.out.print("*");
         }

         // Space between them
         System.out.print(" ");

         // Print second square
         for (int column = 1; column <= sideLength; column++)
         {
            // Only print out border
            if (column == 1 || column == sideLength || row == 1
                  || row == sideLength)
            {
               System.out.print("*");
            }
            else
            {
               System.out.print(" ");
            }
         }
         System.out.println();
      }
   }
}