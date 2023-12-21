package Day13_Arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        int sayi = 10 ;

        int [] arr = {4,6,1,2}; // array : non primitive dir

        // Bu array i yazdiralim

        System.out.println(sayi); // 10

        System.out.println(arr); // [I@7dc36524

        // array ler direk yazdırılmaz. direk yazdırmak istersek array i değil referansı yazdırır
        //array i yazdırmak için array class ından yardım alırız

        System.out.println(Arrays.toString(arr)); // [4, 6, 1, 2] yazdirir
        // array.toString methodunda yazdırırken aralarında  bir boşluk bırakır. sen arasında
        // fazla boşluk bıraksan da düzeltir

        String[] kelimeler = {" Ali", ", okula"," gitti."};
        System.out.println(Arrays.toString(kelimeler)); // [ Ali, , okula,  gitti.]

        // array in tüm elementlerini yazdirin. array in içindeki elementlerini baz alıyoruz


        //int [] arr = {4,6,1,2};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        // tek tek yapmak mantıklı değil. sadece indeksler değişiyor
        //forloop ile yapılır
        //array.length olarak yaparsak dinamik olur.

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");   //4 6 1 2
        }

        /*
        arr[i] üzerinden tüm elementlerle ilgili işlem yapabiliriz
        */







    }
}
