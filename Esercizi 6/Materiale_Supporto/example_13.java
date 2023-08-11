import java.util.Scanner;

public class SequenceTester
{
   public static void main(String[] args)
   {
      Sequence first = new Sequence(9);
      Sequence second = new Sequence(8);
      Sequence third = new Sequence(7);

      first.set(0, 1);
      first.set(1, 4);
      first.set(2, 9);
      first.set(3, 16);
      first.set(4, 9);
      first.set(5, 7);
      first.set(6, 4);
      first.set(7, 9);
      first.set(8, 11);

      second.set(0, 1);
      second.set(1, 4);
      second.set(2, 5);
      second.set(3, 3);
      second.set(4, 5);
      second.set(5, 7);
      second.set(6, 9);
      second.set(7, 7);

      third.set(0, 11);
      third.set(1, 11);
      third.set(2, 7);
      third.set(3, 9);
      third.set(4, 16);
      third.set(5, 4);
      third.set(6, 1);

      System.out.println(first.sameValues(second));
      System.out.println("Expected: false");

      System.out.println(first.sameValues(third));
      System.out.println("Expected: true");
   }
}
