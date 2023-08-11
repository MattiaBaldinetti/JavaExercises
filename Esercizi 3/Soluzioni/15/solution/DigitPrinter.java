import java.util.Scanner;

public class DigitPrinter
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Please enter a 5 digit integer: ");
      int number = in.nextInt();
      String result = "";
      
      result  = (number % 10) + " " + result;
      number = number / 10;
      result  = (number % 10) + " " + result;
      number = number / 10;
      result  = (number % 10) + " " + result;
      number = number / 10;
      result  = (number % 10) + " " + result;
      number = number / 10;
      result  = (number % 10) + " " + result;
      
      System.out.println(result);
    
   }
}
