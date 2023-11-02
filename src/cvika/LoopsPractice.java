package cvika;

import java.util.Scanner;

public class LoopsPractice {
    public static void main(String[] args) {
        System.out.println("zadej cisla, zadavani ukoncis zadanim -1");
        Scanner sc = new Scanner(System.in);
        int input;
        int i = sc.nextInt();
        while (i != -1) {
            input = sc.nextInt();
            if (input % 2 == 0) {
                System.err.println(input);
            }
            input = sc.nextInt();
        }

        System.out.println("zadej maximum");
        for (int i = 0; i < i; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
//       System.out.println("zadej cislo");
//        input = sc.nextInt();
//        for (int i = 2; i < input; i++) {
//            if (input % i == 0) {

//            }
//        }
//    }
//}