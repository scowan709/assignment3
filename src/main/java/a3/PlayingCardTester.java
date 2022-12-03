//package a3;
//
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class PlayingCardTester {
//
//    private static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        driverFunction();
//    }
//
//
//    public static void driverFunction() {
//        System.out.println("Welcome To Playing Cards");
//        CardDeck cardDeck = new CardDeck();
//        Scanner input = new Scanner(System.in);
//        ArrayList<PlayingCard> hand = new ArrayList<PlayingCard>();
//        char selection; //to drive the menu selection
//        do {
//            printInstructions();
//            selection = Character.toUpperCase(input.next().charAt(0));
//            if (selection == '0') {
//                // kills menu
//                System.out.println("Thanks For Playing");
//                System.exit(0);
//            }
//
//            if (selection == 'A') {
//                PlayingCard playingCard = cardDeck.drawCard();
//                System.out.println(playingCard);
//            }
//            if (selection == 'B') {
//            System.out.println(" Enter the numbers of cards for the hand: ");
//            int numberOfCards = scanner.nextInt();
//                if (numberOfCards > 52 || numberOfCards > cardDeck.getSize()) {
//                    System.out.println("Invalid number");
//                    scanner.nextLine();
//
//                }
//                else {
//                hand = cardDeck.drawHand(numberOfCards, hand);
//                scanner.nextLine();
//                    for (PlayingCard playingCard : hand) {
//                        System.out.println(playingCard);
//                    }
//                }
//            }
//
//            if (selection == 'C') {
//                cardDeck.printDeck();
//            }
//            if (selection == 'D') {
//                cardDeck.shuffleDeck();
//            }
//        } while (selection != '0');
//    }
//
//    public static void printInstructions() {
//        System.out.println("=======================================================");
//        System.out.println("============    MENU    ============");
//        System.out.println("\n0  - To exit");
//        System.out.println("A  - Draw a card.");
//        System.out.println("B  - Draw a Hand.");
//        System.out.println("C  - Print the deck.");
//        System.out.println("D  - Shuffle the deck.");
//        System.out.println("=++++++++++++++++++++++++++++++++++++++++++++++++++++=");
//        System.out.println("enter selection below ");
//
//    }
//}
