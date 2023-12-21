package Day09_ForLoops_ve_MethodOlusturma;

import java.util.Scanner;

public class C11_NestedForLoops {

    public static void main(String[] args) {

        /*Kullanicidan satir ve sütun sayisini alip
        asagidaki gibi *'lardan olusan bir sekil cizdirin

         *
         * *
         * * *
         * * * *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir ; i++) {

            for (int j = 1; j <= i ; j++) {

                System.out.print("* " + " ");

            }
            System.out.println("");

        }


    }
}
