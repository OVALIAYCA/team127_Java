package Day16_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_IndexOf {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");
        isimler.add("Esra");
        System.out.println(isimler); //[Deniz, Omer, Esra, Hamza, Basak, Esra]

        System.out.println(isimler.indexOf("Esra")); // 2
        System.out.println(isimler.lastIndexOf("Esra")); // 5

        System.out.println(isimler.indexOf("Ayça")); // -1 yani yok!
        System.out.println(isimler.indexOf("Ali")); // -1


    }
}
