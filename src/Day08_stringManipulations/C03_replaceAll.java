package Day08_stringManipulations;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class C03_replaceAll {

    public static void main(String[] args) {

        String str = "Arama sonucunda 1434 kelimeye ulasildi";

        // arama sonuclarinin 100'den fazla oldugunu test edin
        //100 'den fazla ise "Test Passed",
        //100'den fazla değilse "Test Failed" yazdirin

        str = str.replaceAll("\\D","");
        System.out.println(str); // sadece sayisal degeri aldik 1434

        int sonucSayisi = Integer.parseInt(str); // string i if içine alamadık sayisal deger olmadigi için
        // parseInt() içinde sadece digit bulunan String'i
        //Integer'a donusturur



        if (sonucSayisi>100){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }



    }
}
