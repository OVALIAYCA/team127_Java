package Day31_Collections;

import java.util.HashSet;
import java.util.Set;

public class C02_Set {

    public static void main(String[] args) {

        //unique değerler barındırır. Index yoktur.
        //matematikteki küme mantığı ile çalışır
        //tüm elementleri tutar
        //varolan bir elementi tekrar yüklemek isterseniz eski elementi siler yenisini ekler.

        Set<String> harfler = new HashSet<>();
        System.out.println(harfler.hashCode());
        // 0

        harfler.add("A");
        System.out.println(harfler);
        //[A]
        System.out.println(harfler.hashCode());
        //65

        harfler.add("B");
        System.out.println(harfler);
        //[A, B]

        System.out.println(harfler.hashCode());
        //131

        harfler.add("Ali");
        System.out.println(harfler);
        //[A, B, Ali]
        System.out.println(harfler.hashCode());
        //66049




    }
}
