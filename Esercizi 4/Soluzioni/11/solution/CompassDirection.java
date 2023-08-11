import java.util.Scanner;
/**
   Prints the compass direction N,NE,E,SE,S,SW,W,NW
   Given an angle as input.
*/
public class CompassDirection
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please the direction the compass is pointing (in degrees from North (0..360): ");
      double degrees = in.nextDouble();

      System.out.print(degrees + " Degrees is ");

      final double NE = 22.5;   // 22.5 degrees = boundary between N and NE
      final double E = NE + 45; // Boundaries occur every 45 degrees
      final double SE = E + 45;
      final double S = SE + 45;
      final double SW = S + 45;
      final double W = SW + 45;
      final double NW = W + 45;
      final double N = NW + 45;

      if(degrees <= NE)
      {   // The part of N between 0 and 22.5 degrees
         System.out.println("North");
      }
      else if(degrees < E)
      {
         System.out.println("North East");
      }
      else if(degrees <= SE)
      {
         System.out.println("East");
      }
      else if(degrees < S)
      {
         System.out.println("South East");
      }
      else if(degrees <= SW)
      {
         System.out.println("South");
      }
      else if(degrees < W)
      {
         System.out.println("South West");
      }
      else if(degrees <= NW)
      {
         System.out.println("West");
      }
      else if(degrees < N)
      {
         System.out.println("North West");
      }
      else
      {
         // The part of N between 337.5 and 360 degrees
         System.out.println("North");
      }
   }
}
