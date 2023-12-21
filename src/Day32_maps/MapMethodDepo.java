package Day32_maps;

import java.util.*;

public class MapMethodDepo {

     /*
        Map kompleks bilgiler barindirabilir
        Ne kadar cok bilgi barindirirsa, bilgilere erismek o kadar islem gerektirebilir
        Ama temel olarak map key ve value'dan olusur

        value bir cok bilgi barindiran bir String ise
        bilgilere ulasmak icin split() ile String'i array'e ceviririz

        1- Eger sadece value'dan bilgiler istenirse
           - ogrenciMap.values() ile value'ler bir collection'a kaydedilir
           - sonra collection'daki String'ler for-each loop ile ele alinip
           - split() ile array'e cevrilir
           - ve ISTENEN SARTLARA uyan value'lardan ISTENEN BILGILER kullanilir

        2- Eger key ve value birlikte istenirse
            - ogrenciMap.keySet() ile key'ler bir Set'e kaydedilir
            - for each loop ile key'ler elden gecirilir
            - sadece key degil, ogrenciMap.get(each) ile value'ya ulasilir
            - value split() ile array'e cevrilir
            - Istenen sartlari saglayan kayitlarin, istenen bilgileri KULLANILIR

     */



    // verilen sube'deki ogrencilerin isim ve soyisimlerini yazdiran bir method olusturun

    public static void subeListesiyazdir(Map<Integer,String> ogrenciMap, String istenenSube){

        Collection<String> valueCollection = ogrenciMap.values();
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF]
        String[] valueArr;
        System.out.println("========"+istenenSube + " subesi ogrenci Listesi"+"======");

