import java.util.Scanner;

public class PictureViewer
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      // Ask the user for the picture to use
      System.out.print("The first picture to use? ");
      String fname1 = in.nextLine();
      System.out.print("The second picture to use? ");
      String fname2 = in.nextLine();

      // Create and load the pictures
      Picture pic1 = new Picture();
      pic1.load(fname1);
      Picture pic2 = new Picture();
      pic2.load(fname2);

      // Create the new superimposed picture
      Picture pic3 = PictureUtilities.greenscreen(pic1, pic2);

   }
}
