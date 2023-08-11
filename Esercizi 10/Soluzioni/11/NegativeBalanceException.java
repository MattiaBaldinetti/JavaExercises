/**
   This exception reports a negative initial balance on a bank account.
*/
public class NegativeBalanceException extends RuntimeException
{
   public NegativeBalanceException()
   {
   }
   
   public NegativeBalanceException(String message)
   {
      super(message);
   }
}
