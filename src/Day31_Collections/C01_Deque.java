package Day31_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {

    public static void main(String[] args) {

        Deque<String> harfler = new LinkedList<>();
        harfler.add("g");
        harfler.add("K");
        harfler.add("A");
        System.out.println(harfler); //[g, K, A]
        //ekleme sırasına göre eklendi

        harfler.addLast("D");
        System.out.println(harfler); //[g, K, A, D]

        harfler.addFirst("A");
        System.out.println(harfler); //[A, g, K, A, D]
        //elementlere baştan ve sondan ulaşma avantajı var.

        System.out.println(harfler.removeLastOccurrence("A")); //true
        System.out.println(harfler); // [A, g, K, D]

        System.out.println(harfler.remove("X")); //false
        //olmayan element

        System.out.println(harfler.remove("A")); //true
        System.out.println(harfler); //[g, K, D]
        //ilk kullanımını bulur siler.
        //System.out.println(harfler.removeFirst("A"));

        System.out.println(harfler.poll()); //g
        System.out.println(harfler); //[K, D]
        //baştaki elemanı getirdi ve sildi

        Deque<String> bosDeque = new LinkedList<>();
        System.out.println(bosDeque.poll()); //null
        System.out.println(bosDeque.pollFirst()); //null
        //System.out.println(bosDeque.remove()); //NoSuchElementException
        //System.out.println(bosDeque.removeFirst()); //NoSuchElementException


        System.out.println(harfler.element()); //K
        //ilk elementi bize getirir ama silmez
        //boş ise nosuchelementexception fırlatır

        System.out.println(harfler.pop()); //K
        System.out.println(harfler); //[D]
        //ilk elementi siler bize getirir pop();



    }
}
