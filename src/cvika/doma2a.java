package cvika;

import java.util.Scanner;

public class doma2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cislo = sc.nextInt();
        int mocnina = 1;
        for (int i = 0; i < cislo; i++) {
            mocnina = cislo * mocnina;

        }
        System.out.println(mocnina);
    }
}
