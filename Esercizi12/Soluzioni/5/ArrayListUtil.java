import java.util.ArrayList;
/**
   Modify the method of Exercise E18.15 so that it leaves the first
   arraylist unchanged and returns a new arraylist containing the
   elements of both lists.
*/
public class ArrayListUtil
{
   public static <T> ArrayList<T> append(ArrayList<T> a, ArrayList<T> b)
   {
       ArrayList<T> result = new ArrayList<>();
       result.addAll(a);
       result.addAll(b);
       return result;
   }
}
