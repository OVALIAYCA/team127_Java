package Day09_ForLoops_ve_MethodOlusturma;

import java.util.Scanner;

public class C09_NestedForLoops {

    public static void main(String[] args) {

        /*Kullanicidan satir ve sütun sayisini alip
        asagidaki gibi *'lardan olusan bir sekil cizdirin

         1 1 1 1 1
         2 2 2 2 2
         3 3 3 3 3

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir = scanner.nextInt();

        System.out.println("Sütun sayisini giriniz");
        int sütun = scanner.nextInt();

        for (int i = 1; i <= satir ; i++) {

            for (int j = 1; j <= sütun; j++) {

                System.out.print(i + " ");
            }
            System.out.println("");

        }
    }
}
