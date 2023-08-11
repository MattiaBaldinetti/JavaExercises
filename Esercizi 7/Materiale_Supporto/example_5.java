/**
   A class to test the BankAccount class.
*/
public class BankAccountDemo
{
   /**
      Tests the methods of the BankAccount class.
      @param args not used
   */
   public static void main(String[] args)
   {
      BankAccount harrysChecking = new BankAccount(1, 1000.0);
      System.out.println("Harry's checking: " + harrysChecking.getBalance());

      System.out.println("Depositing 2000 to Harry's checking.");
      harrysChecking = BankAccount.deposit(harrysChecking, 2000.0);

      System.out.println("Withdrawing 700 from Harry's checking.");
      harrysChecking = BankAccount.withdraw(harrysChecking, 700.0);

      System.out.println("Harry's checking: " + harrysChecking.getBalance());
      System.out.println("Expected: 2300.0");
   }
}

/**
Harry's checking: 1000.0
Depositing 2000 to Harry's checking.
Withdrawing 700 from Harry's checking.
Harry's checking: 2300.0
Expected: 2300.0
**/
