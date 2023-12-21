package Day30_iterator_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_Queue {

    public static void main(String[] args) {

        Queue<String> harfler = new LinkedList<>();

        harfler.add("y");
        harfler.add("K");
        harfler.add("M");
        harfler.add("s");

        System.out.println("harfler ; "+ harfler);
        //[y, K, M, s]

        harfler.add("M");
        harfler.add("M");

        System.out.println(harfler.remove()); // y
        System.out.println(harfler);
        //K, M, s, M, M]

        System.out.println(harfler.remove("M")); //true
        System.out.println(harfler); //[K, s, M, M]

        //silmeye en baştan başlıyor

        System.out.println(harfler.element()); // K
        //queue nun ilk elemanını silmeden bize getirir
        System.out.println(harfler); // [K, s, M, M] liste değişmedi.

        System.out.println(harfler.peek()); // K
        System.out.println(harfler); // [K, s, M, M]
        //element ile aynı işlemi yaptı. queue'nun ilk elementini silmeden bize getirdi


        Queue<String > deneme = new LinkedList<>();
        //System.out.println(deneme.element()); // NoSuchElementException
        //öyle bir eleman yok diyor

        System.out.println(deneme.peek()); // null olarak getirdi


        System.out.println(harfler.offer("Z")); //true
        //Z'yi aldı en sona ekledi.Eğer kapasite sınırlaması yoksa verdiğimiz harfi Queue'ya en sona ekler
        System.out.println(harfler); //[K, s, M, M, Z]

        System.out.println(harfler.poll()); //K
        //queue'nun başındakini siler ve bize gösterir
        System.out.println(harfler); //[s, M, M, Z]

       //add verilen elementi her şartta eklerken
       //offer kapasite uygunsa ekler.

    }
}
