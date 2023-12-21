package Day15_MultiDimensionalArrays;

public class C03_MDAdaEnBuyukEnKucukElemanlariBulma {

    public static void main(String[] args) {

        //en büyük ve en küçük sayilari bulup yazdiran bir method oluşturun

        int [][] arr = {{1,4,7},{3,5},{1,-9,0,8},{2}};
        enBuyukEnKucukEleman(arr);
    }

     public static void enBuyukEnKucukEleman (int [][] arr){

     int maxElement = arr [0][0];
     int minElement = arr [0][0];

         for (int i = 0; i < arr.length ; i++) {

             for (int j = 0; j <arr[i].length ; j++) {

                 if (arr[i][j] > maxElement){

                     maxElement = arr[i][j];
                 }
                if (arr[i][j] < minElement){

                    minElement = arr[i][j];
                }
             }

         }

         System.out.println("Array'deki en büyük sayi : " + maxElement);
         System.out.println("Array'deki en küçük sayi : " + minElement);
    }
}
