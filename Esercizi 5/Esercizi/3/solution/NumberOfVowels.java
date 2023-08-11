import java.util.Scanner;

public class NumberOfVowels
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a word with no spaces: ");
      String word = in.next();

      int numVowels = 0;
      for (int n = 0; n < word.length(); n++)
      {
         // Check each letter to see if a vowel, 
         // and increment counter
         char ch = word.charAt(n);
         if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i'
               || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
         {
            numVowels++;
         }
      }
      System.out.print("Number of vowels: " + numVowels);
   }
}
