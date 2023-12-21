package Day09_ForLoops_ve_MethodOlusturma;

import java.util.Scanner;

public class C10_NestedForLoopsUcgen {

    public static void main(String[] args) {

        /*Kullanicidan satir ve sütun sayisini alip
        asagidaki gibi *'lardan olusan bir sekil cizdirin

         1
         1 2
         1 2 3
         1 2 3 4

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir = scanner.nextInt();

        // ucgen sekiller için de nestedforloops kullaninir
        //sadece dikdortgenden farkı; sütun no suna ihtiyacimiz yoktur
        // her satirdaki sütun sayisi o satirin no su ile aynidir
        // 1. satirin son sütun sayisi = 1
        // 2. satirin son sütun sayisi = 2 ... gibi

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <= i ; j++) {

                System.out.print(j + " ");

            }

            System.out.println("");

        }
    }
}
