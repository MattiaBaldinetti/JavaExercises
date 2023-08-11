import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   Opens a file, prints hello message, reopens it and prints it back.
*/
public class FileHello
{
   public static void main(String[] args)
   {
      try (Scanner in = new Scanner(new File("hello.txt")))
      {
         String message = in.nextLine();
         System.out.println(message);
      } 
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }

      try (PrintWriter out = new PrintWriter("hello.txt"))
      {
         out.println("Hello, World!");
      }
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
        }
}
