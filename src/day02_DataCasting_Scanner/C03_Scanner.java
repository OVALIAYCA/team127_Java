package day02_DataCasting_Scanner;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //girilen bilgiler : J Doe, 44


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Isminizi Giriniz :");

        char ilkHarf = scanner.nextLine().charAt(0);

        //next ten sonra next line gelince sıkıntı oluyor o sebeple ikisini de nextline seçtik.

        System.out.println("Lutfen Soyisminizi Giriniz : ");

        String soyIsim = scanner.nextLine();

        System.out.println("Lutfen Yasinizi Giriniz : ");

        int yas = scanner.nextInt();

        System.out.println("Girilen bilgiler : " + ilkHarf + " " +soyIsim + ", " +yas);


    }
}

