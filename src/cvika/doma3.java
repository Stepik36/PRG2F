package cvika;

import java.util.Scanner;

public class doma3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int) (Math.random() * 100 + 1);
        System.out.println("Napiš tip ");
        int tip = sc.nextInt();
        while (tip != random) {
            if (tip < random) {
                System.out.println("Musíš napsat větší číslo");
                tip = sc.nextInt();
            } else {
                System.out.println("Musiš napsat menší číslo");
                tip = sc.nextInt();

            }

        }
        System.out.println("Uhodl jsi!");
    }
}
