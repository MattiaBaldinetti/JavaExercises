import java.util.Scanner;

public class example_12
{
   public static void main(String[] args)
   {
      Sequence first = new Sequence(5);
      Sequence second = new Sequence(5);
      Sequence third = new Sequence(5);

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

      third.set(0, 1);
      third.set(1, 3);
      third.set(2, 5);
      third.set(3, 7);
      third.set(4, 9);

      System.out.println(first.equals(second));
      System.out.println("Expected: false");

      System.out.println(first.equals(third));
      System.out.println("Expected: true");
   }
}
