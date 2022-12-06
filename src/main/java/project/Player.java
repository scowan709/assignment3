//package project;
//
//public class Player {
//    private int bank;
//    private int bet;
//
//    public Player(){
//        bank = 100;
//        HandOfCards hand = new HandOfCards();
//    }
//    public int getBank(){
//        return bank;
//    }
//
//    public void bust(){
//        bank -= bet;
//        bet = 0;
//    }
//    public void win(){
//        bank += bet;
//        bet = 0;
//    }
//    public void loss() {
//        bank -= bet;
//        bet = 0;
//    }
//    public void blackjack() {
//        bank += bet * 1.5;
//        bet = 0;
//    }
//    public void setBet(int newBet) {
//        bet = newBet;
//    }
//    public int getTotal() {
//        return HandOfCards.calculateTotal();
//    }
//    public int getBet(){
//        return this.bet;
//    }
////    public void clearHand() {
////        HandOfCards.clearHand();
//    }
//
//}
