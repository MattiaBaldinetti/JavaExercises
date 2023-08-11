 
import java.util.Scanner;

class Reader
{

    private Scanner in;
    private String current;

    /**
     * Create the reader from standard input
     */
    public Reader()
    {
        in = new Scanner(System.in);
        current = "";
        if (in.hasNext())
        {
            current = in.next();
        }
    }

   // Other methods..
}

public class ElementChecker
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("This program uses a Reader class that allows multiple reads of the same data");
        System.out.println("You will be asked to enter a series of words. The first world will be read twice");
        System.out.println("After that data will be read word by word");
        System.out.println("To terminate reading type your system EOF character");
        System.out.println("On Windows this is CTRL-Z; on other systems it is CTRL-D");
        System.out.println("");
        System.out.print("Enter a sentence:");
        Reader reader = new Reader();
        String str = reader.getCurrent();
        System.out.println("Word read: " + str);
        str = reader.getCurrent();
        System.out.println("Reading first word again yields: " + str);

        // Now read all the rest elements from tine input stream
        reader.next();
        while (reader.hasMoreElements())
        {
            str = reader.getCurrent();
            System.out.println("Read:" + str);
            reader.next();
        }
    }

}


/**
This program uses a Reader class that allows multiple reads of the same data
You will be asked to enter a series of words. The first world will be read twice
After that data will be read word by word
To terminate reading type your system EOF character
On Windows this is CTRL-Z; on other systems it is CTRL-D

Enter a sentence:metodologie di programmazione
Word read: metodologie
Reading first word again yields: metodologie
Read:di
Read:programmazione
ok
Read:ok
end
Read:end
**/
