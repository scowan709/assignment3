package project;


import a3.PlayingCard;

import java.util.Scanner;




public class HandOfCardsTester {
    public static void main(String[] args) {
        System.out.println("FUN WITH A HAND OF CARDS!");
        DeckOfCards deck = new DeckOfCards();
        deck.shuffleDeck();
        HandOfCards hand = new HandOfCards();

        Scanner input = new Scanner(System.in);
        char c; // char for menu choices

        do{
            printMenu();
            //grab user input
            c= Character.toUpperCase(input.next().charAt(0));

            System.out.printf("\n echo: %c\n", c);

            if(c=='A'){
                System.out.println("add a card: ");
                hand.addCard(deck.drawCard());
                hand.printHand(System.out);
                System.out.printf("\n total:%s ", hand.calculateHand());

                if (hand.hasAce()){
                    System.out.println("\nhand has an ace");
                }

            } else if (c=='B') {
                System.out.println("Clear hand \n");
                hand.clear();

            }
        }while(c!='Q');



    }
    public static void printMenu(){
        System.out.println("\n==============================\n");
        System.out.println("==========   MENU   ==========");
        System.out.println("\nQ  - To exit");
        System.out.println("A  - add card to hand.");
        System.out.println("B  - clear hand.");
        System.out.println();
        System.out.println("\n==============================\n");
    }


}
