import java.util.Scanner;
import java.util.InputMismatchException;

public class DataReader
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      int chances = 0;
      boolean done = false;
      double sum = 0;
      
      while (!done)
      {
         double value = 0;                  
         try
         {
            System.out.print("Value: ");
            value = in.nextDouble();
            sum += value;
            chances = 0; 
         }   
         catch (InputMismatchException e)
         {   
            System.out.println("Input error. Try again.");    
            chances++;
            in.next(); // consume bad input
            if (chances == 2)
               done = true;
         }
      }
      
      System.out.println("Sum: " + sum);
   }
}
