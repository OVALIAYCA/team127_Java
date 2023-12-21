package Day09_ForLoops_ve_MethodOlusturma;

import java.util.Scanner;

public class C01_faktoriyel {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // 5! = 5*4*3*2*1 örnek faktöriyel

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 10'dan küçük pozitif bir tam sayı giriniz");
        int sayi = scanner.nextInt();

        int fakSonuc = 1;
        for (int i = sayi; i >=1 ; i--) {

            fakSonuc *= i;

        }

        System.out.println("Verilen sayinin faktoriyel degeri : " + fakSonuc);



    }
}
