/**
 * project containing files needed to  play black jack
 */
package project;

import a3.PlayingCard;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * hand of cards class
 * allows you to pull cards out of a deck and add them to a new arraylist called hand
 * can also clear hand, add card to hand, check if hand value is over 21, check if theres any aces, calculate hand total, and print hands
 */
public class HandOfCards {

    /**
     * new array list of playing cards called hand
     */
    private ArrayList<PlayingCard> hand;

    /**
     * Create a hand that is initially empty.
     */
    public HandOfCards() {
        hand = new ArrayList<PlayingCard>();
    }


    public void clear() {
        hand.clear();
    }

    public void addCard(PlayingCard playingCard) {
        hand.add(playingCard);
    }

    public void flushHand(){
        this.hand = new ArrayList<>();
    }

    /**
     * check if value of cards is over 21
     * @return true
     */
    public boolean isBust(){
        return calculateHand() > 21;
    }

    /**
     * check if hand contains an ace
     * @return
     */
    public boolean hasAce(){
        for(PlayingCard playingCard : this.hand){
            if (playingCard.getFaceValue() == 14){
                return true;
            }
        }
        return false;
    }

    /**
     * calculate total value of hand, if the hand has an ace while being bust, change ace value to 1
     * @return
     */
    public int calculateHand(){
        int total = 0;
        for (PlayingCard playingCard : this.hand){
            total += playingCard.getBlackjackValue();
        }
        if(total >21 && this.hasAce()){
            int over21 = total - 21;
            for (PlayingCard playingCard : this.hand){
                if(playingCard.getFaceValue() == PlayingCard.ACE && over21 > 0){
                    total += 1;
                    over21 -= 10;
                }else{
                    total += playingCard.getBlackjackValue();
                }
            }
        }
        return total;
    }



    public boolean twentyone(){
        return calculateHand() == 21;
    }
    /**
     * print cards in hand
     * @param printStream
     */
    public void printHand(PrintStream printStream) {
        this.printHand(printStream, false);
    }

    /**
     * also print cards in hand, but blackjack requires hiding the dealers first card
     * @param printStream
     * @param hideFirstCard
     */
    public void printHand(PrintStream printStream, boolean hideFirstCard){

        for(PlayingCard playingCard : hand){
            if(hand.indexOf(playingCard) == 0 && hideFirstCard) {
                printStream.printf("??");
            }else{
            printStream.printf("%s ", playingCard.toString());}

        }
    }

}


