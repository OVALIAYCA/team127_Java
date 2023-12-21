package Day13_Arrays;

import java.util.Arrays;

public class Soru {

    public static void main(String[] args) {

        //Verilen int bir array deki tüm elementlerin
        // değerlerini 2 artırın

        int [] sayilar = {2,5,9,12};

        for (int i = 0; i < sayilar.length ; i++) {

            sayilar[i] += 2;

            System.out.print(sayilar[i] + " ");  // 4 7 11 14

        }
        System.out.println("       ");
        System.out.println(Arrays.toString(sayilar)); // [4, 7, 11, 14]
    }
}
