package Day28_Exceptions;

import java.util.Scanner;

public class C02_Exceptions {

    public static void main(String[] args) {

        /*
        Kullanıcıdan iki tam sayı alın
        ilk sayıyı ikinciye bölüp yazdırın
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki tamsayı giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        if(sayi2 != 0){
        System.out.println("Sayıların bölümü = " + (sayi1/sayi2));
        }else {
            System.out.println("İkinci sayı 0 olamaz");
        }
    }
}
