package pole;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] pole = {5 , 32 ,21 ,15};
        int[] pole2 = new int[10];
//        System.out.println(pole[2]);
        for (int i = 0; i < pole.length; i++) {
            System.out.println(pole[i]);
        }
        System.out.println("1: " + pole[1] + "2: " + pole[2]);
        pole[2] = 10;
        for (int i = 0; i < pole2.length; i++) {
            pole2[i] = (int)(Math.random()*101);
        }

        System.out.println("---");
        for (int i = 0 ;i < pole2.length; i++){
            System.out.println(pole2[i]);
        }
        int[] numArray = new int [15];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (i+1)*5;}
            System.out.println(Arrays.toString(numArray));


    }
}
