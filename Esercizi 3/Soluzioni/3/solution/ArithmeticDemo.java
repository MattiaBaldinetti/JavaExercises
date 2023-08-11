
import java.util.Scanner;

public class ArithmeticDemo {

    public static void main(String[] args) {
      
     Scanner keyIn = new Scanner(System.in);
     int value1, value2;
     
     System.out.println("Please enter a first integer: ");
     value1 = keyIn.nextInt();
     System.out.println("Please enter a second integer: ");
     value2 = keyIn.nextInt();
     
     int sum = value1 + value2;
     int difference = value1 - value2;
     int product = value1 * value2;
     double average = (value1 + value2) / 2.0;
     int distance = Math.abs(difference);
     int maximum = Math.max(value1, value2);
     int minimum = Math.min(value1, value2);
     
     System.out.println(sum);
     System.out.println(difference);
     System.out.println(product);
     System.out.println(average);
     System.out.println(distance);
     System.out.println(maximum);
     System.out.println(minimum);
    }
}
