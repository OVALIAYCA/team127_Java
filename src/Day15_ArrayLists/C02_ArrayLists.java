package Day15_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayLists {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        System.out.println(sayilar);
        System.out.println(sayilar.isEmpty()); // true
        //liste boş

        System.out.println(sayilar.size()); // 0 yazdirdi
        //length yok size var

        sayilar.add(5);
        sayilar.add(0,7);
        //0. indekse 7 ekle dedik. başa 7 yazdi sonra 5 yazdi
        System.out.println(sayilar); // [7, 5]
        System.out.println(sayilar.size()); // 2 oldu

        System.out.println(sayilar.isEmpty()); // false
        //boş mu dolu mu diye soruyoruz

        System.out.println(sayilar.contains(5)); // true
        System.out.println(sayilar.contains(3)); // false

        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(8);
        System.out.println(sayilar); // [7, 5, 3, 2, 8]

        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(3);
        rakamlar.add(8);
        rakamlar.add(5);

        System.out.println(sayilar.containsAll(rakamlar));
        //true
        rakamlar.add(9);
        System.out.println(rakamlar); // [3, 8, 5, 9]

        System.out.println(sayilar.containsAll(rakamlar));
        //false
        //3-8-5 var ama 9 sayilar array inde yok.




    }
}
