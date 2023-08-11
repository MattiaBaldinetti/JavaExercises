//HIDE
/**
   This program calculates taxes based on the original
   U.S. income tax schedule in 1913.
*/
public class TaxCalculatorTester
{
   public static void main(String[] args)
   {
      double income = 600000;

      TaxReturn aTaxReturn = new TaxReturn(income);

      System.out.println("Income of " + income 
                  + ", Tax: " + aTaxReturn.getTax());
      System.out.println("Expected: 26250.0");

      income = 1000;
      aTaxReturn = new TaxReturn(income);
      System.out.println("Income of " + income 
                  + ", Tax: " + aTaxReturn.getTax());
      System.out.println("Expected: 10.0");

      income = 117000;
      aTaxReturn = new TaxReturn(income);
      System.out.println("Income of " + income 
                  + ", Tax: " + aTaxReturn.getTax());
      System.out.println("Expected: 2430.0");

      income = 60000;
      aTaxReturn = new TaxReturn(income);
      System.out.println("Income of " + income 
                  + ", Tax: " + aTaxReturn.getTax());
      System.out.println("Expected: 700.0");

      income = 85000;
      aTaxReturn = new TaxReturn(income);
      System.out.println("Income of " + income 
                  + ", Tax: " + aTaxReturn.getTax());
      System.out.println("Expected: 1300.0");
      
      income = 110000;
      aTaxReturn = new TaxReturn(income);
      System.out.println("Income of " + income 
                  + ", Tax: " + aTaxReturn.getTax());
      System.out.println("Expected: 2150.0");
      
      income = 260000;
      aTaxReturn = new TaxReturn(income);
      System.out.println("Income of " + income 
                  + ", Tax: " + aTaxReturn.getTax());
      System.out.println("Expected: 8250.0");

      income = 510000;
      aTaxReturn = new TaxReturn(income);
      System.out.println("Income of " + income 
                  + ", Tax: " + aTaxReturn.getTax());
      System.out.println("Expected: 20850.0");
   }
}
