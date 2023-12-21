package Day13_Arrays;

public class C01_Arrays {

    public static void main(String[] args) {

        int[] arr = new int[5];
        /* Bir array oluşturulurken iki şeyi deklare etmek zorundayız
        1- içine konulacak elementlerin data türü
        2- array in içine konulacak element sayisi (length)

        arrayi yukaridaki gibi oluşturursak değer ataması yapmadığımız için Java default
        olarak belirlediği değeri atar.
        */

        int [] arr2 = {4,1,7,5}; // length 4 oldu
        // data türü intiger olarak belirlendi

        System.out.println(arr2[1]); // array 2 nin 2. siradaki --- 1 yazar
        System.out.println(arr2[3]); // 5 olarak konsola yazar
        // istediğimiz elemente indeks ile ulaşıyoruz

        System.out.println(arr2[arr2.length-1]); // son elementi yazdırmak istersek

        // ilk array de değer ataması yapmadik

        System.out.println(arr[0]); // 0 verir. default olarak her zaman değer atanmayan
        // variable primitive lerde 0 yazdırır

        System.out.println(arr[arr.length-1]); // 0 verir.

        //System.out.println(arr2[5]); //ArrayIndexOutOfBoundsException

        // olmayan bir indekse atama yapabilir miyiz?

        /*arr2[4] = 8 ;  ArrayIndexOutOfBoundsException
        array oluşturulduktan sonra olmayan indeks kullanılarak yeni değer atanması veya
        eklenmesi MÜMKÜN DEĞİLDİR.
        4 elemanlı bir arrayden bir elemanı silip eleman sayisini 3'e düşüremezsiniz
        arttıramazsınız, azaltamazsınız */












    }
}
