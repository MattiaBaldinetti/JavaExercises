/**
   Displays an ASCII representation of a Christmas Tree.
 */
public class ChristmasTree 
{   
   /**
      Gives a string representation of a christmas tree.
      @return the string representation of the tree.
    */
   public String toString()
   {
      String tree = "   /\\   \n";
      tree = tree + "  /  \\  \n";
      tree = tree + " /    \\ \n";
      tree = tree + "/      \\\n";
      tree = tree + "-------- \n";
      tree = tree + "  \"  \"  \n";
      tree = tree + "  \"  \"  \n";
      tree = tree + "  \"  \"  \n";
      return tree;
   }
}
