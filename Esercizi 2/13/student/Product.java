/**
   A product with a name and a price.
*/
public class Product
{ 
   ...
   /**
      Constructs a product with a given name and price.
      @param n the name
      @param p the price
   */
   public Product(String n, double p)
   {  
      ...
   }

   /**
      Gets the product name.
      @return the name
   */
   public String getName()
   {  
      ...
   }

   /**
      Gets the product price.
      @return the price
   */
   public double getPrice()
   {  
      ...
   }

   /**
      Reduces the product price.
      @param amount the amount by which to reduce the price
   */
   public void reducePrice(double amount)
   {  
      ...
   }
}

