package day02_DataCasting_Scanner;

import java.util.Scanner;

public class C04_Swap {

    public static void main(String[] args) {

        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk tam sayiyi giriniz");

        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");

        int sayi2 = scanner.nextInt();

        System.out.println("Girdiginiz degerler : sayi1 = " +sayi1+", sayi2= " +sayi2);

        int bosKova = 0;
        bosKova = sayi2;
        sayi2 = sayi1;
        sayi1 = bosKova;

        System.out.println("Degistirilen degerler : sayi1 = " +sayi1+", sayi2= " +sayi2);

    }
}
