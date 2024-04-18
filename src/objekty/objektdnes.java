package objekty;

public class objektdnes {
    int bottles;
    int balance;
    final int PRICE_PER_SELL = 500;
    final int PRICE_PER_BUY = 250;
    public objektdnes(int bottles, int balance) {
        this.bottles = bottles;
        this.balance = balance;
    }

    void sell(int bottles){
        this.bottles -= bottles;
        balance += PRICE_PER_SELL * bottles;
        if (this.bottles < bottles){
            System.out.println("nepodarilo se ti to");
        }
        else {
            this.bottles -= bottles;
            balance += PRICE_PER_SELL * bottles;
        }
    }
    void buy(int bottles){
        if (balance > PRICE_PER_BUY * bottles){
            balance -= PRICE_PER_BUY * bottles;
            this.bottles += bottles;
        }else {
            System.out.println("nepodarilo se nakoupit");
        }



    }
    void printInfo(){}
}