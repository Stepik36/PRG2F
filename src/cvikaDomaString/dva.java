package cvikaDomaString;

public class dva {
    public static void main(String[] args) {
            String number = "987654321";
            String opacne = "";
            for (int i = 0; i < number.length(); i++) {
                opacne = number.charAt(i)+opacne;
            }
            System.out.println(opacne);
    }
}
