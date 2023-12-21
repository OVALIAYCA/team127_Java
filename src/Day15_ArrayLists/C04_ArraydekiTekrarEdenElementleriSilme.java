package Day15_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydekiTekrarEdenElementleriSilme {

    public static void main(String[] args) {

        //Verilen bir int arraydeki tekrar eden elementleri
        //silip array'i her elementin unique olduğu bir hale getirin

        int [] arr = {3,2,5,6,7,2,8,9,0,1,2,3,4,7,5,4};

        //bir list oluşturalım
        //arraydeki tüm elemanlari tek tek ele alalim
        //1 defa ekleyelim.yeni array oluşturalım
        //listedeki elemanları yeni array e atayalim
        //yeni array i eski array e atayalım

        List<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (!uniqueList.contains(arr[i])){

                uniqueList.add(arr[i]);
            }
        }
        System.out.println("Unique List: " + uniqueList);
        //[3, 2, 5, 6, 7, 8, 9, 0, 1, 4]

        //bu elemanları taşımak için yeni array oluşturma vakti

        int [] yeniArr = new int[uniqueList.size()];

        System.out.println(Arrays.toString(yeniArr));
        //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0] yeni array oluşturuldu
        //atama yapılacak

        for (int i = 0; i < yeniArr.length ; i++) {

            yeniArr[i] = uniqueList.get(i);

        }

        arr = yeniArr;
        Arrays.sort(arr);
        System.out.println("Array'in son hali : " + Arrays.toString(arr));

        //[3, 2, 5, 6, 7, 8, 9, 0, 1, 4]
        //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9] arrays.sort yaparak sıraya koyduk



    }
}
