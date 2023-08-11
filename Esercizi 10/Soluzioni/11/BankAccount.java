/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{  
   private double balance;

   /**
      Constructs a bank account with a zero balance
   */
   public BankAccount()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
      if (initialBalance < 0)
         throw new NegativeBalanceException(
               "Cannot create account: " + initialBalance + " is less than zero");   
            
      balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      if (amount < 0)
         throw new NegativeAmountException(
               "Deposit of " + amount + " is less than zero");
      double newBalance = balance + amount;
      balance = newBalance;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      if (amount < 0)
         throw new NegativeAmountException(
               "Withdrawal of " + amount + " is less than zero");
      
      if (amount > balance)
         throw new InsufficientFundsException(
               "Withdrawal of " + amount + " exceeds balance of " + balance);        
      
      double newBalance = balance - amount;
      balance = newBalance;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
}
