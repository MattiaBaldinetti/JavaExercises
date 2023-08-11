import java.util.Scanner;

/**
   This is a test for the Card class, which outputs
   the full description of a deck of cards.
*/
public class CardPrinter
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter the card notation: ");
      String input = in.nextLine();
      
      Card card = new Card(input);
      System.out.println(card.getDescription());
   }
}



