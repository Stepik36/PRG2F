package pole;

import java.util.Arrays;
import java.util.Scanner;

public class GuessArray {
    public static void main(String[] args) {
//        vytvořit pole velikosti 6
//        naplnit nahodnymi cisly 1 - 15
//        uzivatele se 7x zeptate aby uhodl cislo v poli
//        u uzivatele se sleduje skore
//        pri spravnem tip skore + 100
        int[] quessArray = new int[6];
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int quess;
        for (int i = 0; i < quessArray.length; i++) {
            quessArray [i] = (int)(Math.random()*15+1);


        }
        System.out.println(Arrays.toString(quessArray));

        for (int i = 0; i < 7; i++) {
            System.out.println("tipni číslo");
            quess = sc.nextInt();

            if (quess < 0 || quess > 15){
                continue;
            }


            for (int j = 0; j < quessArray.length; j++) {
                if (quess == quessArray[j]){
                    score += 100;
                    System.out.println("Uhodl jsi");
                    quessArray[j] = -1;
                    System.out.println(Arrays.toString(quessArray));
                }
            }
//            uz uhodl vse
            if (score >= quessArray.length * 100){
                break;

            }
        }
        System.out.println("Game over, score : " + score);
    }
}
