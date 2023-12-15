package testStringy;

import java.util.Scanner;

public class tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Napiš telefoní číslo i s předvolbou");
        String cislo = sc.nextLine();

        if (cislo.length() == 13)
            System.out.println("delka je v pohode");
        if (cislo.startsWith("+420")){
            System.out.println("předvolba je dobře kámo!!!!!!!!");

        }

        }



        }










