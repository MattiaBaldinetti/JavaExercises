import java.util.ArrayList;
/**
   Provide a static method that checks whether a generic
   array list is a palindrome.
*/
public class ArrayListUtil
{
   public static <T> boolean isPalindrome(ArrayList<T> a)
   {
      int len = a.size();
      for (int i = 0; i < len / 2; i++)
      {
         if (! a.get(i).equals(a.get(len - 1 - i)))
            return false;
      }
      return true;
   }
}
