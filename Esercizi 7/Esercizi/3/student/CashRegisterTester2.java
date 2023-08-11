//HIDE
/**
   This program tests the CashRegister class.
*/
public class CashRegisterTester2
{
   public static void main(String[] args)
   {
      final double NICKEL_VALUE = 0.05;
      final double DIME_VALUE = 0.1;
      final double QUARTER_VALUE = 0.25;
      final double DOLLAR_VALUE = 1.0;
      final double FIVE_DOLLAR_VALUE = 5.0;

      CashRegister myRegister = new CashRegister();
      myRegister.recordPurchase(4.57);
      myRegister.enterPayment(1, new MonetaryUnit(FIVE_DOLLAR_VALUE, "five dollar bill"));
      myRegister.enterPayment(2, new MonetaryUnit(QUARTER_VALUE, "quarter"));
      myRegister.enterPayment(1, new MonetaryUnit(DIME_VALUE, "dime"));

      double myChange = myRegister.giveChange();
      System.out.printf("Change: %5.2f\n",myChange);
      System.out.println("Expected: 1.03");
   }
}
