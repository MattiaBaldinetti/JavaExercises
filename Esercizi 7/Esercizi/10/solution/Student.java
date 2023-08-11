import java.util.ArrayList;

/**
   A student has a name and a list of scores.
   Their final score can be computed by summing up all their
   scores and dropping the lowest. If there is only one score,
   the final score is the single score. If there are no scores,
   the final score is zero.
*/
public class Student
{
   private ArrayList<Double> scores;
   private String name;

   /**
      Constructs a gradebook with no scores.
   */
   public Student(String name)
   {
      scores = new ArrayList<Double>();
      this.name = name;
   }

   /**
      Accessor method for student name.
      @return name
   */
   public String getName()
   {
      return name;
   }

   /**
      Adds a score to this gradebook.
      @param score the score to add
   */
   public void addScore(double score)
   {
      scores.add(score);
   }

   /**
      Computes the sum of the scores in this gradebook.
      @return the sum of the scores
   */
   private double sum()
   {
      double total = 0;
      for (double element : scores)
      {
         total = total + element;
      }
      return total;
   }
      
   /**
      Gets the minimum score in this gradebook.
      @return the minimum score, or 0 if there are no scores.
   */
   private double minimum()
   {
      if (scores.size() == 0) return 0;
      double smallest = scores.get(0);
      for (int i = 1; i < scores.size(); i++)
      {
         if (scores.get(i) < smallest)
         {
            smallest = scores.get(i);
         }
      }
      return smallest;
   }

   /**
      Gets the final score for this gradebook.
      @return the sum of the scores, with the lowest score dropped if 
      there are at least two scores, or 0 if there are no scores.
   */
   public double getFinalScore() 
   {
      if (scores.size() == 0)
         return 0;
      else if (scores.size() == 1)
         return scores.get(0);
      else
         return sum() - minimum();
   }
}
