/**
   This class represents a quiz score and grade
*/
public class Quiz implements Measurable
{
   private double score;
   private String grade;

   /**
      Constructs a quiz object
      @param aScore the quiz score
      @param aGrade the quiz grade
   */
   public Quiz(double aScore, String aGrade)
   {
      score = aScore;
      grade = aGrade;
   }

   /**
      Gets the quiz score
      @return the quiz score
   */
   public double getScore()
   {
      return score;
   }

   /**
      Gets the quiz grade
      @return the quiz grade
   */
   public String getGrade()
   {
      return grade;
   }

   /**
      Gets the quiz score for the Measureable interface
      @return the quiz score
   */
   public double getMeasure()
   {
      return score;
   }
}
