import java.util.ArrayList;
/**
   Provide a static method that returns an arraylist with all
   elements reversed. Do not modify the original list.
*/
public class ArrayListUtil
{
   public static <T> ArrayList<T> reverse(ArrayList<T> a)
   {
      // Avoid resizing? we know the output size
      int len = a.size();
      ArrayList<T> result = new ArrayList<>(a.size());
      for (int i = len - 1; i >= 0; i--)
      {
         result.add(a.get(i));
      }

      return result;
   }
}
