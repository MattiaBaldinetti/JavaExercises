
import java.util.Scanner;

/**
 * E6.19 Draw a diamond with missing middle character like 
 *    x x 
 *   xx xx 
 *  xxx xxx 
 *  xxx xxx 
 *   xx xx 
 *    x x
 */
public class Diamond
{
    /**
     * Print ch n times
     * @param n the repetition factor
     * @param ch the character to be printed
     */
    static void print(int n, char ch)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(ch);
        }
    }

    /**
     * Print ch n time followed by new line
     * @param n the repetition factor
     * @param ch the character to be printed
     */
    static void println(int n, char ch)
    {
        print(n, ch);
        System.out.println("");
    }
    
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println ("This program prints a diamond shape\n");
        System.out.print("Enter the side length of the diamond: ");
        int length = in.nextInt();
        // Draw the diamond
        // First the top half
        for (int i = 1; i < length; i++)
        {
            print(length - i, ' ');
            print(i, 'x');
            print(1, ' ');
            println(i, 'x');

        }
        // Then the bottom half
        for (int i = length; i > 0; i--)
        {
            print(length - i, ' ');
            print(i, 'x');
            print(1, ' ');
            println(i, 'x');

        }
    }

}

