package pole;

import java.util.Scanner;

public class ukolTest2 {
    public static void main(String[] args) {
        int lichy = 0;
        int sudy = 0;
        int[] soucet = new int[7];
        for (int i = 0; i < soucet.length; i++) {
            soucet [i] = (int)(Math.random()*100+1);
            if (soucet [i] % 2 == 0){
                sudy = soucet[i] + sudy;



            }

            else {
                lichy = soucet[i] + lichy;


            }

        }
        System.out.println("sudy cisla " + sudy);
        System.out.println("lichý čísla: " + lichy );

    }
}
