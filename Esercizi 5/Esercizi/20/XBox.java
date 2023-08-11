import java.util.Scanner;

/**
 * P6_20 Given the size of a box (8 in this case), print it with a contained x
 * xxxxxxxx
 * xx    xx
 * x x  x x
 * x  xx  x
 * x  xx  x
 * x x  x x
 * xx    xx
 * xxxxxxxx

 */
public class XBox
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("This program prints a box with an X drawn in it.\n");
        System.out.println("What is the size of the box? ");
        int size = in.nextInt();
        // Create a 2-d array
        char[][] box = new char[size][size];

        // Fill in the sides and diagonals
        final char ch = 'x';
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                if (i == j                       // forward diagonal
                        || i == 0                // top row
                        || i == size - 1         // bottom row
                        || j == 0                // first column
                        || j == size - 1         // last columnn
                        || j == size - i - 1)    // backward diagonal
                {
                    box[i][j] = ch;
                }
                else
                {
                    box[i][j] = ' ';
                }
            }
        }

        // Now print it
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.print(box[i][j]);
            }
            System.out.println("");
        }
    }
}

