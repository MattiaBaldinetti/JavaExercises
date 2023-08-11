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
         try
         {
            harrysChecking.deposit(-100);
            System.out.println("success1");
         }
         catch (IllegalArgumentException e)
         {
            System.out.println("exception1");
         }
         System.out.println("Expected: exception1");

         try
         {
            harrysChecking.withdraw(100);
            System.out.println("success2");
         }
         catch (IllegalArgumentException e)
         {
            System.out.println("exception2");
         }
         System.out.println("Expected: exception2");

         try
         {
            harrysChecking = new BankAccount(-500);
            System.out.println("success3");
         }
         catch (IllegalArgumentException e)
         {
            System.out.println("exception3");
         }
         System.out.println("Expected: exception3");
         
         System.out.println("done");         
      }
      catch (Throwable t)
      {
         System.out.println("unexpected exception: " + t);         
      }
      System.out.println("Expected: done");
   }
}
