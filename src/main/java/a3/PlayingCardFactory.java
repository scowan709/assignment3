package a3;


import java.util.Random;

/**
 * <pre>
 *   a class called “PlayingCardFactory” that has the following methods:
 * • Generate Random Card (static)
 * • Generate Random Card from a suit (static)
 * </pre>
 *
 * @author 20119690
 */
public class PlayingCardFactory {

    private static final int facesLength = PlayingCard.CardFace.values().length;
    private static final int suitsLength = PlayingCard.Suit.values().length;

    /**
     * generate a random playing card.
     * @return Playing Card
     */
    public static PlayingCard generatePlayingCard() {
        Random random = new Random();
        return new PlayingCard(PlayingCard.CardFace.values()[random.nextInt(facesLength)],
                PlayingCard.Suit.values()[random.nextInt(suitsLength)]);
    }

    /**
     * generate random playing card based on suit
     * @param suit
     * @return random card of a selected suit.
     */
    public static PlayingCard generatePlayingCardFromSuit(PlayingCard.Suit suit) {
        Random random = new Random();
        return new PlayingCard(PlayingCard.CardFace.values()[random.nextInt(facesLength)],
                suit);
    }

}
