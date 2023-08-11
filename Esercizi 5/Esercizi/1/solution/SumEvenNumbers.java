public class SumEvenNumbers
{
   public static void main(String[] args)
   {
      int sum = 0;
      // The sum of all even numbers between 2 and 100
      for (int x = 2; x <= 100; x = x + 2)
      {
         sum = sum + x;
      }
      // Output the result
      System.out.println("The sum is " + sum);
   }
}