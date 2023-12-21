package Day13_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_ArraysSoruKullanicidanBilgiAlArrayOlustur {

    public static void main(String[] args) {

      //  Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip
      //  array’i olusturan ve bize donduren bir method olusturun.

     String[] kullanicidanAlinanArray = stringArrayOlustur();

     System.out.println(Arrays.toString(kullanicidanAlinanArray));


    }

    public static String [] stringArrayOlustur(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Array'in uzunluğunu giriniz");
        int arrLength = scanner.nextInt();


        String [] kullaniciArrayi = new String[arrLength]; // ornek 5 girildi
        // [null, null, null, null, null]

        scanner = new Scanner(System.in); // next ve nextline atlamasını önlemek için yapıldı

        for (int i = 0; i <arrLength ; i++) {
            System.out.println("Array'e eklemek için bir isim giriniz");
            kullaniciArrayi[i] = scanner.nextLine();

        }

        return kullaniciArrayi;
    }
}
