import java.util.Scanner;

public class PrintNumberStats
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter the first integer: ");
      int firstInt = in.nextInt();
      System.out.print("Please enter the second integer: ");
      int secondInt = in.nextInt();

      int sum = firstInt + secondInt;
      System.out.printf("Sum:        %8d\n", sum);

      int difference = firstInt - secondInt;
      System.out.printf("Difference: %8d\n", difference);

      int product = firstInt * secondInt;
      System.out.printf("Product:    %8d\n", product);

      double average = (firstInt + secondInt) / 2.0;
      System.out.printf("Average:    %11.2f\n", average);

      int distance = Math.abs(difference);
      System.out.printf("Distance:   %8d\n", distance);

      int max = Math.max(firstInt, secondInt);
      System.out.printf("Maximum:    %8d\n", max);

      int min = Math.min(firstInt, secondInt);
      System.out.printf("Minimum:    %8d\n", min);
   }
}
