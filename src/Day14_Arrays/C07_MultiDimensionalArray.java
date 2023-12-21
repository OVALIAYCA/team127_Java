package Day14_Arrays;

import java.util.Arrays;

public class C07_MultiDimensionalArray {

    public static void main(String[] args) {

        //Array'in devamliligini sagliyor
        //Biz eğitim sırasında 2 tane iç içe array bakacagiz

        int [][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        System.out.println(arr.length); // 5 Array var
        System.out.println(Arrays.toString(arr[0])); // [3, 1, 2, 4]
        System.out.println(Arrays.toString(arr[3])); // [10]

        System.out.println((arr[2][2])); // 5 yazdirdi
        System.out.println((arr[0][0])); // 3 yazdirdi

        System.out.println(Arrays.deepToString(arr));
        // [[3, 1, 2, 4], [1, 2], [3, 4, 5], [10], [2, 7]]
        // array in hepsini yazdirmak istersek deepToString kullanilir.
        // iç içe arraylerde sadece toString yetmez!








    }
}
