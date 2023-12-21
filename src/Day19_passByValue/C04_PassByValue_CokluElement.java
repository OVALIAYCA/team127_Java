package Day19_passByValue;

import java.util.Arrays;
import java.util.Random;

public class C04_PassByValue_CokluElement {

    public static void main(String[] args) {

        int [] arr = {1,2,3};

        System.out.println("arr ilk hali : " + Arrays.toString(arr)); // arr ilk hali : [1, 2, 3]

        elemanlari2Artir(arr); //

        System.out.println("Elemanları artır method call dan sonra arr : " + Arrays.toString(arr)); // Elemanları artır method call dan sonra arr : [3, 4, 5]

        //array değişmedi yolcular değişti.

        arrayiDegistir(arr);

        System.out.println("Arrayi değiştir method call dan sonra arr : " + Arrays.toString(arr));
        //Arrayi değiştir method call dan sonra arr : [3, 4, 5] asıl array değişmedi.

    }

    public static void elemanlari2Artir (int [] arr){

        //arrayin tüm elementlerini 2 artırıp
        //yeni halini yazdırırsın

        for (int i = 0; i <arr.length ; i++) {

            arr[i] += 2;

        }

        System.out.println("Eleman artır methodunda değiştirilen arr : " + Arrays.toString(arr)); // Eleman artır methodunda değiştirilen arr : [3, 4, 5]
    }

    public static void arrayiDegistir (int [] arr){

        // yeni 3 elemanlı bir array oluşturup
        //içine 100 den küçük rastgele sayılar koyun
        //arr'ye bu yeni değeri atayın
        //ve arr'yi yazdırın

        int[] yeniArr = new int[3];
        Random rnd = new Random();
        for (int i = 0; i < yeniArr.length ; i++) {

            yeniArr[i] = rnd.nextInt(100);

        }

        arr = yeniArr;

        System.out.println("Arrayi değiştir methodunda arr : " + Arrays.toString(arr));
        // Arrayi değiştir methodunda arr : [86, 58, 70] random değer atadı ama main method içinde bu değişiklik olmadı
    }
}
