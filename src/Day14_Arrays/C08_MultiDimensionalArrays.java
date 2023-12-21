package Day14_Arrays;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class C08_MultiDimensionalArrays {

    public static void main(String[] args) {

        int[] arr = {3,6,8,1};
        // arr'nin tüm elementlerini yazdirin

        for (int i = 0; i <arr.length ; i++) {

            System.out.print(arr[i] + " "); // 3 6 8 1

        }
        System.out.println("  ");

    int [][] sayilar = {{3,5,6},{2,7},{1,5,8},{1}};

        //sayilar arrayindeki tum elementleri yazinir
        //iki katli array varsa iki katli forloop olacak

        for (int i = 0; i < sayilar.length; i++) {

            for (int j = 0; j < sayilar[i].length; j++) {

                System.out.print(sayilar[i][j] + "  ");

            }
        }    //3  5  6  2  7  1  5  8  1
    }
}
