import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
   Write a program that checks whether a sequence of HTML tags
   is properly nested. For each opening tag, such as <p>, there
   must be a closing tag </p>. A tag such as <p> may have other
   tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>

   The inner tags must be closed before the outer ones.
   Your program should process a file containing tags.
   For simplicity, assume that the tags are separated by
   spaces, and that there is no text inside the tags.
*/
public class HTMLChecker
{
   public static void main(String[] args)
   {
      String filename = "TagSample1.html"; //SUB "TagSample2.html";"TagSample3.html"
      try (Scanner in = new Scanner(new File(filename)))
      {
         boolean tagsMatch = true;
         String oldTag = "";

         Stack<String> tagStack = new Stack<>();

         boolean done = false;
         while (tagsMatch && !done && in.hasNext())
         {
            String tag = in.next();
            tag = tag.toLowerCase();
            if (tag.length() < 2)
            {
               done = true;
            }
            if (!done)
            {
               if (tag.charAt(1) == '/')
               {
                  tag = tag.charAt(0) + tag.substring(2);
                  oldTag = tagStack.pop();
                  tagsMatch = (oldTag.equals(tag));
               }
               else
               {
                  tagStack.push(tag);
               }
            }
         }

         String ok = "";
         if (!tagsMatch || (tagStack.size() != 0))
         {
            ok = " not";
         }
         System.out.println("HTML" + ok + " properly nested");
      }
      catch (FileNotFoundException e)
      {
         System.out.println("Cannot open: " + filename);
      }
   }
}
