package Day15_MultiDimensionalArrays;

public class C04_MDA_IlkElementlerToplami {

    public static void main(String[] args) {

        //Verilen bir MDA de
        // Her inner array'in ilk elementinin toplamini bize döndüren bir method oluşturun

        int [][] arr = {{1,4,7},{3,5},{1,9,0,8},{2}};

        System.out.println(ilkElementTopla(arr));
        //1+3+1+2=7 yazdirir


    }

    public static int ilkElementTopla (int [][] arr){

        //tüm elemanlara ihtiyacımız yok. for loop inner array'leri getirirse
        //biz o inner array'in ilk elemanını alırız.
        //tek for loop yeter!

        int ilkElementToplam = 0 ;

        for (int i = 0; i < arr.length ; i++) {

                ilkElementToplam += arr[i][0];

        }

        return ilkElementToplam;
    }
}
