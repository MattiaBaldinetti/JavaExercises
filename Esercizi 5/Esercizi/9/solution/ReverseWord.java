import java.util.Scanner;

public class ReverseWord
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a word: ");
      String word = in.next();

      for (int i = word.length() - 1; i >= 0; i--)
      {
         System.out.print(word.charAt(i));
      }
   }
}