package day02_DataCasting_Scanner;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        String girilenIsim = scanner.nextLine();

        System.out.println("Girdiginiz isim : " + girilenIsim);

        //nextline secerek 1 yada 2 yada 3 isim secilebilir. next... seçilirse
        // sadece 1 isim olarak girilir. ilk space e kadar giriş yapılabilir.

        // ikinci deger olarak yas isteyelim.scanner tekrar olusturmaya gerek yok

        System.out.println("Lutfen yasinizi giriniz");

        int yas = scanner.nextInt();

        System.out.println("Yasiniz : " + yas);


        // emekli misiniz diye 3. secenek al

        System.out.println("Emekli misiniz? True veya False olarak giriniz");

        boolean emekliMi = scanner.nextBoolean();

        System.out.println("Emekli misiniz? : " + emekliMi );


    }
}
