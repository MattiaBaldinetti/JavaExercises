import java.util.HashSet;
import java.util.Collection;
import java.util.Set;

public class HashMap<K, V>
{
   private HashSet<Pair<K, V>> set;

   public HashMap()
   {
      set = new HashSet<Pair<K, V>>();
   }
   
   public void put(K key, V value)
   {
      Pair<K, V> p = new Pair<K, V>(key, value);

      set.remove(p);
      set.add(p);
   }
   
   public V get(K key)
   {
      // It is disappointing that the linear search cannot be avoided
      for (Pair<K, V> pair : set)
         if (pair.getFirst().equals(key))
            return pair.getSecond();
      return null;
   }
 
   public V remove(K key)
   {
      // It is disappointing that the linear search cannot be avoided
      for (Pair<K, V> pair : set)
         if (pair.getFirst().equals(key))
         {
            set.remove(pair);
            return pair.getSecond();
         }
      return null;
   }

   public Set<K> keySet()
   {
      Set<K> keySet = new HashSet<K>();
      for (Pair<K, V> pair : set)
         keySet.add(pair.getFirst());
      return keySet;
   }       

   public int size()
   {
      return set.size();
   }
}
