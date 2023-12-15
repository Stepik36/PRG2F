package cvikaDomaString;

import java.util.Scanner;

public class pet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oppositeCase = "stepan";
        String znaky = "";
        for (int i = 0; i < oppositeCase.length(); i++) {
            if ((i+1) % 2 == 0){
                char znak2 = oppositeCase.charAt(i);
                String znak3 = String.valueOf(znak2);
                znak3 = znak3.toLowerCase();
                znaky = znaky+znak3;
            } else {
                char znak2 = oppositeCase.charAt(i);
                String znak3 = String.valueOf(znak2);
                znak3 = znak3.toUpperCase();
                znaky = znaky+znak3;
            }
        }
        System.out.println(znaky);
    }
}
