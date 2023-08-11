import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
   Reads a file of floating-point number columns and prints average 
   of columns.
*/
public class AverageColumns
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter the file name: ");
      String filename = in.next();
      try (Scanner inFile = new Scanner(new File(filename)))
      {
         double sum1 = 0.0;
         double sum2 = 0.0;
         int count = 0;
         while (inFile.hasNextDouble())
         {
            sum1 += inFile.nextDouble();
            sum2 += inFile.nextDouble();
            count++;
         }
         System.out.println("Average of column 1: " + sum1 / count);
         System.out.println("Average of column 2: " + sum2 / count);
      } catch (FileNotFoundException e)
      {
         System.out.println("File not found!");
      }
   }
}
