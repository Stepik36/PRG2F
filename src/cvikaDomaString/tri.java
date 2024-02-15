package cvikaDomaString;

public class tri {
    public static void main(String[] args) {
            String[] jmena = {"Jan", "Karel", "FranƟšek Dlouhojmenný", "Pablo Diego José Francisco de Paula Juan Nepomuceno María de los Remedios Cipriano de la Sanơsima Trinidad Ruiz y Picasso", "Eva"};
            int pocetPismen = 0;
            for (int i = 1; i < jmena.length; i++) {
                if (jmena[i].length() > jmena[pocetPismen].length()){
                    pocetPismen = i;
                }
            }
            System.out.println(jmena[pocetPismen]);
    }
}
