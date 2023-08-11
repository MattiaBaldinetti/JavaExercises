public class Student
{
   private double[] scores;
   private int scoresSize;

   public Student(int capacity)
   {
      scores = new double[capacity];
      scoresSize = 0;
   }

   public boolean addScore(double score)
   {
      if (scoresSize >= scores.length)
         return false;
      scores[scoresSize] = score;
      scoresSize++;
      return true;
   }

   public double sum()
   {
      if (scoresSize == 0)
      {
         return 0.0;
      }
      if (scores.length == 1)
      {
         return scores[0];
      }
      double sum = scores[0];
      for (int i = 1; i < scoresSize; i++)
      {
         sum += scores[i];
      }
      return sum;
   }

   public double minimum()
   {
      if (scoresSize == 0)
      {
         return 0.0;
      }
      if (scores.length == 1)
      {
         return scores[0];
      }
      double minimum = scores[0];
      for (int i = 1; i < scoresSize; i++)
      {
         if (scores[i] < minimum)
         {
            minimum = scores[i];
         }
      }
      return minimum;
   }

   public double finalScore()
   {
      if (scoresSize == 0)
      {
         return 0;
      }
      else if (scores.length == 1)
      {
         return scores[0];
      }
      else
      {
         return sum() - minimum();
      }
   }

   public void removeMin()
   {
      if (scoresSize == 0)
         return;
      double minimum = scores[0];
      int minScore = 0;
      for (int i = 1; i < scoresSize; i++)
      {
         if (scores[i] < minimum)
         {
            minimum = scores[i];
            minScore = i;
         }
      }
      for (int i = minScore; i < scoresSize - 1; i++)
      {
         scores[i] = scores[i + 1];
      }
      scoresSize--;
   }
}