package string;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String password = "secret";
        if (input.equals(password)){
            System.out.println("Heslo je OK");
        }
        String rc = "0002098/2121";
        if (rc.length() == 11){
            System.out.println("delka je OK");
            if (rc.charAt(6) == '/'){
                System.out.println("Lomitko je OK");
                if (rc.charAt(2) == 5 || rc.charAt(2)==6){
                    System.out.println("jedna se o zenu");
                }else{
                    System.out.println("jedna se o muze");
            }}
        }
    }
}
