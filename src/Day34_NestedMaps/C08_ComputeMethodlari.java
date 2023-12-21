package Day34_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C08_ComputeMethodlari {

    public static void main(String[] args) {

        Map<String, Integer> harfler = new HashMap<>();
        harfler.put("A",24);
        harfler.put("K",15);
        harfler.put("Y",28);
        harfler.put("C",12);

        System.out.println(harfler);
        //{A=24, C=12, Y=28, K=15}

        //A'nin değerini 5 artırın
        int eskiKullanimMiktari = harfler.get("A");
        harfler.put("A", eskiKullanimMiktari+5);
        System.out.println(harfler);
        //{A=29, C=12, Y=28, K=15}
        //A 29 oldu

        //eğer C yoksa değeri 40 olarak ekleyin.
        if (!harfler.containsKey("C")){
            harfler.put("C", 40);
        }
        System.out.println(harfler);
        //{A=29, C=12, Y=28, K=15} C olduğu için eklemedi

        //eğer Y varsa değerini 2 katına çıkarın
        if (harfler.containsKey("Y")){
            eskiKullanimMiktari = harfler.get("Y");
            harfler.put("Y",eskiKullanimMiktari*2);
        }
        System.out.println(harfler);
        //{A=29, C=12, Y=56, K=15}
        //y değerini 2 katına çıkardı

        //A'nın değerini 10 artırın
        harfler.compute("A", (k,v)-> v+10);
        System.out.println(harfler);
        //{A=39, C=12, Y=56, K=15}

        //X'in değerini 10 artirin
        //harfler.compute("X", (k,v)-> v+10);
        //System.out.println(harfler);
        //NullPointerException

        //X varsa değerini 10 artirin
        harfler.computeIfPresent("X",(k,v)-> v+10);
        System.out.println(harfler);
        //{A=39, C=12, Y=56, K=15}

        //K varsa değerini 10 artirin
        harfler.computeIfPresent("K",(k,v)-> v+10);
        System.out.println(harfler);
        //{A=39, C=12, Y=56, K=25}

        // X yoksa değeri 10 olarak ekleyin
        //1.yöntem
        harfler.putIfAbsent("X",10);
        System.out.println(harfler);
        //{A=39, C=12, X=10, Y=56, K=25}
        //2.yöntem
        harfler.computeIfAbsent("X", k-> 10);
        System.out.println(harfler);
        //{A=39, C=12, X=10, Y=56, K=25}


    }
}
