package pole;

import java.util.Arrays;
import java.util.Scanner;

public class ukolTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pole = new int[8];
        int vstup = sc.nextInt();
        int pocet = 0;
        int[] index = new int[pole.length];
        for (int i = 0; i < pole.length; i++) {
            pole[i]=(int)(Math.random()*10+1);
            if (vstup == pole[i]){
                pocet = pocet + 1;
                index[i] = i;
            }


        }
        System.out.println(Arrays.toString(pole));
        System.out.println(pocet);
        System.out.println(Arrays.toString(index));
    }

}
