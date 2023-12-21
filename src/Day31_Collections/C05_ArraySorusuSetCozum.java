package Day31_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C05_ArraySorusuSetCozum {

    public static void main(String[] args) {


        //verilen arrayden tekrar eden elementleri silip array i her bir elementin
        //unique olduğu hali ile kaydedin
        int [] arr = {2,4,6,4,1,2,5,7,9,4,5,7,2};

        Set<Integer> tekrarsizSet = new TreeSet<>();
        //set unique elementlerden oluştuğu için array deki elementleri set e eklersek
        //tekrar edenler otomatik olarak yok olur

        for (Integer each :
             arr) {
            tekrarsizSet.add(each);
        }

        System.out.println(tekrarsizSet);
        //[1, 2, 4, 5, 6, 7, 9]

        //set index kullanmadığı için forloop değil
        //for each loop kullanmalıyız

        arr = new int[tekrarsizSet.size()];
        //for each loop ile yapılacağı için index takibini yapmalıyız.
        int index = 0 ;
        for (Integer each:
             tekrarsizSet) {
            arr[index] = each;
            index++;
        }
        System.out.println(Arrays.toString(arr));
        //[1, 2, 4, 5, 6, 7, 9]
    }
}