        for (String each: valueCollection
        ) { // each ==> Ali-Can-11-H-MF

            valueArr = each.split("-"); // [Ali, Can, 11, H, MF]

            if (valueArr[3].equalsIgnoreCase(istenenSube)){
                System.out.println(valueArr[0] + " "+ valueArr[1]);
            }


        }


    }

    public static Map<Integer, String> okulMapDondur() {
        Map<Integer,String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
        ogrenciMap.put(108,"Azim-Kan-12-L-SOZ");
        ogrenciMap.put(109,"Huseyin-Fan-12-H-MF");
        ogrenciMap.put(110,"Azim-Kayisi-11-K-TM");

        return ogrenciMap;
    }
    public static void bolumListesiYazdir(Map<Integer, String> ogrenciMap, String istenenBolum) {

        // istenen bolumdeki ogrencilerin sinif, sube, isim, soyisim'lerini yazdiran

        Collection<String> valueCollection = ogrenciMap.values();

        String[] valueArr;

        System.out.println("======="+ istenenBolum + " bolumu ogrenci listesi=========");

        for (String each : valueCollection
        ) { // each ==> "Azim-Kayisi-11-K-TM"

            valueArr = each.split("-"); // [Ali, Can, 11, H, MF]

            if (valueArr[4].equalsIgnoreCase(istenenBolum)){

                System.out.println(valueArr[2] + " " + valueArr[3] + " " + valueArr[0] + " "+valueArr[1]);
            }

        }
    }


    public static void soyIsimYazdir(Map<Integer,String> ogrenciMap, String istenenSoyIsim) {
        // ogrenci map'inde istenen soyisimdeki ogrencilerin
        // sinif, sube, isim, soyisim bilgilerini yazdiran bir method olusturun

        Collection<String> valueCollection = ogrenciMap.values();
        String[] valueArr;
        System.out.println("======="+ istenenSoyIsim + " soyisimli ogrenci listesi=========");
        for (String each : valueCollection
        ) { // each ==> "Azim-Kayisi-11-K-TM"

            valueArr = each.split("-"); // [Ali, Can, 11, H, MF]

            if (valueArr[1].equalsIgnoreCase(istenenSoyIsim)){

                System.out.println(valueArr[2] + " " + valueArr[3] + " " + valueArr[0] + " "+valueArr[1]);
            }

        }

    }

    public static void numaraliSinifOgrenciListesiYazdir(Map<Integer, String> ogrenciMap, String sinifNo) {

        Set<Integer> keySeti = ogrenciMap.keySet();
        String valueEach;
        String [] valueArr ;
        System.out.println(keySeti);
        System.out.println("=======Numaralı " + sinifNo + " . sınıf listesi");

        for (Integer each:
             keySeti)
        {
            //each bize key leri getirir
            valueEach = ogrenciMap.get(each);
            valueArr = valueEach.split("-");
            if (valueArr[2].equals(sinifNo)){
                System.out.println(each + " " + valueArr[0] + " " + valueArr[1] + " " + valueArr[3]);
            }

        }
        }


    public static void NumaraAraligindakiOgrenciListesi(Map<Integer, String> ogrenciMap, int baslangicNo, int bitisNo) {

        Set<Integer> keySeti = ogrenciMap.keySet();
        //[101, 102, 103, 104, 105, 106, 107, 108, 109, 110]
        String valueEach;
        String[] valueArr;
        int sayac = 0;

        for (Integer each:
             keySeti)
        {
            if (each >= baslangicNo && each <= bitisNo){
                valueEach = ogrenciMap.get(each);
                 valueArr = valueEach.split("-");
                System.out.println(each + " " + valueArr[0] + " " + valueArr[1]);
                sayac++;
            }
        }

       if (sayac == 0){
           System.out.println("Verilen aralıkta öğrenci bulunmamaktadır");
       }

    }

    public static Map<Integer, String> numaraIleSoyisimUpdate(Map<Integer, String> ogrenciMap, int ogrenciNo, String yeniSoyIsim) {
        // once istenen ogrenci numarasina ait value'u alalim
        // Ali-Cem-11-K-TM
        String ogrenciValue = ogrenciMap.get(ogrenciNo);

        // split ile datayi manipule edilebilir hale getirelim
        // [Ali, Cem, 11, K, TM]
        String[] ogrenciValueArr = ogrenciValue.split("-");

        // array'in 1.index'indeki soyismi yeniSoyisim olarak update edelim
        // [Ali, Celik, 11, K, TM]
        ogrenciValueArr[1] = yeniSoyIsim ;

        // array'deki elemanlari, yeniden value formatina sokmamiz lazim
        // String olarak "Ali-Celik-11-K-TM" elde ederiz
        String yeniValue =  ogrenciValueArr[0] + "-" +
                ogrenciValueArr[1] + "-" +
                ogrenciValueArr[2] + "-" +
                ogrenciValueArr[3] + "-" +
                ogrenciValueArr[4];

        // elimizde key var(ogrenciNo),elimizde yeni value de var
        ogrenciMap.put(ogrenciNo,yeniValue);

        return ogrenciMap;

    }
    public static Map<String, Object> rezervasyonOlustur(String firstname, String lastname, int totalprice,
                                                         boolean depositpaid, String checkin,
                                                         String checkout, String additionalneeds) {
    /*
         {
            "firstname" : "Ahmet",
            "lastname" : "Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2023-07-21",
                   "checkout" : "2023-08-10"
                      },
            "additionalneeds" : "wi-fi" }
         */
        Map<String, Object> rezervasyonMap = new HashMap<>();

        rezervasyonMap.put("firstname",firstname);
        rezervasyonMap.put("lastname",lastname);
        rezervasyonMap.put("totalprice",totalprice);
        rezervasyonMap.put("depositpaid",depositpaid);


        Map<String,String> innerMap = new HashMap<>();
        innerMap.put("checkin",checkin);
        innerMap.put("checkout",checkout);

        rezervasyonMap.put("bookingdates",innerMap);
        rezervasyonMap.put("additionalneeds",additionalneeds);

        return rezervasyonMap;
    }

}

