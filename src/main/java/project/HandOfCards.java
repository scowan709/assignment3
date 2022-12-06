package project;

import a3.PlayingCard;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

public class HandOfCards {



    private static ArrayList<PlayingCard> hand;
    private int  calculateTotal;

    //Collections.shuffle(hand);
    public HandOfCards(ArrayList<PlayingCard> hand, int calculateTotal) {
        this.hand = hand;
        this.calculateTotal = calculateTotal;
    }

    public ArrayList<PlayingCard> getHand() {
        return hand;
    }

    public void setHand(ArrayList<PlayingCard> hand) {
        this.hand = hand;
    }

    public int getCalculateTotal() {
        return calculateTotal;
    }

    public void setCalculateTotal(int calculateTotal) {
        this.calculateTotal = calculateTotal;
    }

    public static int calculateTotal(){
        int total = 0;
        int value = 0;
//        for(PlayingCard in hand){
//            value += PlayingCard.getFaceValue();}
        return total;
    }



    public void addCard() {

    }

    public void flushHand(){

    };
    public int numberOfCards(){

        return 0;
    };
    public boolean hasAce(){

        return false;
    };
    public boolean isBust(){

        return false;
    };
    public void printHand(PrintStream printStream){

    };
    public void PrintHand(PrintStream printStream, boolean hideFirstCard){

    }
}
