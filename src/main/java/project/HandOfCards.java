package project;

import a3.PlayingCard;

import java.io.PrintStream;
import java.util.ArrayList;

public class HandOfCards {


    private ArrayList<PlayingCard> hand;

    /**
     * Create a hand that is initially empty.
     */
    public HandOfCards() {
        hand = new ArrayList<PlayingCard>();
    }
    public void calculateHand(){
        int total = 0;
        for (PlayingCard playingCard : this.hand){
            total += playingCard.getFaceValue();
        }
        int calculateHand;
        System.out.printf(""+ total);
    }

    public void clear() {
        hand.clear();
    }

    public void addCard(PlayingCard playingCard) {
        hand.add(playingCard);
    }

    /**
     * https://math.hws.edu/javanotes/source/chapter5/Hand.java
     * try some of this!
     * @param printStream
     */




    public void printHand(PrintStream printStream) {
        for (PlayingCard playingCard : this.hand) {
            printStream.printf("%s", playingCard.toString(), hand.indexOf(playingCard));
        }
    }

}


