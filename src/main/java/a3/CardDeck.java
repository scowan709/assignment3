//package a3;
//
//
//import java.util.ArrayList;
//import java.util.Collections;
//
///**
// * <pre>
// * a class called ‘CardDeck’ that has the following methods:
// * • Has an ArrayList of Playing cards
// * • Starts with a full deck of cards
// * • Can be shuffled
// * • Can draw a card
// * • Create an application with a menu that let’s you a) draw a card b) draw a hand c) print the
// * deck, d) shuffle the deck and e) print out the deck
// * </pre>
// *
// * @author 20119690
// */
//
//public class CardDeck {
//    /**
//     *set "deck" to be a new ArrayList
//     */
//    private ArrayList<PlayingCard> deck = new ArrayList<PlayingCard>();
//
//    /**
//     * for each suit there is a set of face values
//     * add that playing card to the "deck" ArrayList
//     */
////    public CardDeck() {
////        for (PlayingCard.Suit suit : PlayingCard.Suit.values()) {
////            for (PlayingCard.: PlayingCard {
////                PlayingCard playingCard = new PlayingCard(cardFace, suit);
////                deck.add(playingCard);
////            }
////        }
////    }
//
//
//    //method to reset deck
//    private void reset() {
//
//    }
//
//    //method to print deck
//    public void printDeck() {
//        if (deck.isEmpty()) {
//            this.reset();
//        }
//        for (PlayingCard playingCard : deck) {
//            System.out.println(playingCard);
//        }
//    }
//
//
//    /**
//     *method to draw a hand
//     * if hand is not empty: clear hand
//     * if deck is empty: reset()
//     *
//     * initialized ArrayList (hand)
//     * user variable:  number of cards to be added
//     * for i in range(number of cards to be added):
//     *      generate random playing card and add to hand
//     *
//     * @param numberOfCardsToBeAdded
//     * @param hand
//     * @return hand
//     */
//    public ArrayList<PlayingCard> drawHand(int numberOfCardsToBeAdded, ArrayList<PlayingCard> hand) {
//        if (!hand.isEmpty()) {
//            hand.clear();
//        }
//        if (deck.isEmpty()) {
//            this.reset();
//        }
//        ArrayList<PlayingCard> toRemove = new ArrayList<PlayingCard>();
////        for (int i = 0; i < numberOfCardsToBeAdded; i++) {
////            PlayingCard playingCard = PlayingCardFactory.generatePlayingCard(PlayingCard.Suit.DIAMONDS);
////            for (PlayingCard newPlayingCard : deck) {
////                if (newPlayingCard.getSuit() == playingCard.getSuit() &&
////                        newPlayingCard.getFaceValue() == playingCard.getFaceValue()) {
////                    hand.add(playingCard);
////                    toRemove.add(newPlayingCard);
////                }
////            }
////        }
////        deck.removeAll(toRemove);
////        return hand;
////    }
//
//
//    /**
//     * method to shuffle deck
//     * if deck is empty: call reset() method above
//     */
//    public void shuffleDeck() {
//        if (deck.isEmpty()) {
//            this.reset();
//        }
//        Collections.shuffle(deck);
//    }
//
//
//    /**
//     * method to draw a single card
//     * if deck is empty: call reset() method above
//     *new card = generatePlayingCard()
//     * remove card from deck
//     * @return new card
//     */
//    public PlayingCard drawCard() {
//        if (deck.isEmpty()) {
//            this.reset();
//        }
//        PlayingCard playingCard = PlayingCardFactory.generatePlayingCard(PlayingCard.Suit.DIAMONDS);
//        ArrayList<PlayingCard> removeCard = new ArrayList<PlayingCard>();
//        removeCard.add(playingCard);
//        deck.removeAll(removeCard);
//        return playingCard;
//    }
//
//
//
//
//    public int getSize() {
//        return deck.size();
//    }
//}
