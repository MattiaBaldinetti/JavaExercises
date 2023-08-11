/**
   A class that represents a cone and can calculate its volume and surface area.
*/
public class Cone
{
   private double radius;
   private double height;

   /**
      Creates a cone of given radius and height.
      @param radius the radius
      @param height the height
   */
   public Cone(double radius, double height)
   {
      this.radius = radius;
      this.height = height;
   }

   /**
      Calculates the volume of the cone.
      @return the volume of the cone
   */
   public double getVolume()
   {
      return 1.0 / 3.0 * Math.PI * radius * radius * height;
   }

   /**
      Calculates the surface area of the cone.
      @return the surface area of the cone
   */
   public double getSurface()
   {
      return Math.PI * radius * radius + Math.PI * radius
            * Math.sqrt(radius * radius + height * height);
   }
}
