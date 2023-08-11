//HIDE
public class GradeTester
{
   public static void main(String[] args)
   {
      System.out.println("A:  " + new Grade("A").getNumericGrade());
      System.out.println("Expected: 4");
      System.out.println("A+: " + new Grade("A+").getNumericGrade());
      System.out.println("Expected: 4");
      System.out.println("A-: " + new Grade("A-").getNumericGrade());
      System.out.println("Expected: 3.7");
      System.out.println("C:  " + new Grade("C").getNumericGrade());
      System.out.println("Expected: 2");
      System.out.println("C+: " + new Grade("C+").getNumericGrade());
      System.out.println("Expected: 2.3");
      System.out.println("C-: " + new Grade("C-").getNumericGrade());
      System.out.println("Expected: 1.7");
      System.out.println("F:  " + new Grade("F").getNumericGrade());
      System.out.println("Expected: 0");
  }
}
