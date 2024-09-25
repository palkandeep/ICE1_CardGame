/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int randomValue = random.nextInt(13)+1;
            String randomSuit = Card.SUITS[random.nextInt(Card.SUITS.length)];
            c.setValue(randomValue);//c.setValue(insert call to random number generator here)
            c.setSuit(randomSuit);//c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i] = c;
            
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1 = Diamonds, 2=Clubs, 3=Spades): ");
        String userSuit = scanner.next();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        // and search magicHand here
        boolean cardFound = false;
        for (Card card : magicHand)
            {
                if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit()))
                {
                    cardFound = true;
                    break;
                }
            }
        
        
        //Then report the result here
        if (cardFound)
        {
            System.out.println("Congratulations! Your card is in the magic hand.");
        }
        else
        {
            System.out.println("Sorry! Your card is not in the magic hand.");
        }
        
        // add one luckcard hard code 2,clubs
        scanner.close();
    }
    
}
