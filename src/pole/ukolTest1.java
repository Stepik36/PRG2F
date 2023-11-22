package pole;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ukolTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vypis = sc.nextInt();
        int [] n = new int[vypis];
        for (int i = 0; i < n.length; i++) {
            n [i] = (int)(Math.random()*100+1);


        }
        System.out.println(Arrays.toString(n));

    }
}
