package Day32_maps;

import javax.crypto.MacSpi;
import java.util.Map;

public class C06_NumaraliSinifOgrenciListesi {

    public static void main(String[] args) {

        //verilen sınıftaki öğrencilerin numarai isim, soyisim ve şubelerini yazdıran
        //bir method oluşturun

        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();

        System.out.println(ogrenciMap.get(103)); //Ali-Cem-11-K-TM
        //key leri bir bir ele alıp
        //o key'e ait value'yu inceleriz
        //sınıf uygunsa key ve value den istenen bölümleri method a ekleriz

        MapMethodDepo.numaraliSinifOgrenciListesiYazdir(ogrenciMap, "11");
        //[101, 102, 103, 104, 105, 106, 107, 108, 109, 110]
        /*
        =======Numaralı 11 . sınıf listesi
        101 Ali Can H
        103 Ali Cem K
        105 Sevgi Cem M
        107 Esra Han M
        110 Azim Kayisi K
         */

    }
}
