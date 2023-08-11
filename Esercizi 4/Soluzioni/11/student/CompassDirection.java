import java.util.Scanner;
/**
   Prints the compas direction N,NE,E,SE,S,SW,W,NW
   Given an angle as input.
*/
public class CompassDirection
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the direction the compass is pointing " +
         + " (in degrees from North (0..360): ");
      double degrees = in.nextDouble();

      System.out.print(degrees + " Degrees is ");

      // Calculate the direction and print the rest
      // of the line here




   }
}
