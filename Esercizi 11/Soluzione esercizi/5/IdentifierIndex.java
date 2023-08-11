
/**
   A program that reads a Java source file and produces an index of
   identifiers.
*/
public class IdentifierIndex
{

   /**
      Creates a identifier to line number list index on the associated filename
      @param filename the file to generate the index for
      @return a identifier to line number index
   */
   public static Map<String, TreeSet<Integer>> createIndex(String filename)
   {
      Map<String, TreeSet<Integer>> indexToLineNumbers = new TreeMap<>();
      try (Scanner in = new Scanner(new File(filename)))
      {
         int lineNumber = 1;
         while (in.hasNextLine())
         {
            Scanner lineParser = new Scanner(in.nextLine());
            lineParser.useDelimiter("[^A-Za-z0-9_]+");
            while (lineParser.hasNext())
            {
               String identifier = lineParser.next();
               if (!indexToLineNumbers.containsKey(identifier))
               {
                  indexToLineNumbers.put(identifier, new TreeSet<>());
               }
               indexToLineNumbers.get(identifier).add(lineNumber);
            }
            lineNumber++;
         }
      }
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
      return indexToLineNumbers;
   }

   /**
      Prints the index with associated line numbers
      @param indexToLineNumbers the index to print
   */
   public static void printIndex(
         Map<String, TreeSet<Integer>> indexToLineNumbers)
   {
      for (String identifier : indexToLineNumbers.keySet())
      {
         System.out.println(identifier + ": "
               + indexToLineNumbers.get(identifier));
      }
   }
}
