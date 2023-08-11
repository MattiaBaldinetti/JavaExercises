import java.util.Scanner;
import java.util.ArrayList;

/**
   A gradebook keeps track of a list of students.
*/
public class GradeBook
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      ArrayList<Student> students = new ArrayList<Student>();

      boolean done = false;

      /* get student names */
      while(!done)
      {
         
         System.out.println("Enter a student name, Q to quit:");
         String name = in.nextLine();
         if (name.equals("Q")) done = true;
         else students.add(new Student(name));        
      }

      /* get grades for each student */
      for (Student s : students)
      {
         System.out.println("Enter scores for " + s.getName() + ", Q to quit:");
         while (in.hasNextDouble())
         {  
            s.addScore(in.nextDouble());
         }
         in.next(); // Read off "Q"
      }

      /* print names of students and their final scores */
      for (Student s : students)
      {
         System.out.println(s.getName() + ": " + s.getFinalScore());
      }
   }
}

