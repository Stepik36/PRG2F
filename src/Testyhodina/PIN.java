package Testyhodina;

import java.util.Scanner;

public class PIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int) (Math.random() * 9999 + 1);
        for (int i = 0; i < 9999; i++) {

        }
        for (int i = 0; i > 1000 && i < 9999; i++) {

        }
        System.out.println("Napiš pin ");
        int tip = sc.nextInt();
        while (tip < 1000 && tip > 9999) {
//            if (tip < 1000 && tip > 9999) {
                System.out.println("zkus znova");
                tip = sc.nextInt();
            }
//        if (tip > 1000 && tip < 9999) {
        }
//        else {
//            System.out.println("zkus to znovu");
//            tip = sc.nextInt();
        }


//            System.out.println("Uhodl jsi!");





