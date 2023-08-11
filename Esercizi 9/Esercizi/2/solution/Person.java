/**
   This class represents a person with name and height
*/
public class Person implements Measurable
{
   private String name;
   private double height;

   /**
      Constructs a person object
      @param name the person's name
      @param height the person's height
   */
   public Person(String name, double height)
   {
      this.name = name;
      this.height = height;
   }

   /**
      Gets the person's height
      @return the height
   */
   public double getHeight()
   {
      return height;
   }

   /**
      Gets the person's name
      @return the name
   */
   public String getName()
   {
      return name;
   }

   /**
      Gets the height for the Measureable interface
      @return the height
   */
   public double getMeasure()
   {
      return height;
   }
}
