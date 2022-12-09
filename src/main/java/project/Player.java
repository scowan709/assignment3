package project;

/**
 * player class used for both dealer and user
 *
 */
public class Player {
    private int chips;
    private HandOfCards handOfCards;

    /**
     * players have a bank of chips and a hand of cards
     * @param chips
     */
    public Player(int chips) {
        this.chips = chips;
        this.handOfCards = new HandOfCards();
    }

    public int getChips() {
        return chips;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }

    public HandOfCards getHandOfCards() {
        return handOfCards;
    }
}
