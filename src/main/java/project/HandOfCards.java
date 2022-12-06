package project;

import a3.PlayingCard;

import java.io.PrintStream;
import java.util.ArrayList;

public class HandOfCards {


    DeckOfCards deckOfCards = new DeckOfCards();
    private static ArrayList<PlayingCard> hand;
    /**
     * Create a hand that is initially empty.
     */
    public HandOfCards() {
        hand = new ArrayList<PlayingCard>();
    }

    public void clear() {
        hand.clear();
    }

    public static void addCard(PlayingCard playingCard) {
        hand.add(playingCard);
    }

    /**
     * https://math.hws.edu/javanotes/source/chapter5/Hand.java
     * try some of this!
     * @param printStream
     */




    public static void printHand(PrintStream printStream) {
        for (Object playingCard : hand) {
            printStream.printf("%s ", playingCard.toString(), hand.indexOf(playingCard));
        }
    }

}


