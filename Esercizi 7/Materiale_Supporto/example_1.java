/**
   This program tests the CashRegister class.
*/
public class CashRegisterTester
{
   public static void main(String[] args)
   {
      final double NICKEL_VALUE = 0.05;
      final double DIME_VALUE = 0.1;
      final double QUARTER_VALUE = 0.25;

      CashRegister myRegister = new CashRegister();
      myRegister.recordPurchase(0.82);
      myRegister.enterPayment(3, new Coin(QUARTER_VALUE, "quarter"));
      myRegister.enterPayment(2, new Coin(NICKEL_VALUE, "nickel"));

      double myChange = myRegister.giveChange();
      System.out.println("Change: " + myChange);
      System.out.println("Expected: 0.03");
   }
}
