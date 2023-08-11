import java.util.Scanner;

public class VowelOrConsonant
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter one alphabetic character: ");
      String chAsString = in.next();

      if (chAsString.length() == 1)
      {
         char ch = chAsString.charAt(0);
         if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
         {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                  || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                  || ch == 'O' || ch == 'O' || ch == 'U')
            {
               System.out.println("Vowel");
            }
            else
            {
               System.out.println("Consonant");
            }
         }
         else
         {
            System.out.println("Error: Not an alphabetic character!");
         }
      }
      else
      {
         System.out.println("Error: Too long! More than one character!");
      }
   }
}
