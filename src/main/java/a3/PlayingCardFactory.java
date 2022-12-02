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



    /**
     * generate a random playing card.
     * @return Playing Card
     */
    public static PlayingCard generatePlayingCard() {
        Random random = new Random();
        int r = random.nextInt(3);
        if (r == 0){
            return generatePlayingCard(PlayingCard.Suit.DIAMONDS);
        } else if (r == 1){
            return generatePlayingCard(PlayingCard.Suit.HEARTS);
        } else if (r == 2){
            return generatePlayingCard(PlayingCard.Suit.SPADES);
        } else {
            return generatePlayingCard(PlayingCard.Suit.CLUBS);
        }
    }

    private static PlayingCard generatePlayingCard(PlayingCard.Suit suit) {
        Random random = new Random();
        int r = random.nextInt(13) + 2;
        return new PlayingCard(r, suit);
    }

//    /**
//     * generate random playing card based on suit
//     * @param suit
//     * @return random card of a selected suit.
//     */
//    public static PlayingCard generatePlayingCardFromSuit(PlayingCard.Suit suit) {
//        Random random = new Random();
//        return new PlayingCard(PlayingCard..values()[random.nextInt(facesLength)],
//                suit);
//    }

}
