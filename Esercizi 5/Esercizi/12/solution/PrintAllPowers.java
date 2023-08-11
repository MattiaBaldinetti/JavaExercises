public class PrintAllPowers
{
   public static void main(String[] args)
   {
      for (int power = 0; power <= 20; power++)
      {
         System.out.println("2^" + power + " = " + (int) Math.pow(2, power));
      }
   }
}