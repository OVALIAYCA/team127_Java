package Day11_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {

    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        int toplam = 0;
        int sayiAdedi = 0;

        System.out.println("Tam sayı girin (0 ile çıkış yapabilirsiniz):");
        int girilenSayi = klavye.nextInt();

        while (girilenSayi != 0) {
            toplam += girilenSayi;
            sayiAdedi++;

            System.out.println("Bir tam sayı daha girin (0 ile çıkış yapabilirsiniz):");
            girilenSayi = klavye.nextInt();
        }

        if (sayiAdedi != 0) {
            double ortalama = (double) toplam / sayiAdedi;
            System.out.println("Girilen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("Hiç sayı girilmedi.");
        }

    }
}
