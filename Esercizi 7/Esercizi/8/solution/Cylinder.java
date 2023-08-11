/**
   A class that represents a cylinder and can calculate its volume and
   surface area.
*/
public class Cylinder
{
   private double radius;
   private double height;

   /**
      Creates a new cylinder of given height and radius.
      @param radius the radius
      @param height the height
   */
   public Cylinder(double radius, double height)
   {
      this.radius = radius;
      this.height = height;
   }

   /**
      Calculates the volume of a cylinder.
      @return the volume of the cylinder
   */
   public double getVolume()
   {
      return Math.PI * radius * radius * height;
   }

   /**
      Calculates the surface area of the cylinder.
      @return the surface area of the cylinder
   */
   public double getSurface()
   {
      return 2 * Math.PI * radius * (radius + height);
   }
}
