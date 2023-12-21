package Day32_maps;

import java.util.Map;

public class C04_BolumListesi {

    public static void main(String[] args) {

        //verilen bir öğrenci map'inde
        //istenen bölümdeki öğrencilerin sınıf, sube, isim, soyisimlerini
        //yazdıran bir method oluşturun


        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();

        System.out.println(ogrenciMap);

        /*
        {101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF,
        107=Esra-Han-11-M-SOZ,
        108=Azim-Kan-12-L-SOZ,
        109=Huseyin-Fan-12-H-MF,
        110=Azim-Kayisi-11-K-TM}
         */

        MapMethodDepo.bolumListesiYazdir(ogrenciMap, "TM");
        /*
        =======TM bolumu ogrenci listesi=========
        10 K Veli Cem
        11 K Ali Cem
        11 M Sevgi Cem
        11 K Azim Kayisi
         */


        MapMethodDepo.soyIsimYazdir(ogrenciMap, "Can");
        // ogrenci map'inde istenen soyisimdeki ogrencilerin
        // sinif, sube, isim, soyisim bilgilerini yazdiran bir method olusturun
        /*
        =======Can soyisimli ogrenci listesi=========
        11 H Ali Can
        10 H Ayse Can
        10 K Sevgi Can
         */
    }

}
