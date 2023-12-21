package Day32_maps;

import java.util.Map;

public class C07_VerilenNumaraAralığındakiOgrenciListesi {

    //Öğrenci map inde verilen başlangıç ve bitiş numaraları (dahil) arasındaki
    //öğrencilerin numara, isim, soyisim lerini yazdıran bir method oluşturun

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();

        MapMethodDepo.NumaraAraligindakiOgrenciListesi(ogrenciMap,100,103);
        /*
        101 Ali Can
        102 Veli Cem
        103 Ali Cem
         */

    }

}
