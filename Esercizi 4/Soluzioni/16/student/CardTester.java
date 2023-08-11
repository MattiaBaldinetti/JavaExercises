//HIDE
public class CardTester
{
   public static void main(String[] args)
   {      
      System.out.println("4S: " + new Card("4S").getDescription());
      System.out.println("Expected: Four of Spades");  
      System.out.println("CQ: " + new Card("QC").getDescription());
      System.out.println("Expected: Queen of Clubs");  
      System.out.println("AD: " + new Card("AD").getDescription());
      System.out.println("Expected: Ace of Diamonds");  
      System.out.println("10S:" + new Card("10S").getDescription());
      System.out.println("Expected: Ten of Spades");  
      System.out.println("CA: " + new Card("CA").getDescription());
      System.out.println("Expected: Unknown");  
      System.out.println(":   " + new Card("").getDescription());
      System.out.println("Expected: Unknown");  
      System.out.println("?:  " + new Card("?").getDescription());
      System.out.println("Expected: Unknown");  
   }
}
