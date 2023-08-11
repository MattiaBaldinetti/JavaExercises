/**
   A class that represents a sphere and can calculate its volume and surface area.   
*/
public class Sphere
{
   private double radius;

   /**
      Creates a sphere of a given radius.
      @param radius the radius
   */
   public Sphere(double radius)
   {
      this.radius = radius;
   }

   /**
         Calculates the volume of the sphere.
         @return the volume of the sphere.
      */
   public double getVolume()
   {
      return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
   }

   /**
      Calculates the surface area of the sphere.
      @return the volume of the sphere.
   */
   public double getSurface()
   {
      return 4.0 * Math.PI * radius * radius;
   }
}
