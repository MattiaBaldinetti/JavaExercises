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
      myRegister.enterPayment(1, new Coin(QUARTER_VALUE, "quarter"));
      myRegister.enterPayment(1, new Coin(NICKEL_VALUE, "nickel"));
      myRegister.enterPayment(2, new Coin(PENNY_VALUE, "penny"));


      double myChange = myRegister.giveChange();
      System.out.println("Change: " + myChange);
      System.out.println("Expected: -0.25");
   }
}
