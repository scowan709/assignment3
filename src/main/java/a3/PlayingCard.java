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
    public enum Suit {DIAMONDS, SPADES, CLUBS, HEARTS}

    ;

    public enum CardFace {
        Ace("A"),
        Two("2"),
        Three("3"),
        Four("4"),
        Five("5"),
        Six("6"),
        Seven("7"),
        Eight("8"),
        Nine("9"),
        Ten("10"),
        Jack("J"),
        Queen("Q"),
        King("K");
        String value;

        CardFace(String value) {
            this.value = value;
        }
    }

    ;

    private CardFace faceValue;
    private Suit suit;


    /**
     * constructor that  creates cards.
     * for testing purposes.
     * to build a playing card, use a factory.
     * @param faceValue
     * @param suit
     */
    public PlayingCard(CardFace faceValue, Suit suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    /**
     * getter for value
     * @return faceValue
     */
    public CardFace getFaceValue() {
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
        return this.faceValue.value + getSuitStringValue(this.getSuit());
    }
}




