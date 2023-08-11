import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.TreeSet;

public class IndexTester
{
   public static void main(String[] args)
   {
      // Lets process this file
      Map<String, TreeSet<Integer>> indexToLineNumbers
         = IdentifierIndex.createIndex("IndexTester.java");
      Set<String> idents = indexToLineNumbers.keySet();
      String last = "";
      for (String s : idents) { last = s; }
      System.out.println(last); // The last identifier
      System.out.println("Expected: void");
      Set<Integer> lines = indexToLineNumbers.get("void");
      System.out.println(lines);
      System.out.println("Expected: [9, 18, 19]");
      System.out.println(indexToLineNumbers.get("f" + "oo"));
      System.out.println("Expected: null");
      System.out.println(indexToLineNumbers.get("String"));
      System.out.println("Expected: [9, 12, 14, 15, 16, 24]");
   }
}
