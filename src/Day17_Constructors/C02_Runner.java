package Day17_Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_Runner {

    public static void main(String[] args) {

        C01 obj = new C01();

        System.out.println(obj.sayi); // 6

        obj.rastgeleSayiUret(); // 489

        obj.rastgeleSayiUret(); // 143

        obj.bugunNePisireyim(); // Cacik

        obj.bugunNePisireyim(); // Pilav

        Scanner scanner = new Scanner(System.in);

        String str = new String("Java Candir");

        List<Integer>  sayilar = new ArrayList<>();

           C01 obj2 = new C01();
        // C01 bir class adı
        // obj2 bir obje adı
        // = bir atama işareti
        // new bir keyword
        //C01() Constructor C01 classından bir obje oluşturup getiren yapı
        //Her class'in bir constructor'i olmali
        //İlk atama (initialize) yapan yapı --- constructor





    }
}
