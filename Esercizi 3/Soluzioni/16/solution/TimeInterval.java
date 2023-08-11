public class TimeInterval
{
   private final int MINUTES_PER_DAY = 24 * 60;

   private int time1;
   private int time2;

   /**
      Constructs a time interval to display the number of
      hours and minutes between two times.
      @param military1 first time in military format
      @param military2 second time in military format
   */
   public TimeInterval(int military1, int military2)
   {
      int hours1 = military1 / 100;
      int minutes1 = military1 % 100;

      int hours2 = military2 / 100;
      int minutes2 = military2 % 100;

      time1 = hours1 * 60 + minutes1;
      time2 = hours2 * 60 + minutes2;
   }

   /**
      Gets the difference in hours
      @return difference in hours
   */
   public int getHours()
   {
      int timeDifference = (time2 - time1 + MINUTES_PER_DAY) % MINUTES_PER_DAY;
      return timeDifference / 60;
   }

   /**
      Gets the difference in minutes
      @return difference in minutes
   */
   public int getMinutes()
   {
      int timeDifference = (time2 - time1 + MINUTES_PER_DAY) % MINUTES_PER_DAY;
      return timeDifference % 60;
   }
}
