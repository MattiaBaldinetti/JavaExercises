//HIDE
/**
   This program tests the CashRegister class.
*/
public class CashRegisterTester2
{
   public static void main(String[] args)
   {
      final double PENNY_VALUE = 0.01;
      final double NICKEL_VALUE = 0.05;
      final double DIME_VALUE = 0.1;
      final double QUARTER_VALUE = 0.25;

      CashRegister myRegister = new CashRegister();
      myRegister.recordPurchase(0.57);
      myRegister.enterPayment(1.00);

      Coin[] coinTypes = new Coin[] 
      {
         new Coin(QUARTER_VALUE, "quarter"),
         new Coin(DIME_VALUE, "dime"),
         new Coin(NICKEL_VALUE, "nickel"),
         new Coin(PENNY_VALUE, "penny")
      };

      int[] expected = { 1, 1, 1, 3 };

      for (int i = 0; i < coinTypes.length; i++)
      {
         Coin c = coinTypes[i];
         int change = myRegister.giveChange(c);
         System.out.println(c.getName() + ": " + change);
         System.out.println("Expected: " + expected[i]);
      }
      
      myRegister.recordPurchase(2.21);
      myRegister.enterPayment(3.00);
      
      int[] expected2 = { 3, 0, 0, 4 };

      for (int i = 0; i < coinTypes.length; i++)
      {
         Coin c = coinTypes[i];
         int change = myRegister.giveChange(c);
         System.out.println(c.getName() + ": " + change);
         System.out.println("Expected: " + expected2[i]);
      }
   }
}
