package cvika;

import java.util.Scanner;

public class LoopsPractice {
    public static void main(String[] args) {
        System.out.println("zadej cisla, zadavani ukoncis zadanim -1");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (input != -1){
            input = sc.nextInt();
            if (input % 2 == 0){
                System.err.println(input);
            }
            input = sc.nextInt();
        }
    }
}
