package project;

public class BlackJackTester {
    public static void main(String[] args) {
        System.out.println("FUN WITH BLACKJACK");
        BlackJackGame blackJackGame = new BlackJackGame();
        blackJackGame.newRound();
        blackJackGame.printGameStatus(System.out, false);
    }
}
