package Day31_Collections;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_ArraydenTekrarEdenSayilariSilme {

    public static void main(String[] args) {

        int [] arr = {2,4,6,4,1,2,5,7,9,4,5,7,2};
        //verilen arrayden tekrar eden elementleri silip array i her bir elementin
        //unique olduğu hali ile kaydedin

        System.out.println(Arrays.toString(arr));//array i yazdırdık
        //[2, 4, 6, 4, 1, 2, 5, 7, 9, 4, 5, 7, 2]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //[1, 2, 2, 2, 4, 4, 4, 5, 5, 6, 7, 7, 9]
        // aynı olanları yan yana yazdırdık sıralama yaparak

        //1.YÖNTEM ; önce forloop ile kaç tane silinecek sayı var bulup
        //sonra boş bir array oluşturup uygun olan elementleri ona taşıyabiliriz

        //2.YÖNTEM; bir loop ile elemanları gözden geçirip
        //bir öncekine eşit olan element varsa oluşturacağım ayrı bir method ile
        //o elementi silip array i değiştiririm


        //1. yöntemle çözüm
        int silinecekElemanSayisi = 0;

        for (int i = 0; i < arr.length-1 ; i++) {

            if (arr[i] == arr[i+1]){
                silinecekElemanSayisi++;
            }
        }

        int[] yeniArr = new int[arr.length-silinecekElemanSayisi];

        int konulacakIndex = 0;
        for (int i = 0; i < arr.length-1 ; i++) {

            if (arr[i] != arr[i+1]){
                yeniArr[konulacakIndex] = arr[i];
                konulacakIndex++;
            }
        }
        if (arr[arr.length - 1] != yeniArr[yeniArr.length-1]) {
            yeniArr[yeniArr.length-1] = arr[arr.length-1];   //[1, 2, 4, 5, 6, 7, 9] son elementi de hallettik
        }
        arr = yeniArr;
        System.out.println(Arrays.toString(arr));
        //[1, 2, 4, 5, 6, 7, 0] sondaki elementi kontrol edecek bir sonraki element olmadığı için
        //0 olarak kaldı. manuel kontrol ederiz

    }
}
