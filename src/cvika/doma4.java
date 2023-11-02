package cvika;

public class doma4 {
    public static void main(String[] args) {
        int pocet42 = 0;
        for (int i = 0; i < 100000; i++) {
            int random = (int)(Math.random() * 100 + 1);
            System.out.println(random);
            if (random == 42){
                pocet42 = pocet42 + 1;
            }
        }
        System.out.println("pocet cisla 42 je " + pocet42);

    }
}
