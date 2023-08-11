import java.util.Scanner;

public class VowelsReplacedUnderscore
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a word with no spaces: ");
      String word = in.next();
      for (int n = 0; n < word.length(); n++)
      {
         // Check each letter to see if a vowel, 
         // and if it is, replace it with an underscore
         char ch = word.charAt(n);
         if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i'
               || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
         {
            System.out.print('_');
         }
         else
         {
            System.out.print(ch);
         }
      }
   }
}
