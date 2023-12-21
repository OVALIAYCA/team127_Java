package Day14_Arrays;

import Day13_Arrays.C06_ArraysSoru4;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {

        int [] arr = {3,6,1,8,2,9,12,-1,4,3};

        //Array'de 5'in olup olmadığını ve varsa kaç tane olduğunu yazdirin

        C06_ArraysSoru4.elemanSayisiYazdir(arr,5); //Aranan eleman array'de yoktur

        C06_ArraysSoru4.elemanSayisiYazdir(arr,3); //Aranan eleman array'de 2 kere kullanılmıştır

        System.out.println(Arrays.binarySearch(arr, 8)); //-11
        System.out.println(Arrays.binarySearch(arr, 9)); // -11
        System.out.println(Arrays.binarySearch(arr, 2)); // 4
        System.out.println(Arrays.binarySearch(arr, 1)); // -1

        //Array de binarysearch ü sort yapip siralamadan kullanirsaniz doğru sonuç
        //verip vermediğini bilemeyiz.



        String [] isimler = {"Esra","Ibrahim","Huseyin","Omer","Azim","Azim"};
        //isimlerde Esra'nin olup olmadigini döndüren bir method olusturun


        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));

        // array de arama yapmadan önce sort yapilmalidir

        System.out.println(Arrays.binarySearch(isimler, "Esra")); // 2 döndürdü
        System.out.println(Arrays.binarySearch(isimler, "Azim")); // 0 döndürdü
        //iki tane azim var o yüzden ilk indeksini veriyor
        //var mı yok mu onu söylüyor
        //kaç tane olduğunu söylemiyor
        System.out.println(Arrays.binarySearch(isimler, "Omer")); // 5 döndürdü

        System.out.println(Arrays.binarySearch(isimler, "Ayça")); // negatif -1 döner
        System.out.println(Arrays.binarySearch(isimler, "Deniz")); // -3 döner
        System.out.println(Arrays.binarySearch(isimler, "Zeki")); // -7 döner
        System.out.println(Arrays.binarySearch(isimler, "deniz")); // -7 döner
        //küçük harf ascıı tablosuna göre büyük harflerden sonra gelecek
        //olmayan elemanlar için "olsaydı hangi sirada olacağini" - işareti ile birlikte döndürür











    }

}
