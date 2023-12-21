package Day32_maps;

import day03_WrapperClassesVeMatematikselIslemler.C06_ConcatenationStringBirlestirme;

import java.util.Arrays;

public class C01_StringManipulations {

    public static void main(String[] args) {

        //Bir öğrencinin bilgileri arada "-" olarak String bir variable a atanmıştır.
        //isim-soyisim-sınıf-şube-bölüm (ayça-ovalı-11-c-sayısal) gibi
        //bu formatta verilen bilgiden, ismi yazdıran bir method oluşturun.

       String bilgi = "Ali-Cem-10-K-MF";
        subeYazdir(bilgi);

        //öğrencinin isim ve soyismini yazdıran bir method oluşturun
        isimSoyisimYazdir(bilgi);

    }

    public static void subeYazdir (String bilgi){

        //ayraç yerleri ve sıralama değişmez. sabitliyoruz. istenilen bilgilere dinamik olarak ulaşmak için.
        //array e çevirip istediğimiz indekse ulaşacağız

        String[] bilgilerArr = bilgi.split("-"); //[Ali, Cem, 10, K, MF]

        System.out.println(Arrays.toString(bilgilerArr));

        System.out.println("Ogrenci Sube : " + bilgilerArr[3]); //Ogrenci Sube : K


    }

    public static void isimSoyisimYazdir (String bilgi){

        String[] bilgilerArr = bilgi.split("-");  //[Ali, Cem, 10, K, MF]

        System.out.println("İsim Soyisim : " + bilgilerArr[0] + " " + bilgilerArr[1]);
        //İsim Soyisim : Ali Cem

    }
}
