package day03_WrapperClassesVeMatematikselIslemler;

import java.util.Scanner;

public class C03_SayininRakamlarToplaminiBulma {

    public static void main(String[] args) {

        //Kullanıcıdan 3 basamaklı pozitif bir tamsayı alıp
        // sayının rakamlar toplamını yazdırın.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz");

        int girilenSayi = scanner.nextInt();

        int rakamlarToplami = 0 ;

        int rakam = 0 ;

        rakam = girilenSayi % 10 ;
        rakamlarToplami = rakamlarToplami + rakam ;
        girilenSayi = girilenSayi / 10 ;

        // 257 sayısını düşünürsek bu aşamada girilen sayı = 25 oldu , rakam= 7 oldu
        // rakamlar toplamı = 7 oldu

        rakam = girilenSayi % 10 ;
        rakamlarToplami = rakamlarToplami + rakam ;
        girilenSayi = girilenSayi /10 ;

        // 25 üzerinden yaptı

        rakam = girilenSayi % 10 ;
        rakamlarToplami = rakamlarToplami + rakam ;
        girilenSayi = girilenSayi /10 ;

        // 2 kalmıştı onun için aynı işlemi yaptı.

        // 3 basamaklı sayı için 3 defa bu işlemi yaptı. önemli olan kaç basamaklı
        // girdiğini bilmediğimiz bir işlem için tekrar ettirme durumunu.
        // bu işlem için sayı 0 oluncaya kadar devam et dersek sonuna kadar işlemi
        // tekrarlar. Bu konu sonra işlenecek.

        System.out.println("Girilen sayinin rakamlari toplamı : " + rakamlarToplami);


    }
}
