package Day12_Scope;

import java.util.Scanner;

public class C01_WhileLoop {

    public static void main(String[] args) {

        //Kullanicidan toplanmak uzere tam sayilar isteyin
        //Toplam 500 oldugunda veya gectiginde islemi durdurup
        //kac sayi girildigini ve toplamlarini yazdirin


        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        int sayac = 0;

        //while parantezi içine nereye kadar devam edeceğini yazariz

        while (toplam < 500){

            System.out.println("Lutfen toplanmak uzere sayi giriniz");
            sayi = scanner.nextInt();

            sayac ++;
            toplam += sayi;
        }

        System.out.println(sayac + " adet sayi girdiniz ve toplamlari : " + toplam);
    }
}
