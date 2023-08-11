//HIDE
public class StringSetTester
{
   public static void main(String[] args)
   {
      StringSet ds = new StringSet("Tom", "Dick", "Harry");
      System.out.println("StringSet->\"Tom\", \"Dick\", \"Harry\"");
      System.out.println(ds.getSmallest());
      System.out.println("Expected: Dick");
      System.out.println(ds.getMiddle());
      System.out.println("Expected: Harry");
      System.out.println(ds.getLargest());
      System.out.println("Expected: Tom");
      
      ds = new StringSet("Tom", "Harry", "Dick");
      System.out.println("StringSet->\"Tom\", \"Harry\", \"Dick\"");
      System.out.println(ds.getSmallest());
      System.out.println("Expected: Dick");
      System.out.println(ds.getMiddle());
      System.out.println("Expected: Harry");
      System.out.println(ds.getLargest());
      System.out.println("Expected: Tom");

      ds = new StringSet("Harry", "Dick", "Tom");
      System.out.println("StringSet->\"Harry\", \"Dick\", \"Tom\"");
      System.out.println(ds.getSmallest());
      System.out.println("Expected: Dick");
      System.out.println(ds.getMiddle());
      System.out.println("Expected: Harry");
      System.out.println(ds.getLargest());
      System.out.println("Expected: Tom");

      ds = new StringSet("Harry", "Tom", "Dick");
      System.out.println("StringSet->\"Harry\", \"Tom\", \"Dick\"");
      System.out.println(ds.getSmallest());
      System.out.println("Expected: Dick");
      System.out.println(ds.getMiddle());
      System.out.println("Expected: Harry");
      System.out.println(ds.getLargest());
      System.out.println("Expected: Tom");

      ds = new StringSet("Dick", "Tom", "Harry");
      System.out.println("StringSet->\"Dick\", \"Tom\", \"Harry\"");
      System.out.println(ds.getSmallest());
      System.out.println("Expected: Dick");
      System.out.println(ds.getMiddle());
      System.out.println("Expected: Harry");
      System.out.println(ds.getLargest());
      System.out.println("Expected: Tom");

      ds = new StringSet("Dick", "Harry", "Tom");   
      System.out.println("StringSet->\"Dick\", \"Harry\", \"Tom\"");
      System.out.println(ds.getSmallest());
      System.out.println("Expected: Dick");
      System.out.println(ds.getMiddle());
      System.out.println("Expected: Harry");
      System.out.println(ds.getLargest());
      System.out.println("Expected: Tom");

      ds = new StringSet("Tom", "Dick", "Harry");
      System.out.println("StringSet->\"Tom\", \"Dick\", \"Tom\"");
      System.out.println(ds.getSmallest());
      System.out.println("Expected: Dick");
      System.out.println(ds.getMiddle());
      System.out.println("Expected: Harry");
      System.out.println(ds.getLargest());
      System.out.println("Expected: Tom");      
   }
}
