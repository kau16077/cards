/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
      public static void main(String[] args) {
        Card[] hand = new Card[7];
        Random rand = new Random();

        // Fill the array with random cards
        for (int i = 0; i < hand.length; i++) {
            int value = rand.nextInt(13) + 1; // Card values 1 to 13
            String suit = Card.SUITS[rand.nextInt(4)]; // Random suit
            hand[i] = new Card(value, suit);
        }

        // Display the hand
        System.out.println("The magic hand contains:");
        for (Card card : hand) {
            System.out.println(card);
        }

        // Hard-coded lucky card
        Card luckyCard = new Card(7, "Hearts");
        System.out.println("The lucky card is: " + luckyCard);

        // Check if the lucky card is in the hand
        boolean found = false;
        for (Card card : hand) {
            if (card.equals(luckyCard)) {
                found = true;
                break;
            }
        }

        // Print result
        if (found) {
            System.out.println("Congratulations! The lucky card is in the magic hand.");
        } else {
            System.out.println("Sorry, the lucky card is not in the magic hand.");
        }
    }
}

