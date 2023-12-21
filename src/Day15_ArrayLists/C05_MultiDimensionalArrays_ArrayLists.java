package Day15_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_MultiDimensionalArrays_ArrayLists {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");

        System.out.println(isimler);

        System.out.println(isimler.get(1)); //Omer
        //System.out.println(isimler.get(8)); //IndexOutOfBoundsException

        isimler.add(3,"Azim");
        System.out.println(isimler);
        //[Deniz, Omer, Esra, Azim, Hamza, Basak]
        //hamza isminin yerine azim geldi. hamza isminin indeksi 1 geriye kaydırıldı

        // set() bir elementi UPDATE (yeni değer atamak)için kullanilir

        isimler.set(3,"Gulnur");
        System.out.println(isimler);
        //[Deniz, Omer, Esra, Gulnur, Hamza, Basak]
        //azim ile gulnur değişti. set ile azim yerine gulnur eklendi.

        System.out.println(isimler.set(2, "Yusuf"));
        System.out.println(isimler);
        //[Deniz, Omer, Yusuf, Gulnur, Hamza, Basak]
        //yazdırınca esra yerine yusufu ekledi yazdi

        System.out.println(isimler.set(0, "Ayça"));
        //Deniz yazdirdi. denizin yerine ayça yazdiğini belirtiyor

        System.out.println(isimler);
        //[Ayça, Omer, Yusuf, Gulnur, Hamza, Basak]

    }
}
