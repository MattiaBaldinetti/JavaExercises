
import java.util.Scanner;

public class PowersDemo {

    public static void main(String[] args) {
        
        double number;
        Scanner keyIn = new Scanner(System.in);
        
        System.out.println("Please enter a number now: ");
        number = keyIn.nextDouble();
        
        double square = number * number;
        double cube = number * number * number;
        double fourth = Math.pow(number, 4);
        
        System.out.println(square);
        System.out.println(cube);
        System.out.println(fourth);
    }
}
