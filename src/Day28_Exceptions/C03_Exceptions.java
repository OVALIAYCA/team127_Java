package Day28_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {

    public static void main(String[] args) {

        /*
        Kullanıcıdan iki tam sayı alın
        ilk sayıyı ikinciye bölüp yazdırın
         */

        Scanner scanner = new Scanner(System.in);

        /*
        try {
            try {
            System.out.println("Lütfen iki tamsayı giriniz");
            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();
            System.out.println("Sayıların bölümü = " + (sayi1/sayi2));

        }
            catch (ArithmeticException e){
            System.out.println("İkinci sayı 0 olamaz");
        }

        }catch (InputMismatchException f){
            System.out.println("Tamsayı girmelisiniz");
        }
        */


        /*
        try {
            System.out.println("Lütfen iki tamsayı giriniz");
            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();
            System.out.println("Sayıların bölümü = " + (sayi1/sayi2));
        }catch (ArithmeticException e){
            System.out.println("İkinci sayı 0 olamaz");
        }catch (InputMismatchException f){
            System.out.println("Tamsayı girmelisiniz");
        }
        */

        System.out.println("Lütfen iki tamsayı giriniz");
        try {
            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();
            System.out.println("Sayıların bölümü = " + (sayi1/sayi2));
        } catch (Exception e) {
            System.out.println("Yanlış giriş yaptınız");
            e.printStackTrace();
        }


        //elimizde riskli iki durum var.
        //1- sayı2 nin 0 olması
        //2- uygun olmayan bir input girilmesi
    }
}
