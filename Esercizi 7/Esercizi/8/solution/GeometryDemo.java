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

      Sphere sphere = new Sphere(radius);
      Cone cone = new Cone(radius, height);
      Cylinder cylinder = new Cylinder(radius, height);

      System.out.println("Sphere volume: " + sphere.getVolume());
      System.out.println("Sphere surface: " + sphere.getSurface());
      System.out.println("Cylinder volume: " + cylinder.getVolume());
      System.out.println("Cylinder surface: " + cylinder.getSurface());
      System.out.println("Cone volume: " + cone.getVolume());
      System.out.println("Cone surface: " + cone.getSurface());
   }
}
