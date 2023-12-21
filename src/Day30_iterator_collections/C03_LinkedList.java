package Day30_iterator_collections;

import java.util.*;

public class C03_LinkedList {

    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>();

        List<Integer> ll2 = new LinkedList<>();

        Queue<String> ll3 = new LinkedList<>();

        Deque<String> ll4 = new LinkedList<>();

        //linkedlist birden fazla interface'i implement ettiği için
        //implement ettiği interface'ler data türü olarak seçilebilir ve
        //hangi interface'i data türü seçersek linkedlist o data türünün
        //sahip olduğu özellikleri taşır

        //Eğer data türü ve constructor linkedlist seçilirse implement ettiği LIST,
        //QUEUE VE DEQUE interface'lerindeki tüm özellikleri taşıyacaktır.

        //Eğer data türü olarak List<> seçilirse bizim şimdiye kadar kullandığımız
        //ArrayList ile aynı özelliklere sahip olur

        ll2.add(4);
        ll2.add(5);
        ll2.add(8);
        System.out.println(ll2); //[4, 5, 8]  ekleme sırasına göre yazdırır

        ll2.add(1,9);
        System.out.println(ll2); // [4, 9, 5, 8] 4 ve 5 in arasına 9 ekledi.

        System.out.println(ll2.get(2)); // 5
        //listeden indeksi 2 olanı çağırdık.


        System.out.println(ll2.remove(1)); // 9 sileceği elemanı yazdırır
        System.out.println(ll2); // [4, 5, 8]
        //1. indeksteki 9 u sildi

        //ll2.remove(8); //IndexOutOfBoundsException 8. eleman yok

        Integer silinecekSayi = 8;
        System.out.println(ll2.remove(silinecekSayi)); // true gittim 8 i buldum sildim diyor. delil.
        System.out.println(ll2); //[4, 5] 8 i oluşturduk ve sonrasında sildik.
        //önce 8 i variable olarak atamamız gerek.

        silinecekSayi = 12;
        System.out.println(ll2.remove(silinecekSayi)); //false
        //list de 12 yok silemedim diyor delil olarak false getirdi.

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(10);
        System.out.println(list); // [4, 6, 9, 10]

        System.out.println(list.retainAll(ll2)); // true
        //o işi yaptım geldim diyor

        System.out.println("ll2 ; " + ll2);
        //ll2 ; [4, 5].  son hali 4-5 ti öyle kaldı
        System.out.println("list ; " + list);
        //list ; [4].  kesişimleri dursun kalanları sil demek. iki list arasındaki
        //kesişim 4 o yüzden kalanları sildi. kalan 4 ü getirdi yazdırdı
        //list ana listemizdir
        //ortak eleman dışındakileri siler

        list.add(6);
        list.add(9);
        list.add(10);

        System.out.println(list.removeAll(ll2)); //true
        System.out.println("ll2 ; " + ll2); //[4, 5]
        System.out.println("list ; " + list); // [6, 9, 10]
        //removeAll bu defa ortak olanları sildi.
        //ortak elemanları siler.




    }
}
