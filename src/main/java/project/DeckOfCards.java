package project;

import a3.PlayingCard;
import a3.PlayingCardFactory;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 * a deck of acards that is dynamic starts with 52 standard playing cars and can be drawn
 * down or resset
 *
 * @author 20119690
 */
public class DeckOfCards {

    //cards stored in a list. top of deck is the first in the list
    private ArrayList<PlayingCard> playingCardArrayList;

    /**
     * initialize the deck with 52 cards as defind in playing card factory
     */
    public DeckOfCards(){
        playingCardArrayList = new ArrayList<>();
        for (int i = 2; i <= 14; i++) {
            playingCardArrayList.add(new PlayingCard(i, PlayingCard.Suit.DIAMONDS));
        }
        for (int i = 2; i < 14; i++) {
            playingCardArrayList.add(new PlayingCard(i, PlayingCard.Suit.HEARTS));
        }
        for (int i = 2; i < 14; i++) {
            playingCardArrayList.add(new PlayingCard(i, PlayingCard.Suit.CLUBS));
        }
        for (int i = 2; i < 14; i++) {
            playingCardArrayList.add(new PlayingCard(i, PlayingCard.Suit.SPADES));
        }
    }
}
