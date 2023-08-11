import java.util.Scanner;
import java.util.ArrayList;

public class GradeBook
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      ArrayList<String> nameList = new ArrayList<String>();
      ArrayList<Double> scoreList = new ArrayList<Double>();
      boolean done = false;

      /* get student names */
      while(!done)
      {
         
         System.out.println("Enter a student name, Q to quit:");
         String name = in.nextLine();
         if (name.equals("Q")) done = true;
         else nameList.add(name);        
      }

      /* get grades for each student */
      for (String n : nameList)
      {
         scoreList.add(getScores(n, in));
      }

      /* print names of students and their final scores */
      for (int i = 0; i < nameList.size(); i++)
      {
         System.out.println(nameList.get(i) + ": " + scoreList.get(i));
      }
   }

   /**
      Gets the scores for an individual student, then
      returns the final score for a list of scores.

      @param name - the name of the student being processed
      @return the sum of the scores, with the lowest score dropped if 
      there are at least two scores, or 0 if there are no scores.
   */
   public static double getScores(String name, Scanner in)
   {
      ArrayList<Double> scores = new ArrayList<Double>();
      
      System.out.println("Enter scores for " + name + ", Q to quit:");
      while (in.hasNextDouble())
      {  
         scores.add(in.nextDouble());
      }
      in.next(); // Read off "Q"

      return finalScore(scores);
   }

   /**
      Gets the final score for a list of scores.

      @param scores - the list of scores for one student to process
      @return the sum of the scores, with the lowest score dropped if 
      there are at least two scores, or 0 if there are no scores.
   */
   public static double finalScore(ArrayList<Double> scores) 
   {
      if (scores.size() == 0)
         return 0;
      else if (scores.size() == 1)
         return scores.get(0);
      else
         return sum(scores) - minimum(scores);
   }

   /**
      Gets the minimum score in a list of scores.

      @param scores - the list of scores for one student to process
      @return the minimum score, or 0 if there are no scores.
   */
   public static double minimum(ArrayList<Double> scores)
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
      Computes the sum of the scores in a list of scores.

      @param scores - the list of scores for one student to process
      @return the sum of the scores
   */
   public static double sum(ArrayList<Double> scores)
   {
      double total = 0;
      for (double element : scores)
      {
         total = total + element;
      }
      return total;
   }
}
