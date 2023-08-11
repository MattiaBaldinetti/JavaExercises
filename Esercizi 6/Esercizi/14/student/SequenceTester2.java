//HIDE
import java.util.Scanner;

public class SequenceTester2
{
   public static void main(String[] args)
   {
      int[] a1 = {1, 4, 9, 16, 9, 7, 4, 9, 11};
      int[] a2 = {11, 11, 7, 9, 16, 4, 1};

      Sequence first = new Sequence(a1.length);
      Sequence second = new Sequence(a2.length);

      for (int i = 0; i < a1.length; i++)
      {
         first.set(i, a1[i]);
      }
      for (int i = 0; i < a2.length; i++)
      {
         second.set(i, a2[i]);
      }

      Sequence third = first.sum(second);

      int thirdSize = third.size();
      int largestLen = Math.max(a1.length, a2.length);

      System.out.println("Size: " + thirdSize);
      System.out.println("Expected: " + largestLen);

      for (int i = 0; i < largestLen; i++)
      {
         if (i < thirdSize)
         {
            System.out.println("get(" + i + "): " + third.get(i));
         }
         else
         {
            System.out.println("get(" + i + "): ERROR; result is too small.");
         }
         System.out.print("Expected: " );
         if (i < a1.length && i < a2.length)
         {
            System.out.println(a1[i] + a2[i]);
         }
         else if (i < a1.length)
         {
            System.out.println(a1[i]);
         }
         else
         {
            System.out.println(a2[i]);
         }
      }
   }
}
