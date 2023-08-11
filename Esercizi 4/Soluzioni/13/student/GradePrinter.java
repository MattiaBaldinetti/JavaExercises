import java.util.Scanner;
/**
   This class prints the numeric value of a letter 
   grade given by the user.
*/
public class GradePrinter
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);      
      System.out.print("Enter a letter grade: ");
      String input = in.nextLine();
      
      Grade g = new Grade(input);
      double grade = g.getNumericGrade();
      System.out.println("Numeric value: " + grade);
   }
}


