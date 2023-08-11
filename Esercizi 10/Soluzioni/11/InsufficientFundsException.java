/**
   This exception reports an insufficient fund on an
   amount of a bank account.
*/
public class InsufficientFundsException extends RuntimeException
{
   public InsufficientFundsException()
   {
   }
   
   public InsufficientFundsException(String message)
   {
      super(message);
   }
}
