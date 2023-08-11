import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

/**
   Opens a file, removes any blank lines at the beginning or end of
   the file, and writes the remaining lines back to the same file.
*/
public class FileTrimmer
{
   /**
      Removes any blank lines at the beginning or end of a file.
      @param fileName name of the file with blank lines to be trimmed.
   */
   public static void trimBlankLines(String fileName)
   {
      ArrayList<String> lines =  new ArrayList<>();
      boolean nonBlankFound = false;
      try (Scanner in = new Scanner(new File(fileName)))
      {
         while (in.hasNextLine())
         {
            String line = in.nextLine();     // Skip lines until non blank found
            if (!line.trim().isEmpty() || nonBlankFound)
            {
               nonBlankFound = true;
               lines.add(line);
            } 
         }
      } 
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
      
      ListIterator<String> it = lines.listIterator(lines.size());
      while (it.hasPrevious() && it.previous().trim().isEmpty())
      {
         it.remove();         // remove blank lines at the end of the file
      }
      
      try (PrintWriter out = new PrintWriter(fileName))
      {
         for (String line: lines)
         {
            out.println(line);
         }
      }
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
   }
}
