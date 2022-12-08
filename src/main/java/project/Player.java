package project;

public class Player {
    private int bank;

    public void setBank(int bank) {
        this.bank = 100;
    }

    public int getBank() {
        return bank;
    }

    public Player(int bank){

    }
    public HandOfCards getHandOfCards(){

        return new HandOfCards();
    }

}
