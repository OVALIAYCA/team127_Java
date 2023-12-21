package Day34_NestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C05_MapIleCozum {

    public static void main(String[] args) {

           /*
    Soru : Verilen bir array’de kullanilan sayilari ve kacar defa kullanildigini yazdirin.
Input : {1,2,3,4,5,3,4,2,5,1,3,2,4,1}
output : 1 kullanimi : 3 adet
 2 kullanimi : 3 adet
 3 kullanimi : 3 adet
 4 kullanimi : 3 adet
 5 kullanimi : 2 adet
     */

        int [] input = {1,2,3,4,5,3,4,2,5,1,3,2,4,1};

        //bir map oluşturalım
        //key; arraydeki sayılar olsun.
        //value; kullanım adeti olsun

        Map<Integer, Integer> kullanimMiktariMap = new TreeMap<>();

        for (Integer each
                :input
             )
        {
           if (!kullanimMiktariMap.containsKey(each)){
               kullanimMiktariMap.put(each,1);
           }else {
               Integer eskiKullanimMiktari= kullanimMiktariMap.get(each);
               kullanimMiktariMap.put(each,eskiKullanimMiktari+1);
           }
        }
        System.out.println(kullanimMiktariMap);
        //{1=3, 2=3, 3=3, 4=3, 5=2}
    }
}
