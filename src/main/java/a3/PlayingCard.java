/**
 * package containing all files for assignment 3
 */
package a3;


/**
 * <pre>
 * Create a class called ‘PlayingCard’ that does the following:
 *  Has a constructor which creates the card - it should have a valid suit and a value.
 *  You should have getters only for these values.
 *  Note: use constants for suits and think of how you can constrain the value. Hint: You can
 * use constants or enums.
 *  Override the toString method to print the playing card like “8 ♣” or “K ♦” (static). (Hint:
 * google ‘unicode character for diamond’)
 *  Bonus: Print an ASCII Art version of the Card to the a print screen like the following:
 * printAsciiCard(PlayingCard playingCard, PrintStream printStream
 *</pre>
 *
 * playing card for a standard american style card game. cards have a face value and a suit.
 * face value can be between 2 and 10 or can be a special card with face value of A("Ace"), K("king"), Q("queen"), J("Jack").
 * Note: no jokers included.
 *
 * @author: 20119690
 */
public class PlayingCard {


    /**
     * Enums representing suits and values.
     */

    public enum Suit {HEARTS, DIAMONDS, SPADES, CLUBS};

    /**
     * don't use enum for this
     */
    public static final int ACE = 1;
    public static final int KING = 13;
    public static final int QUEEN = 12;
    public static final int JACK = 11;


    private final int faceValue;
    private final Suit suit;


    /**
     * constructor that  creates cards.
     * for testing purposes.
     * to build a playing card, use a factory.
     * @param faceValue
     * @param suit
     */
    public PlayingCard(int faceValue, Suit suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    /**
     * getter for value
     * @return faceValue
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * getter for suit
     * @return suit
     */
    public Suit getSuit() {
        return suit;
    }


    /**
     * method that uses if else statements to return ASCII characters based on card suits.
     * @param suit
     * @return ASCII char
     */
    public static String getSuitStringValue(Suit suit) {
        StringBuilder suits = new StringBuilder();
        suits.append(" ");
        if (suit == Suit.SPADES) {
            suits.append((char) '\u2660');
        } else if (suit == Suit.DIAMONDS) {
            suits.append((char) '\u2666');
        } else if (suit == Suit.HEARTS) {
            suits.append((char) '\u2764');
        } else {
            suits.append((char) '\u2663');
        }
        return suits.toString();
    }

    /**
     * method to display cards
     * @return Value + suit(as ASCII char)
     */
    @Override
    public String toString() {
        if(this.faceValue == ACE){
            return "A" + getSuitStringValue(this.getSuit());
        } else if(this.faceValue == KING){
            return "K" + getSuitStringValue(this.getSuit());
        }else if(this.faceValue == QUEEN){
            return "Q" + getSuitStringValue(this.getSuit());
        }else if(this.faceValue == JACK){
            return "J" + getSuitStringValue(this.getSuit());
        }else return this.faceValue + getSuitStringValue(this.getSuit());
    }

}




