package pole;

import java.util.Arrays;
import java.util.Scanner;

public class ukolTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] prazdny = new int[10];
        for (int i = 0; i < prazdny.length; i++) {
            prazdny[i] = sc.nextInt();


        }
        System.out.println(Arrays.toString(prazdny));
    }
}
