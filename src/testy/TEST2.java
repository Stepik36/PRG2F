package testy;

import java.util.Arrays;

public class TEST2 {
    public static void main(String[] args) {
        int[] pole = new int[10];
        int[] cisla = {1,2,4,-6,-8,4,-8,3,-7,-5};
        for (int i = 0; i < cisla.length; i++) {
            if (pole[i] >= -10 && cisla[i] <= 10){
                System.out.println(cisla[i] + " ");
            }



        }

    }
}
