/**
   This class computes various statistics from a
   set of data values.
*/
public class DataSet
{
   private double[] data;
   private int dataSize;

   /**
      Constructs an empty data set.
      @param maximumNumberOfValues the maximum this data set can hold
   */
   public DataSet(int maximumNumberOfValues)
   {
      data = new double[maximumNumberOfValues];
      dataSize = 0;
   }

   /**
      Adds a data value to the data set.
      @param value a data value
   */
   public void add(double value)
   {
      if (dataSize < data.length)
      {
         data[dataSize] = value;
         dataSize++;
      }
   }

   /**
      Gets the sum of the added data.
      @return sum of the data or 0 if no data has been added
   */
   public double getSum()
   {
      double sum = 0;
      for (int i = 0; i < dataSize; i++)
      {
         sum = sum + data[i];
      }

      return sum;
   }

   /**
      Gets the average of the added data.
      @return average of the data or 0 if no data has been added
   */
   public double getAverage()
   {
      if (dataSize == 0) return 0;
      return getSum() / dataSize;
   }

   /**
      Gets the maximum value entered.
      @return maximum value of the data
      NOTE: returns -Double.MAX_VALUE if no values are entered.
   */
   public double getMaximum()
   {
      if (dataSize == 0) return -Double.MAX_VALUE;

      double largest = data[0];

      for (int i = 1; i < dataSize; i++)
      {
         if (data[i] > largest)
         {
            largest = data[i];
         }
      }

      return largest;
   }

   /**
      Gets the minimum value entered.
      @return minimum value of the data
      NOTE: returns Double.MAX_VALUE if no values are entered.
   */
   public double getMinimum()
   {
      if (dataSize == 0) return Double.MAX_VALUE;

      double smallest = data[0];

      for (int i = 1; i < dataSize; i++)
      {
         if (data[i] < smallest)
         {
            smallest = data[i];
         }
      }

      return smallest;
   }

}
