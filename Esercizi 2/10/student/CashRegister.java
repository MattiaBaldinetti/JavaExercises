
/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double purchase;
   private double payment;
   /** Add new instance variables for daily sales total and sales count. */

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
   }

   /**
      Records the sale of an item.
      @param amount the price of the item
   */
   public void recordPurchase(double amount)
   {
      purchase = purchase + amount;
   }

   /**
      Receives a payment from the customer.
      @param amount the amount of the payment
   */
   public void recievePayment(double amount)
   {
      payment = payment + amount;
   }

   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {   
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }

   /** Supply the definition of the accessor method getSalesTotal here. */
   
   /** Supply the definition of the accessor getSalesCount here. */
   
   /** Supply the definition of the reset method here. */
}