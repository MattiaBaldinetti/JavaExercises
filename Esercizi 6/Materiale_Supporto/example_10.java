/**
   Run some tests for the DataSet class
*/
public class example_10
{
   public static void main(String[] args)
   {
      DataSet data = new DataSet(5);
      data.add(3.5);
      data.add(7.9);
      data.add(15.2);
      data.add(-7.3);

      System.out.println("Sum: " + data.getSum());
      System.out.println("Expected: 19.3");
      System.out.println("Average: " + data.getAverage());
      System.out.println("Expected: 4.825");
      System.out.println("Maximum: " + data.getMaximum());
      System.out.println("Expected: 15.2");
      System.out.println("Minimum: " + data.getMinimum());
      System.out.println("Expected: -7.3");
   }
}
