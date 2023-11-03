package cvika;

import java.util.Scanner;

public class doma2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cislo = sc.nextInt();
        int faktorial = cislo;
        for (int i = 1; i < cislo; i++) {
            faktorial = faktorial * (cislo - i);
        }
        System.out.println(faktorial);
    }
}
