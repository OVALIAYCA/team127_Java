package Day32_maps;

import java.util.ArrayList;
import java.util.List;

public class C02_StringManipulations {

    public static void main(String[] args) {

        //Öğrenci bilgilerini belirli formatta tutan Stringlerden oluşan bir
        //listemiz mevcut.BU listeden isim verdiğimizde o isme sahip isim ve soyisimlerini
        //yazdıran bir method oluşturun

        List<String> ogrenciList = new ArrayList<>();
        ogrenciList.add("Ali Can-Yildiz-10-K-Soz");
        ogrenciList.add("Esra-Yilmaz-11-L-Soz");
        ogrenciList.add("Ercan-Yil-10-M-MF");
        ogrenciList.add("Beytullah-Han-12-K-MF");

        isimSoyisimYazdir(ogrenciList,"beytullah"); //İsim Soyisim : Beytullah Han


        //şubesi verilen öğrencilerin isim ve soyisimlerini yazdıran
        //bir method oluşturun

        subeListesiYazdir(ogrenciList, "l"); //İsim Soyisim : Esra Yilmaz
    }

    public static void isimSoyisimYazdir (List<String> ogrenciList, String istenenIsim){

        String ogrenciBilgi ;

        for (int i = 0; i <ogrenciList.size() ; i++) {

            ogrenciBilgi = ogrenciList.get(i);
            String[] bilgiler =ogrenciBilgi.split("-");
            if (bilgiler[0].equalsIgnoreCase(istenenIsim)){
                System.out.println("İsim Soyisim : " + bilgiler[0] + " " + bilgiler[1]);
            }

        }
    }

    public static void subeListesiYazdir (List<String> ogrenciList, String istenenSube){

        String[] bilgilerArr;

        for (String each:
             ogrenciList) {

            bilgilerArr = each.split("-");

            if (bilgilerArr[3].equalsIgnoreCase(istenenSube)){

                System.out.println("İsim Soyisim : " + bilgilerArr[0] + " " + bilgilerArr[1]);
            }

        }
    }
}
