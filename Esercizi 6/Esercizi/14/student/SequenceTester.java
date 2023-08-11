import java.util.Scanner;

public class SequenceTester
{
   public static void main(String[] args)
   {
      Sequence first = new Sequence(5);
      Sequence second = new Sequence(5);

      first.set(0, 1);
      first.set(1, 3);
      first.set(2, 5);
      first.set(3, 7);
      first.set(4, 9);

      second.set(0, 1);
      second.set(1, 4);
      second.set(2, 5);
      second.set(3, 8);
      second.set(4, 9);

      Sequence third = first.sum(second);

      System.out.println("Size: " + third.size());
      System.out.println("Expected: 5");
      System.out.println("get(0): " + third.get(0));
      System.out.println("Expected: 2");
      System.out.println("get(1): " + third.get(1));
      System.out.println("Expected: 7");
      System.out.println("get(2): " + third.get(2));
      System.out.println("Expected: 10");
      System.out.println("get(3): " + third.get(3));
      System.out.println("Expected: 15");
      System.out.println("get(4): " + third.get(4));
      System.out.println("Expected: 18");
   }
}
