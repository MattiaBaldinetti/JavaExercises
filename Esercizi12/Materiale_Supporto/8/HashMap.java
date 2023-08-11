import java.util.HashSet;
import java.util.Collection;
import java.util.Set;

public class HashMap<K, V>
{
   private HashSet<Pair<K, V>> set;

   public HashMap()
   {
      . . .
   }
   
   public void put(K key, V value)
   {
      . . .
   }
   
   public V get(K key)
   {
      . . .
   }
 
   public V remove(K key)
   {
      . . .
   }
   
   public Set<K> keySet()
   {
      . . .
   }

   public int size()
   {
      return set.size();
   }
}
