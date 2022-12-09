package project;

import java.util.Scanner;

/**
 * class that allows tou to run black jack
 * displays both hands or player and dealer, allows you to hit or stay
 * and declares winner
 * also takes bets
 */
public class BlackJackApplication {
    /**
     * control center, player and chose to play or change bet
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c;
        BlackJackGame blackJackGame = new BlackJackGame();

        do{
            printMenu();
            c= Character.toUpperCase(input.next().charAt(0));
            if(c=='A'){
                System.out.printf("playing hand: ");
                playRound(blackJackGame);
            }else if(c == 'B'){
                System.out.println("how much you wanna bet: ");
                int bet = Integer.parseInt(input.next());
                if(bet > blackJackGame.getPlayer().getChips()){
                    System.out.println("you cant bet that much");
                } else if (bet < blackJackGame.getPlayer().getChips() ){}
                        //blackJackGame.getGameStatus()//) {

            }

        }while(c!='Q');
    }

    /**
     * menu for players choices
     */
    public static void printMenu(){
        System.out.println("\nMAKE YOUR CHOICE\n");

        System.out.println("A: PLAY HAND");
        System.out.println("C: CHANGE BET");
        System.out.println("Q: EXIT");
    }

    /**
     *
     * @param blackJackGame
     */
    public static void playRound(BlackJackGame blackJackGame){
        Scanner input = new Scanner(System.in);
        char c;
        blackJackGame.newRound();

        //player
        do{
            blackJackGame.printGameStatus(System.out, true);
            if(blackJackGame.getPlayer().getHandOfCards().isBust()){
                System.out.println("PLAYER BUSTS");
                blackJackGame.setGameStatus(BlackJackGame.GameStatus.ROUND_OVER);
            }else {
                System.out.printf("\nH to hit | S to stay\n");
                c= Character.toUpperCase(input.next().charAt(0));
                if(c=='H'){
                    blackJackGame.hitPlayer();
                }else if(c=='S'){
                    blackJackGame.setGameStatus(BlackJackGame.GameStatus.DEALERS_TURN);
                }
            }
        }while (blackJackGame.getGameStatus() == BlackJackGame.GameStatus.PLAYERS_TURN);

        while(blackJackGame.getGameStatus() == BlackJackGame.GameStatus.DEALERS_TURN){
            blackJackGame.printGameStatus(System.out, false);

            if(blackJackGame.getDealer().getHandOfCards().isBust()){
                System.out.printf("DEALER BUSTS \n PLAYER WINS!");
                blackJackGame.setGameStatus(BlackJackGame.GameStatus.ROUND_OVER);
            }
            if(blackJackGame.getDealer().getHandOfCards().calculateHand() < blackJackGame.getPlayer().getHandOfCards().calculateHand()){
                System.out.printf("DEALER HITS");
                blackJackGame.hitDealer();
            }else{
                blackJackGame.setGameStatus(BlackJackGame.GameStatus.ROUND_OVER);
            }
        }
        blackJackGame.printRoundResult(System.out);
        blackJackGame.printGameStatus(System.out, false);
    }
}
