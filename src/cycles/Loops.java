package cycles;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }
//        //while verze
//        int j = 0;
//        while (j < 100){
//            System.out.println(j);
//            j++;
//        }
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        while (input != 42){
//            System.out.println("Incorrect value");
//            input= sc.nextInt();
//        }

        int dimension =  100;
        for (int i = 1; i < dimension*dimension+1; i++) {
            System.out.print("#\t");
            if (i % dimension == 0){
                System.out.println();
            }
        }

    }

    public static class LoopsPractice {
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
}
