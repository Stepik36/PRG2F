package testStringy;

import java.util.Scanner;

public class jedna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] jmena = {"Filip, radek,Josef,ivan"};
//        String name = (int)Math.random();
        String[] příjmeni = {"Nový,Pihera,Pašek,Zadek"};
        String celyjmeno = "";
        int random = (int)Math.random() * jmena.length;
        for (int i = 0; i < jmena.length; i++) {
            if (i == random)
            {
              celyjmeno  += jmena[i] + příjmeni;
              break;
            }


        }
        System.out.println(celyjmeno);

    }
}
