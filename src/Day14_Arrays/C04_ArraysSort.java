package Day14_Arrays;

import java.util.Arrays;

public class C04_ArraysSort {

    public static void main(String[] args) {

        int [] arr1 = {3,9,1,0,12,87,4,6};

        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        String [] arr2 = {"Ibrahim","Huseyin","Hasan","Ismail","Ishak","israfil","isa"};

        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));
        //ASCII tablosunda küçük harfler büyük harflerden sonra gelir


        String isim = "Ali";
        isim.toUpperCase();
        System.out.println(isim); // Ali
        //touppercase kalıcı bir atama olmaz. sadece o satırı bağlar.
        //Bu durum şuan için String e özel bir durumdur.
        //immutable class denir

        //Array ve List konusunda böyle bir şey yok. Method ile yapilan
        //değişiklikler kalici olur.








    }
}
