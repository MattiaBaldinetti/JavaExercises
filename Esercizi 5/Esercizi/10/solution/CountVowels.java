import java.util.Scanner;

public class CountVowels
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a word: ");
      String word = in.next();

      int vowelCount = 0;
      for (int i = 0; i < word.length(); i++)
      {
         char currentCharacter = word.charAt(i);
         if (currentCharacter == 'a' || currentCharacter == 'A'
               || currentCharacter == 'e' || currentCharacter == 'E'
               || currentCharacter == 'i' || currentCharacter == 'I'
               || currentCharacter == 'o' || currentCharacter == 'O'
               || currentCharacter == 'u' || currentCharacter == 'U')
         {
            vowelCount++;
         }
      }
      System.out.println(vowelCount + " vowel(s).");
   }
}