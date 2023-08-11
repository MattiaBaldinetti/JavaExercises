import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
   This program reads each line in a file, reverses its lines and writes them  
   back to another file.
*/
public class ReverseLines
{
   /**
      This method reads a file line by line and returns the result in an array
      list.
      @param filename the file to read
      @return an array list with the lines in the file
   */
   public static ArrayList<String> readLinesToArray(String filename)
   {
      ArrayList<String> lineList = new ArrayList<String>();
      try (Scanner inFile = new Scanner((new File(filename))))
      {
         while (inFile.hasNextLine())
         {
            lineList.add(inFile.nextLine());
         }
      } 
      catch (FileNotFoundException e)
      {
         System.out.println(filename + " not found.");
      }
      return lineList;
   }

   /**
      Write all lines in array list to given file in reverse order.
      @param filename the name of the file to write to
      @param lines the lines to write to the file
   */
   public static void writeInReverse(String filename, ArrayList<String> lines)
   {
      try (PrintWriter out = new PrintWriter(filename))
      {
         for (int i = lines.size() - 1; i >= 0; i--)
         {
            out.println(lines.get(i));
         }
      } 
      catch (FileNotFoundException e)
      {
         System.out.println("Cannot open " + filename + " for writing.");
      }
   }

   public static void main(String[] args) // File names are passed as arguments
   {
      if (args.length < 2)
      {
         System.err.println("usage: java ReverseLines infile outfile");
      }
      else
      {
         ArrayList<String> linesOfFile = readLinesToArray(args[0]);
         writeInReverse(args[1], linesOfFile);
      }
   }
}
