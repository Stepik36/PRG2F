package cvika;

import java.util.Scanner;

public class doma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vstup = sc.nextInt();
        int soucet = 0;
        while (vstup !=-1){
            soucet = soucet + vstup;
            vstup = sc.nextInt();
        }
        System.out.println(soucet);

    }
}
