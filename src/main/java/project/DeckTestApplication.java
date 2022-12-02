package project;

import java.util.Scanner;

public class DeckTestApplication {
    public static void main(String[] args) {
        System.out.println("FUN WITH A DECK OF CARDS!");
        DeckOfCards deckOfCards = new DeckOfCards();

        Scanner input = new Scanner(System.in);
        char c; // char for menu choices

        do{
            printMenu();
            //grab user input
            c= Character.toUpperCase(input.next().charAt(0));

            System.out.printf("\n echo: %c", c);

            if(c=='A'){
                System.out.printf("Draw a card: %s", deckOfCards.drawCard().toString());
            } else if (c=='B') {
                System.out.printf("Print deck (remaining)\n");
                deckOfCards.printDeck
            }
        }while(c!=0);
    }
}
