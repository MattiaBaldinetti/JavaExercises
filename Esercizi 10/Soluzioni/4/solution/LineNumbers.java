import java.io.*;
import java.util.Scanner;

/**
   Reads a file and prints with line numbers.
*/
public class LineNumbers
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter the file name for input: ");
      String filename1 = in.next();

      System.out.print("Please enter the file name for output: ");
      String filename2 = in.next();

      try (Scanner inFile = new Scanner(new File(filename1)); PrintWriter out = new PrintWriter(filename2))
      {
         int count = 1;
         while (inFile.hasNext())
         {
            out.println("/* " + count + " */ " + inFile.nextLine());
            count++;
         }
      } 
      catch (FileNotFoundException e)
      {
         System.out.println("File not found!");
      }
   }
}
