package Day31_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraySorusuListCozum {
    public static void main(String[] args) {


        //verilen arrayden tekrar eden elementleri silip array i her bir elementin
        //unique olduğu hali ile kaydedin
        int [] arr = {2,4,6,4,1,2,5,7,9,4,5,7,2};

        List<Integer> tekrarsizList = new ArrayList<>();
        //arraydeki elementleri elden geçirelim. List de yoksa ekleyelim

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i]);
            }
        }
        System.out.println("List olarak tekrarsız elementler : " + tekrarsizList);
        //List olarak tekrarsız elementler : [2, 4, 6, 1, 5, 7, 9]

        System.out.println("Array'in son hali : " + Arrays.toString(arr));
        //Array'in son hali : [2, 4, 6, 4, 1, 2, 5, 7, 9, 4, 5, 7, 2]
        //array henüz düzelmedi

        //array e listin uzunluğunu taşıyan yeni bir değer atayalım
        arr = new int[tekrarsizList.size()];

        //bir loop ile listedeki elementleri array e kaydederim
        for (int i = 0; i < arr.length ; i++) {

            arr[i] = tekrarsizList.get(i);

        }

        System.out.println("Array'in en son hali : " + Arrays.toString(arr));
        //Array'in en son hali : [2, 4, 6, 1, 5, 7, 9]


    }
}
