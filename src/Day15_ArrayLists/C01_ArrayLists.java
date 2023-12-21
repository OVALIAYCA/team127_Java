package Day15_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayLists {

    public static void main(String[] args) {

        //array list de eklemeleri tek tek yapmak zorundayız
        //avantajı array in uzunluğunu artırıp azaltmaya yarar.

        List<Integer> sayilar = new ArrayList<>();
        System.out.println(sayilar); // [] ekleme yapılmadı bu şekilde
        //konsola yazdirdi

        sayilar.add(5);
        sayilar.add(8);
        sayilar.add(3);
        System.out.println(sayilar); // [5, 8, 3]
        //ekleme sirasina göre list oluşturdu

        sayilar.add(6);
        sayilar.add(9);

        System.out.println(sayilar); // [5, 8, 3, 6, 9]

        sayilar.add(2,11);
        System.out.println(sayilar); // [5, 8, 11, 3, 6, 9]
        //2. indekse 11 ekledi geri kalan elementler bir geriye kaydı.

        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(1);
        rakamlar.add(2);
        System.out.println(rakamlar); // [1, 2]


        rakamlar.addAll(sayilar);
        System.out.println(rakamlar);
        //[1, 2, 5, 8, 11, 3, 6, 9] sonuna sayilar arrayini ekledi.

        rakamlar.addAll(1,sayilar);
        System.out.println(rakamlar);
        //[1, 5, 8, 11, 3, 6, 9, 2, 5, 8, 11, 3, 6, 9]
        //1.indekse tüm rakamlar arrayini ekledi ve devam etti

    }
}
