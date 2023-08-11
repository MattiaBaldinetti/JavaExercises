
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * E11.7 Compute the averages of rows of numbers read from a file
 */
public class RowsOfNumbers
{

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println ("This program reads variable-length lines of numbers from a file 'data.in'");
        System.out.println ("and prints the line along with the average.");
        File infile = new File("data.in");
        Scanner in = new Scanner(infile);
        int rowNumber = 1;
        while (in.hasNextLine())
        {
            String line = in.nextLine();
            // Read each number from the line
            Scanner scanner = new Scanner(line);
            double sum = 0.0;
            int count = 0;
            System.out.print("Row " + rowNumber + ":  " );
            while (scanner.hasNextDouble())
            {
                double n = scanner.nextDouble();
                sum = sum + n;
                System.out.print(" " + n);
                count++;
            }
            System.out.print(          " average is ");
            if (count == 0)
            {
                System.out.println("0.0");
            }
            else
            {
                double average = sum / count;
                System.out.printf("%5.1f\n",average);
            }
            rowNumber++;

        }

    }

}

