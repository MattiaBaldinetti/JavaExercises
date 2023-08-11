public class Pair<T, S>
{
   private T first;
   private S second;

   public Pair(T firstElement, S secondElement)
   {
      first = firstElement;
      second = secondElement;
   }

   public T getFirst()
   {
      return first;
   }
   
   public S getSecond()
   {
      return second;
   }
   
   /**
      True if the first element of both pairs are equal.
    */
   public boolean equals(Object otherObject)
   {
      Pair<T, S> other = (Pair<T, S>) otherObject;
      return first.equals(other.getFirst());
   }
   
   public int hashCode()
   {
      int h = first.hashCode();
      return h;
   }
}
