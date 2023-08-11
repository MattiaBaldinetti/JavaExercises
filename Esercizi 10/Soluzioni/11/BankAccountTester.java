/**
   A class to test the BankAccount class.
*/
public class BankAccountTester
{
   public static void main(String[] args)
   {
      BankAccount harrysChecking = new BankAccount();
      
      try
      {
         harrysChecking = new BankAccount(-500);
         System.out.println("success");
      }
      catch (NegativeBalanceException e)
      {
         System.out.println("exception");
      }
      System.out.println("Expected: exception");

      try
      {
         harrysChecking.deposit(-100);
         System.out.println("success");
      }
      catch (NegativeAmountException e)
      {
         System.out.println("exception");
      }
      System.out.println("Expected: exception");

      try
      {
         harrysChecking.withdraw(100);
         System.out.println("success");
      }
      catch (InsufficientFundsException e)
      {
         System.out.println("exception");
      }
      System.out.println("Expected: exception");
   }
}
