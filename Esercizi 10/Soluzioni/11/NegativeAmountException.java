/**
   This exception reports a negative amount on a deposit or withdraw
   operation on a bank account.
*/
public class NegativeAmountException extends RuntimeException
{
   public NegativeAmountException()
   {
   }
   
   public NegativeAmountException(String message)
   {
      super(message);
   }
}

