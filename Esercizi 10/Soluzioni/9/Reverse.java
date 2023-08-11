import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
   This program replaces each line of a file with its reverse.
*/
public class Reverse
{
   /**
      This method reads a file line by line and returns the result in an 
      array list.
      @param filename the file to read
      @return an array list with the words in the file
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
      Reverses a string.
      @param line the string to reverse
      @return the reverse of line
   */
   public static String reverse(String line)
   {
      String reversed = "";
      for (int i = 0; i < line.length(); i++)
      {
         reversed = line.charAt(i) + reversed;
      }
      return reversed;
   }

   /**
      Reverses all elements of listOfLines.
      @param listOfLines the list of lines to reverse
   */
   public static void reverseAll(ArrayList<String> listOfLines)
   {
      for (int i = 0; i < listOfLines.size(); i++)
      {
         listOfLines.set(i, reverse(listOfLines.get(i)));
      }
   }

   /**
      Write all lines in array list to given file.
      @param filename the name of the file to write to
      @param lines the lines to write to the file
   */
   public static void writeAll(String filename, ArrayList<String> lines)
   {
      try (PrintWriter out = new PrintWriter(filename))
      {
         for (String line : lines)
         {
            out.println(line);
         }
       
      } 
      catch (FileNotFoundException e)
      {
         System.out.println("Cannot open " + filename + " for writing.");
      }
   }

   public static void main(String[] args)// Filename is passed as command line argument
   {
      if (args.length < 1)
      {
         System.err.println("usage: java Reverse file");
      }
      else
      {
         ArrayList<String> linesOfFile = readLinesToArray(args[0]);
         reverseAll(linesOfFile);
         writeAll(args[0], linesOfFile);
      }
   }
}
