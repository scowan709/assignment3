package project;

import a3.PlayingCard;
import a3.PlayingCardFactory;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;


/**
 * a deck of cards that is dynamic starts with 52 standard playing cars and can be drawn
 * down or reset
 *
 * @author 20119690
 */
public class DeckOfCards {

    //cards stored in a list. top of deck is the first in the list
    private ArrayList<PlayingCard> playingCardArrayList;
    private static final int FULL_DECK_SIZE = 52;

    /**
     * initialize the deck with 52 cards as defind in playing card factory
     */
    public DeckOfCards(){
        this.playingCardArrayList = PlayingCardFactory.generatePlayingCardDeckList();
    }
    public PlayingCard drawCard(){
        if (playingCardArrayList.isEmpty()) {
            this.reset();
        }
        return playingCardArrayList.remove(0);
    }
    private void reset() {
        this.playingCardArrayList = PlayingCardFactory.generatePlayingCardDeckList();
    }

    /**
     * returns true if the deck is a full size.
     * @return true if full.
     */
    public boolean isFull(){
        return this.playingCardArrayList.size() == FULL_DECK_SIZE;
    }

    /**
     * 
     */
    public void printDeck(PrintStream printStream) {
        for (PlayingCard playingCard : this.playingCardArrayList) {

            if((playingCardArrayList.indexOf(playingCard) % 13 == 0) && (playingCardArrayList.indexOf(playingCard) != 0) ){
                printStream.printf("\n");
            }

            printStream.printf("%s ", playingCard.toString(), playingCardArrayList.indexOf(playingCard));
        }
    }
    public void shuffleDeck() {
        if (playingCardArrayList.isEmpty()) {
            this.reset();
        }
        Collections.shuffle(playingCardArrayList);
    }
}
