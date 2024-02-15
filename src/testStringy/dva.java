package testStringy;

import java.util.Scanner;

public class dva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vec = "Jmenuju se bourák borec a mam velky a masivní propisky, penal a tužky! Máš taky tužku? Jsem prostě hovado.-";
        int pocetZnaku = 0;
        for (int i = 0; i <  vec.length(); i++) {
            if (vec.charAt(i)=='!' || vec.charAt(i)=='?' || vec.charAt(i)=='.')
            {
                pocetZnaku = pocetZnaku+1;
            }

        }
        System.out.println(pocetZnaku);
    }
}
