package objekty;

public class VINO {
    public static void main(String[] args) {
        objektdnes shop = new objektdnes(10,50000);
        shop.printInfo();
        shop.sell(10);

        shop.buy(20);
    }
}
