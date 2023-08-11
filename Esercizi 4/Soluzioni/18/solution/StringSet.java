/**
   This class finds the smallest, middle, and largest of 
   three strings.
*/
public class StringSet
{
   private String smallest;
   private String largest;
   private String middle;

   /**
      Constructs a string set that processes three strings.
      @param str1 the first string to sort
      @param str2 the second string to sort
      @param str3 the third string to sort
   */
   public StringSet(String str1, String str2, String str3)
   {
      largest = str1;
      smallest = str1;
      if (str2.compareTo(smallest) < 0)
         smallest = str2;
      if (str3.compareTo(smallest) < 0)
         smallest = str3;
      if (str2.compareTo(largest) > 0)
         largest = str2;
      if (str3.compareTo(largest) > 0)
         largest = str3;
      if (!str1.equals(largest) && !str1.equals(smallest))
         middle = str1;
      else if (!str2.equals(largest) && !str2.equals(smallest))
         middle = str2;
      else 
         middle = str3;
   }

   /**
      Gets the smallest string in the string set.
      @return smallest the smallest of three strings
   */
   public String getSmallest()
   {
      return smallest;
   }

   /**
      Gets the largest string in the string set.
      @return largest the largest of three strings
   */
   public String getLargest()
   {
      return largest;
   }

   /**
      Gets the middle string in the string set.
      @return middle the middle string of three strings
   */
   public String getMiddle()
   {
      return middle;
   }
}
