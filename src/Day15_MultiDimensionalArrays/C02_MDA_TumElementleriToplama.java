package Day15_MultiDimensionalArrays;

public class C02_MDA_TumElementleriToplama {

    public static void main(String[] args) {

        // verilen mda daki tüm sayilari toplayıp yazdiran bir method oluştur

        int [][] arr = {{1,4,7},{3,5},{1,9,0,8},{2}};

        arraydekiElementleriTopla(arr); // Array'deki tum sayilarin toplami : 40

        arraydekiElementleriTopla(new int[][]{{4,6,7},{1,2}}); // Array'deki tum sayilarin toplami : 20



    }
    public static void arraydekiElementleriTopla(int [][] arr){

        int toplam = 0;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                toplam += arr[i][j];

            }
        }
        System.out.println("Array'deki tüm sayilarin toplami : " + toplam);
    }




}

