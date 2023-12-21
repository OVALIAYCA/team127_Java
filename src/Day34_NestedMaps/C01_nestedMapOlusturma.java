package Day34_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C01_nestedMapOlusturma {

    public static void main(String[] args) {

     /*
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
     */

        // Key=101, Value="Ali-Can-11-H-MF"
        //Key = 101 Value Map olsun istiyoruz
        //{isim=Ali, soyisim=Can, sinif=11, sube=H, bolum=MF}


        //ogrenci map'i {101=ogrMap101, 102=ogrMap102, 103=ogrMap103}
        Map<Integer,Map<String,String>> ogrenciMap = new HashMap<>();
        //outer map denir

        //101 numaralı öğrenciyi eklemek istersek, önce value map'i oluşturmamız gerekir
        Map<String, String> ogrMap101 = new HashMap<>();
        ogrMap101.put("isim", "ALi");
        ogrMap101.put("soyisim", "Can");
        ogrMap101.put("sinif", "11");
        ogrMap101.put("sube", "H");
        ogrMap101.put("bolum", "MF");

        //ogrMap101 bitince bunu öğrenciMap'e ekleyelim
        ogrenciMap.put(101,ogrMap101);


        //102 numaralı öğrenciyi eklemek istersek, önce value map'i oluşturmamız gerekir
        Map<String, String> ogrMap102 = new HashMap<>();
        ogrMap102.put("isim", "Veli");
        ogrMap102.put("soyisim", "Cem");
        ogrMap102.put("sinif", "10");
        ogrMap102.put("sube", "K");
        ogrMap102.put("bolum", "TM");

        //ogrMap102 bitince bunu öğrenciMap'e ekleyelim
        ogrenciMap.put(102,ogrMap102);



        //103 numaralı öğrenciyi eklemek istersek, önce value map'i oluşturmamız gerekir
        Map<String, String> ogrMap103 = new HashMap<>();
        ogrMap103.put("isim", "ALi");
        ogrMap103.put("soyisim", "Cem");
        ogrMap103.put("sinif", "11");
        ogrMap103.put("sube", "K");
        ogrMap103.put("bolum", "TM");

        //ogrMap101 bitince bunu öğrenciMap'e ekleyelim
        ogrenciMap.put(103,ogrMap103);


        System.out.println(ogrenciMap);
        //{101={sinif=11, sube=H, soyisim=Can, bolum=MF, isim=ALi},
        // 102={sinif=10, sube=K, soyisim=Cem, bolum=TM, isim=Veli},
        // 103={sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=ALi}}

        //102 numaralı öğrencinin soyismini yazdırın
        //nestedmap olmasa önce value alınacak
        //sonra split edilecek array e dönüşecek, array de değişiklik yapılaca
        // array yeniden string olacak ve map'e yüklenecek vs aşamaları vardı.

        ogrenciMap.get(102); //{sinif=10, sube=K, soyisim=Cem, bolum=TM, isim=Veli}
        System.out.println(ogrenciMap.get(102).get("soyisim")); //Cem

        //103 numaralı öğrencinin bölümüni yazdırın
        System.out.println(ogrenciMap.get(103).get("bolum")); //TM

        ogrenciMap.get(101).put("soyisim", "BULUT");
        System.out.println(ogrenciMap.get(101));
        //{sinif=11, sube=H, soyisim=BULUT, bolum=MF, isim=ALi}



    }
}
