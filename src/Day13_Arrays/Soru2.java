package Day13_Arrays;

import java.util.Arrays;

public class Soru2 {

    public static void main(String[] args) {

        //Verilen String bir array'de istenen harfi içeren elementleri yazdirin

        String[] isimler = {"Huseyin","Mehmet","Esra","Ercan","Omer"};

        String istenenHarf = "e";

        for (int i = 0; i < isimler.length ; i++) {

            if (isimler[i].contains(istenenHarf)){

                System.out.print(isimler[i] + " ");

            }

        }

    }
}
