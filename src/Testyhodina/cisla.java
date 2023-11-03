package Testyhodina;

import java.util.Scanner;

public class cisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("zadej čísla");
        for (int i = 0; i < n; i++) {
            if (i%2==0)
                System.out.println(i + " ");

        }


    }
}
