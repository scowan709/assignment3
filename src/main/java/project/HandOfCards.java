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
    public int calculateHand(){
        int total = 0;
        for (PlayingCard playingCard : this.hand){
            total += playingCard.getFaceValue();
        }
        if(isBust() && hasAce()){
            total -=10;
        }
        return total;
    }

    public void clear() {
        hand.clear();
    }

    public void addCard(PlayingCard playingCard) {
        hand.add(playingCard);
    }

    /**
     * https://math.hws.edu/javanotes/source/chapter5/Hand.java
     */

    public boolean isBust(){
        return calculateHand() > 21;
    }

    public boolean hasAce(){
        for(PlayingCard playingCard : this.hand){
            if (playingCard.getFaceValue() == 14){
                return true;
            }
        }
        return false;
    }



    public void printHand(PrintStream printStream) {
        for (PlayingCard playingCard : this.hand) {
            printStream.printf("%s", playingCard.toString(), hand.indexOf(playingCard));
        }
    }

//    public void printHand(PrintStream, boolean hideFirstCard){
//        for (PlayingCard playingCard : this.hand) {
//            if(hand.indexOf(playingCard) == 0){
//            }
//        }
//    }

}


