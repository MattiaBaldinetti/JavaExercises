import java.util.List;
import java.util.ArrayList;

/**
   A class to represent a bag of items allowing the user
   to add and count items in the bag.  Repeated items are
   allowed.
*/
public class Bag
{
   private List<Item> items;

   /**
      Create a new bag.
   */
   public Bag()
   {
      items = new ArrayList<Item>();
   }

   /**
      Add item to the bag.
      @param itemName name of the item
   */
   public void add(String itemName)
   {
      for (Item item : items)
      {
         if (item.getName().equals(itemName))
         {
            item.incrementQuantity();
            return;
         }
      }

      items.add(new Item(itemName, 1));
   }

   /**
      Get the number of times the item was inserted into the bag.
      @return count of item
   */
   public int count(String itemName)
   {
      for (Item item : items)
      {
         if (item.getName().equals(itemName))
         {
            return item.getQuantity();
         }
      }

      return 0;
   }

   /**
      Inner class to represent an item.
   */
   private static class Item
   {
      private String name;
      private int quantity;

      /**
         Create an item.
         @param name item name
         @param quantity item quantity
      */
      public Item(String name, int quantity)
      {
         this.name = name;
         this.quantity = quantity;
      }

      /**
         Get the item's name.
         @return the name
      */
      public String getName()
      {
         return name;
      }

      /**
         Get the item's quantity.
         @return the quantity
      */
      public int getQuantity()
      {
         return quantity;
      }

      /**
         Increment the quantity for this item.
      */
      public void incrementQuantity()
      {
         quantity++;
      }
   }
}
