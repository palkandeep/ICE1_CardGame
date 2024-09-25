package card;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then checks for a hard-coded lucky card in the array of cards.
 * To be used as starting code in ICE 1.
 * 
 * @author Palkandeep Kaur
 * @studentID 991718139
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            int randomValue = random.nextInt(13) + 1; 
            String randomSuit = Card.SUITS[random.nextInt(Card.SUITS.length)]; 
            c.setValue(randomValue);
            c.setSuit(randomSuit);
            magicHand[i] = c;
        }

        
        Card luckyCard = new Card();
        luckyCard.setValue(2); 
        luckyCard.setSuit(Card.SUITS[2]);

        
        boolean luckyCardFound = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                luckyCardFound = true;
                break;
            }
        }

        // Report the result for the lucky card
        if (luckyCardFound) {
            System.out.println("Congratulations! The lucky card is in the magic hand.");
        } else {
            System.out.println("Sorry! The lucky card is not in the magic hand.");
        }
    }
}
