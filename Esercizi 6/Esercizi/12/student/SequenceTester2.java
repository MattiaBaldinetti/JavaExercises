//HIDE
import java.util.Scanner;

public class SequenceTester2
{
   public static void main(String[] args)
   {
      int[] a1 = {1, 4, 9};
      int[] a2 = {9, 4, 1};
      int[] a3 = {9, 4, 1};
      int[] a4 = {1, 4, 9, 11};

      Sequence first = new Sequence(a1.length);
      Sequence second = new Sequence(a2.length);
      Sequence third = new Sequence(a3.length);
      Sequence fourth = new Sequence(a4.length);

      for (int i = 0; i < 3; i++)
      {
         first.set(i, a1[i]);
         second.set(i, a2[i]);
         third.set(i, a3[i]);
         fourth.set(i, a4[i]);
      }
      fourth.set(3, a4[3]);

      System.out.println(first.equals(second));
      System.out.println("Expected: false");

      System.out.println(second.equals(third));
      System.out.println("Expected: true");

      System.out.println(third.equals(second));
      System.out.println("Expected: true");

      System.out.println(first.equals(fourth));
      System.out.println("Expected: false");
   }
}
