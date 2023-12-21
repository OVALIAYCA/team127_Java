package Day09_ForLoops_ve_MethodOlusturma;

import java.util.Scanner;

public class C04_RakamlarToplami {

    public static void main(String[] args) {

        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilenSayi = scanner.nextInt();
        int rakamToplam = 0;
        int rakam = 0;



        for (int i = girilenSayi ; i > 0 ; i/=10) {

           rakam = i % 10 ;
           rakamToplam += rakam;

        }
        System.out.println(girilenSayi + " sayisinin rakamlar toplami : " + rakamToplam);

        //aynı soruyu basamak sayisi kadar tekrar ederek cözelim

        rakamToplam = 0;
        rakam = 0;
        int basamakSayisi = (girilenSayi+ "").length(); //girilen sayiyi string e çevirdik basamak sayisini bulmak icin
        int sayi = girilenSayi;

        for (int i = 1; i <= basamakSayisi ; i++) {

            rakam = sayi % 10;
            rakamToplam += rakam;
            sayi /= 10;

        }
        System.out.println(girilenSayi + " sayisinin rakamlar toplami : " + rakamToplam);


    }
}
