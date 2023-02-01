package exercise1;
import java.util.Scanner; 
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Chelsi
 * @author Chelsi Patel 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
             //card.setValue(insert call to random number generator here)
            // 
            card.setValue((int) (1 + Math.random() * 13));
             //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(Card.SUITS[(int)(0+Math.random()*3)]);
            hand[i]=card;
            System.out.println("Card" + (i)+""+hand[i].getSuit() + ""+ hand[i].getValue());
          // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter the suit:");
            String input= scanner.nextLine();
            System.out.println("Enter the number:");
            int num1 = scanner.nextInt();
            
        for (int i =0; i <hand.length;i++) {
            if (num1 == hand[i].getValue() && input.equalsIgnoreCase(hand[i].getSuit())); 
                
            
            {
                printInfo();
            }
        }
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Chelsi Patel Jan 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Chelsi, but you can call me prof, Chelsi");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
