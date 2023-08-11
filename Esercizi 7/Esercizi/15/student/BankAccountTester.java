import java.util.ArrayList;

/**
   A class to test the BankAccount class.
*/
public class BankAccountTester
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

      System.out.println("Depositing 1000 to Harry's checking.");
      harrysChecking = BankAccount.deposit(harrysChecking, 1000.0);

      ArrayList<Double> harrysStatement = harrysChecking.getStatement();

      System.out.println("Harry's Statement:");
      for (int i = 0; i < harrysStatement.size(); i++)
      {
         System.out.println("Transaction " + i + ": " + harrysStatement.get(i));
      }

      System.out.println(harrysStatement.get(0));
      System.out.println("Expected: 2000.0");
      System.out.println(harrysStatement.get(1));
      System.out.println("Expected: -700.0");
      System.out.println(harrysStatement.get(2));
      System.out.println("Expected: 1000.0");
      System.out.println();

      harrysChecking.clearStatement();
      System.out.println("Cleared Harry's Statement.");
      harrysStatement = harrysChecking.getStatement();
      System.out.println(harrysStatement.size());
      System.out.println("Expected: 0");

      System.out.println();
      System.out.println("Depositing 300 to Harry's checking.");
      harrysChecking = BankAccount.deposit(harrysChecking, 300.0);

      ArrayList<Double> harrysNewStatement = harrysChecking.getStatement();

      System.out.println("Harry's New Statement:");
      for (int i = 0; i < harrysNewStatement.size(); i++)
      {
         System.out.println("Transaction " + i + ": "
               + harrysNewStatement.get(i));
      }
      System.out.println("Expected: Transaction 0: 300.0");
   }
}

/**
Harry's checking: 1000.0
Depositing 2000 to Harry's checking.
Withdrawing 700 from Harry's checking.
Depositing 1000 to Harry's checking.
Harry's Statement:
Transaction 0: 2000.0
Transaction 1: -700.0
Transaction 2: 1000.0
2000.0
Expected: 2000.0
-700.0
Expected: -700.0
1000.0
Expected: 1000.0

Cleared Harry's Statement.
0
Expected: 0

Depositing 300 to Harry's checking.
Harry's New Statement:
Transaction 0: 300.0
Expected: Transaction 0: 300.0
*/
