import java.util.Scanner;

public class GeometryDemo
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter radius: ");
      double radius = in.nextDouble();
      System.out.println("Enter height: ");
      double height = in.nextDouble();

      System.out.println("Sphere volume: " + Geometry.sphereVolume(radius));
      System.out.println("Sphere surface: " + Geometry.sphereSurface(radius));
      System.out.println("Cylinder volume: "
            + Geometry.cylinderVolume(radius, height));
      System.out.println("Cylinder surface: "
            + Geometry.cylinderSurface(radius, height));
      System.out.println("Cone volume: " + Geometry.coneVolume(radius, height));
      System.out.println("Cone surface: "
            + Geometry.coneSurface(radius, height));
   }
}
