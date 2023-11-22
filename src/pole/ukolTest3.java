package pole;

import java.util.Arrays;

public class ukolTest3 {
    public static void main(String[] args) {
        int[] cele = {9, 16, 25, 36};
        int[] odm = new int[cele.length];
        for (int i = 0; i < cele.length; i++) {
            odm[i] = (int)(Math.sqrt(cele[i]));


        }
        System.out.println(Arrays.toString(cele));
        System.out.println(Arrays.toString(odm));

    }
}
