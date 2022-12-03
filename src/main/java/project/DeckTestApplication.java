package project;

import java.io.PrintStream;
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

            System.out.printf("\n echo: %c\n", c);

            if(c=='A'){
                System.out.printf("Draw a card: %s", deckOfCards.drawCard().toString());
            } else if (c=='B') {
                System.out.println("Print deck (remaining)\n");
                deckOfCards.printDeck(System.out);
            } else if (c=='C') {
                System.out.printf("shuffle cards");
                deckOfCards.shuffleDeck();
            }
        }while(c!='Q');

        }
    public static void printMenu(){
        System.out.println("\n==============================\n");
        System.out.println("==========   MENU   ==========");
        System.out.println("\nQ  - To exit");
        System.out.println("A  - Draw a card.");
        System.out.println("B  - Print the deck.");
        System.out.println("C  - Shuffle the deck.");
        System.out.println("\n==============================\n");
    }
}
