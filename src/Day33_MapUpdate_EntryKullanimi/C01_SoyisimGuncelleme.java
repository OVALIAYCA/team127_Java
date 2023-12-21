package Day33_MapUpdate_EntryKullanimi;

import Day32_maps.MapMethodDepo;

import java.util.Map;

public class C01_SoyisimGuncelleme {

    public static void main(String[] args) {

        //Öğrenci numarası verilen elemanın, soyismini verilen yeni değer
        //olarak update ediniz.

        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();

        MapMethodDepo.numaraIleSoyisimUpdate(ogrenciMap,103,"Çelik");

        System.out.println(ogrenciMap.get(103)); // Ali-Celik-11-K-TM

        ogrenciMap = MapMethodDepo.numaraIleSoyisimUpdate(ogrenciMap,105,"Kanki");

        System.out.println(ogrenciMap.get(105)); // Sevgi-Kanki-11-M-TM



    }
}
