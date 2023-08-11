
import java.util.Scanner;

/**
 *
 * Determine if a the first and second half of a word is the same ignoring the
 * middle.
 */
public class CompareWordHalf
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String word; // The word to be read
        String first, last; // For the first and second half of the word
        System.out.println ("This program determines whether the first and last half ");
        System.out.println ("of a word you enter are the same.\n");
        System.out.println("Type a word: (ENTER to terminate) ");

        while (!(word = in.nextLine()).isEmpty())
        {


            int middle = word.length() / 2;
            if (word.length() %2 == 0)   // word is of even length
            {
                first = word.substring(0, middle);
                last = word.substring(middle);
            }
            else     // word is of odd length
            {
                first = word.substring(0, middle);
                last = word.substring(middle + 1);
            }
            if (first.equals(last))
            {
                System.out.println("The first and last half of your word are the same");
            }
            else
            {
                System.out.println("The first and last half of your word differ");

            }
            System.out.println("first = " + first + " last = " + last);
            System.out.println("Enter a word (ENTER to terminate): ");
        }
    }

} 

