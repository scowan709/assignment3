package project;

import java.io.PrintStream;

/**
 * blackjack game class contains all the rules for operating a game of blackjack
 * @author 20119690
 */
public class BlackJackGame {
    /**
     * status changes what happening next based on moves
     */
    public enum GameStatus{
        PLAYERS_TURN, DEALERS_TURN, ROUND_OVER
    }

    private Player player;
    private Player dealer;
    private DeckOfCards deckOfCards;
    private GameStatus gameStatus;

    /**
     * initialize player and dealer banks
     * make a new deck and shuffle it
     */
    public BlackJackGame() {
        this.player = new Player(100);
        this.dealer = new Player(0);
        this.deckOfCards = new DeckOfCards();
        this.deckOfCards.shuffleDeck();
    }

    /**
     * with every new round player and dealer get 2 cards
     * rounds start with players turn
     */
    public void newRound(){
        this.player.getHandOfCards().flushHand();
        this.dealer.getHandOfCards().flushHand();

        this.player.getHandOfCards().addCard(deckOfCards.drawCard());
        this.player.getHandOfCards().addCard(deckOfCards.drawCard());

        this.dealer.getHandOfCards().addCard(deckOfCards.drawCard());
        this.dealer.getHandOfCards().addCard(deckOfCards.drawCard());

        this.setGameStatus(GameStatus.PLAYERS_TURN);
    }

    /**
     * getter for game status
     * @return gamestatus form the enums above
     */
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    /**
     * set game status
     * @param gameStatus
     */
    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }
    //player getter
    public Player getPlayer() {
        return player;
    }
    //dealer getter
    public Player getDealer() {
        return dealer;
    }

    /**
     * add card to players hand
     */
    public  void hitPlayer(){
        this.player.getHandOfCards().addCard(deckOfCards.drawCard());
    }

    /**
     * add card to dealers hand
     */
    public  void hitDealer(){
        this.dealer.getHandOfCards().addCard(deckOfCards.drawCard());

    }

    public void printGameStatus(PrintStream printStream){
        printGameStatus(printStream, false);
    }
    public void printGameStatus(PrintStream printStream, boolean hideDealer){
        printStream.print("\nDEALER: \t");
        dealer.getHandOfCards().printHand(printStream, false);
        printStream.print("\nPLAYER: \t");
        player.getHandOfCards().printHand(printStream);
    }

    /**
     * print result based on whom wins
     * @param printStream
     */
    public void printRoundResult(PrintStream printStream){
        printStream.println("\n ROUND OVER: \t");
        if(!this.player.getHandOfCards().isBust() ||
                this.dealer.getHandOfCards().isBust() && (this.player.getHandOfCards().calculateHand() >= this.dealer.getHandOfCards().calculateHand())
        ){printStream.println("\nPLAYER WINS !1");
        }else if(this.player.getHandOfCards().isBust()){
            printStream.println("\nplayer busts\ndealer wins1");
        }
        else if (this.player.getHandOfCards().twentyone()){
            printStream.println("\nPLAYER WINS! BLACKJACK1");
        }else if (this.player.getHandOfCards().calculateHand() == this.dealer.getHandOfCards().calculateHand()){
            printStream.println("\nDEALER WINS!1");
        }else {
            printStream.println("\n dealer wins");
        }
    }
}
