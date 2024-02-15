package cvikaDomaString;

public class ctyri {
    public static void main(String[] args) {
        String words = "Cau ja jsem Venca a chodim na INFIS a mam rad pana Fialu a pana prynycha.";
        int pocetSlov = 0;
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i)==' '||words.charAt(i)=='.'){
                pocetSlov = pocetSlov+1;
            }
        }
        System.out.println(pocetSlov);
    }
}
