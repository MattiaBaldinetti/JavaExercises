import java.util.Scanner;

/**
   This program sorts three strings.
*/
public class StringSorterDemo
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Please enter three strings:");
      String str1 = in.next();
      String str2 = in.next();
      String str3 = in.next();

      StringSet s = new StringSet(str1, str2, str3);

      System.out.println(s.getSmallest() + "\n"
                       + s.getMiddle() + "\n"
                       + s.getLargest());
   }
}
