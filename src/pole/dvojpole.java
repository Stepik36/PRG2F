package pole;

import java.util.Scanner;

public class dvojpole {
    public static void main(String[] args) {
        int[][] numbers = {
                {3,5,6,1,2},
                {3,5,4,5,7},
                {4,4,5,8,5},
                {7,5,1,2,2},
                {5,1,4,1,2}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo sloupce");
        int input = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i][input]);
            sum += numbers[i][input];

        }
        System.out.println("Soucet sloupce " + input + ": " + sum);

    }
}
