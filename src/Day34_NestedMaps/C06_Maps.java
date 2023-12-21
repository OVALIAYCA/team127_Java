package Day34_NestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C06_Maps {

    public static void main(String[] args) {

        /*Soru : Verilen bir array’de kullanilan sayilari ve kacar defa kullanildigini yazdirin.
        Input : {a,b,c,d,e,c,d,b,e,a,c,b,d,a}
        output : a kullanimi : 3 adet
        b kullanimi : 3 adet
        c kullanimi : 3 adet
        d kullanimi : 3 adet
        e kullanimi : 2 adet
        */

        String[] input = {"a","b","c","d","e","c","d","b","e","a","c","b","d","a"} ;
        Map<String,Integer> kullanimMiktarlariMap = new TreeMap<>();
        Integer eskiKullanimMiktari;
        for (String each: input
             ) {
            if (!kullanimMiktarlariMap.containsKey(each)){
                kullanimMiktarlariMap.put(each,1);
            }else {
               eskiKullanimMiktari = kullanimMiktarlariMap.get(each);
               kullanimMiktarlariMap.put(each, eskiKullanimMiktari+1);
            }
        }
        System.out.println(kullanimMiktarlariMap);
        //{a=3, b=3, c=3, d=3, e=2}
    }
}
