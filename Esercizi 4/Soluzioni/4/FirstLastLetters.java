
import java.util.Scanner;

/**
 * E 5_4: Read a string and determine if the first and last letters are the sme
 */
public class E5_4
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println ("This program extracts the first and last letter from a string");
        System.out.println ("and tells you if they are the same.");
     
        System.out.println("Enter your string (or just hit ENTER to quit); ");
        String str;

        while (!(str = in.nextLine()).isEmpty())
        {
            char first = str.charAt(0);
            System.out.println("You typed: '" + str + "'");
            char last = str.charAt(str.length() - 1);
            if (first == last)
            {
                System.out.println("first and last letter same");
            }
            else
            {
                System.out.println("first and last letter different");
            }
            System.out.println("Enter another string (or just hit ENTER to quit); ");

        }

    }

}

