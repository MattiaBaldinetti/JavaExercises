import java.util.Scanner;

/**
   This class prints the letter grade corresponding 
   to a numeric value given by the user.
*/
public class GradePrinter
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter a numeric value: ");
      double numGrade = in.nextDouble();

      Grade g = new Grade(numGrade);

      System.out.println("Letter grade: " + g.getLetterGrade());
   }
}
