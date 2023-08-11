import java.util.ArrayList;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{
   private int accountNumber;
   private double balance;
   private ArrayList<Double> statement;

   /**
      Constructs a bank account with a zero balance
      @param anAccountNumber the account number for this account
   */
   public BankAccount(int anAccountNumber)
   {
      accountNumber = anAccountNumber;
      balance = 0;
      statement = new ArrayList<Double>();
   }

   /**
      Constructs a bank account with a given balance.
      @param anAccountNumber the account number for this account
      @param initialBalance the initial balance
   */
   public BankAccount(int anAccountNumber, double initialBalance)
   {
      accountNumber = anAccountNumber;
      balance = initialBalance;
      statement = new ArrayList<Double>();
   }

   /**
      Gets the account number of this bank account.
      @return the account number
   */
   public int getAccountNumber()
   {
      return accountNumber;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public static BankAccount deposit(BankAccount account, double amount)
   {
      BankAccount newAccount = new BankAccount(account.accountNumber,
            account.balance + amount);
      for (Double transaction : account.statement)
      {
         newAccount.statement.add(transaction);
      }
      newAccount.statement.add(amount);
      return newAccount;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public static BankAccount withdraw(BankAccount account, double amount)
   {
      BankAccount newAccount = new BankAccount(account.accountNumber,
            account.balance - amount);
      for (Double transaction : account.statement)
      {
         newAccount.statement.add(transaction);
      }
      newAccount.statement.add(0.0 - amount);
      return newAccount;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {
      return balance;
   }

   /**
      Gets the statement for this bank account.
      @return the statement for the account
   */
   public ArrayList<Double> getStatement()
   {
      return (ArrayList<Double>) statement.clone();
   }

   /**
      Clears the statement for this bank account.
   */
   public void clearStatement()
   {
      statement.clear();
   }
}
