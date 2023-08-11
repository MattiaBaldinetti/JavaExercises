import java.util.Scanner;

/**
   This program prints the elapsed time between two time points.
 */
public class ElapsedTimePrinter
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Please enter the first time:");
      int time1 = in.nextInt();

      System.out.println("Please enter the second time:");
      int time2 = in.nextInt();

      TimeInterval myInterval = new TimeInterval(time1, time2);

      System.out.println(myInterval.getHours() + " hours "
         + myInterval.getMinutes() + " minutes");
   }
}

