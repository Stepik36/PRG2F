package cvikaDomaString;

import java.util.Scanner;

public class sedm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        String[] users = {"Matous Venousek", "Piher Vojteris", "Klim Amada"};
        for (int i = 0; i < users.length; i++) {
            if (userName.equals(users[i])){
                System.out.println("Je to tam!!!");
                break;
            } else {
                System.out.println("Neni to tak ://");
                break;
            }
        }
    }
}
