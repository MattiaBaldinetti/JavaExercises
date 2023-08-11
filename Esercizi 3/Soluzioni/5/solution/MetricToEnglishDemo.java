
import java.util.Scanner;

public class MetricToEnglishDemo {

    public static void main(String[] args) {
        
        final double MILES_PER_METER = 0.00062137119;
        final double FEET_PER_METER = 3.2808399;
        final double INCHES_PER_METER = 39.370079;
        
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Please enter a distance in meters: ");
        double meters = keyIn.nextDouble();
        
        double miles = MILES_PER_METER * meters;
        double feet = FEET_PER_METER * meters;
        double inches = INCHES_PER_METER * meters;
        
        System.out.println("A distance of " + meters + " meters is equal to:");
        System.out.println(miles + " miles");
        System.out.println(feet + " feet");
        System.out.println(inches + " inches");
    }
    
}
