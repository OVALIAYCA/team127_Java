package Day32_maps;

import java.util.Map;

public class C05_SoyIsimndenOgrenciBulma {

    public static void main(String[] args) {

        // ogrenci map'inde istenen soyisimdeki ogrencilerin
        // sinif, sube, isim, soyisim bilgilerini yazdiran bir method olusturun

        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();

        MapMethodDepo.soyIsimYazdir(ogrenciMap,"Can");

    }
}
