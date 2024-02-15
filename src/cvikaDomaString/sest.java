package cvikaDomaString;

import java.util.Scanner;

public class sest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine(); //pihy nema rand - leko
        for (int i = 0; i < text.length()-1; i++) {
            if (text.charAt(i)==text.charAt(i+1)){
                System.out.println("Ano");
            }
        }
    }
}
