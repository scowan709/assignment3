package project;


import a3.PlayingCard;

import java.util.Scanner;

import static project.HandOfCards.hand;


public class HandOfCardsTester {
    public static void main(String[] args) {
        System.out.println("FUN WITH A HAND OF CARDS!");
        DeckOfCards DECK = new DeckOfCards();

        Scanner input = new Scanner(System.in);
        char c; // char for menu choices

        do{
            printMenu();
            //grab user input
            c= Character.toUpperCase(input.next().charAt(0));

            System.out.printf("\n echo: %c\n", c);

            if(c=='A'){
                System.out.printf("add a card: ");
                HandOfCards hand = new HandOfCards();
                DeckOfCards deckOfCards = new DeckOfCards();
                hand.addCard(0, deckOfCards);
            } else if (c=='B') {
                System.out.println("Print hand \n");
                HandOfCards.printHand(System.out);
            } else if (c=='C') {
                System.out.printf("shuffle cards");
            }
        }while(c!='Q');

    }
    public static void printMenu(){
        System.out.println("\n==============================\n");
        System.out.println("==========   MENU   ==========");
        System.out.println("\nQ  - To exit");
        System.out.println("A  - add card to hand.");
        System.out.println("B  - Print the hand.");
        System.out.println("");
        System.out.println("\n==============================\n");
    }


}
