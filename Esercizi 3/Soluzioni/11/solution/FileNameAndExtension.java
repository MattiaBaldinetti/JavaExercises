import java.util.Scanner;

public class FileNameAndExtension
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Please enter the drive letter: ");
      String driveLetter = in.next();

      System.out.print("Please enter the path: ");
      String path = in.next();

      System.out.print("Please enter the filename: ");
      String filename = in.next();

      System.out.print("Please enter the extension: ");
      String extension = in.next();

      String completeFilename = driveLetter + ":" + path + "\\" + filename
            + "." + extension;
      System.out.println(completeFilename);
   }
}
