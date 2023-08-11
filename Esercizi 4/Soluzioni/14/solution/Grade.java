/**
   This class models a grade.
*/
public class Grade
{
   private double numericGrade;

   /**
      Constructs a grade from a numeric value
      @param value 
   */
   public Grade(double value)
   {
      numericGrade = value;
   }

   /**
      Gets the numeric value of this grade.
      @return the numeric grade
   */
   public double getNumericGrade()
   {
      return numericGrade;
   }

   /**
      Find the letter grade from a numeric grade.
      @return grade the letter grade
   */
   public String getLetterGrade()
   {
      String letter = "";
      String mod = "";

      if (numericGrade >= 3.5)
         letter = "A";
      else if (numericGrade >= 2.5)
         letter = "B";
      else if (numericGrade >= 1.5)
         letter = "C";
      else if (numericGrade >= 0.5)
         letter = "D";
      else
         return "F";
      
      double remainder = numericGrade - (int) numericGrade;

      if ((0.5 <= remainder) && (remainder < 0.85))
         mod = "-";
      else if ((0.15 <= remainder) && (remainder < 0.5))
         mod = "+";

      return letter + mod;
   }
}
