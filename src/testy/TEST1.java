package testy;

import java.util.Arrays;

public class TEST1 {
    public static void main(String[] args) {

        int[] pole = new int[20];
        int cisla = 0;
        for (int i = 0; i < pole.length; i++) {
            pole[i] = (int) (Math.random() * 201 - 100);
            cisla += pole[i];

        }


        if (cisla > 0) {
            System.err.println(cisla);
        } else {
            System.out.println(cisla);
        }
    }}
