/**
 * Tests the mutable Day class.
 */
public class DayTester
{
   public static void main(String[] args)
   {
      Day today = new Day(2012, 2, 28); // February 28, 2012
      Day later = new Day(today.getYear(), 
                          today.getMonth(),
                          today.getDate());
      // Change the date
      later.addDays(30);

      System.out.println("Year: " + later.getYear());
      System.out.println("Expected: 2012");
      System.out.println("Month: " + later.getMonth());
      System.out.println("Expected: 3");
      System.out.println("Date: " + later.getDate());
      System.out.println("Expected: 29");
      System.out.println("Days from today: " + later.daysFrom(today)); 
      System.out.println("Expected: 30");
      
      // Let's try the other mutators
      today.nextDay();
      System.out.println("Month (today): " + today.getMonth());
      System.out.println("Expected: 2");
      System.out.println("Date (today): " + today.getDate());
      System.out.println("Expected: 29");
      System.out.println("Days from later: " + later.daysFrom(today)); 
      System.out.println("Expected: 29");
      
      today.previousDay();
      today.previousDay();
      System.out.println("Date (today): " + today.getDate());
      System.out.println("Expected: 27");
      System.out.println("Days from later: " + later.daysFrom(today)); 
      System.out.println("Expected: 31");
      
      
      
   }
}
