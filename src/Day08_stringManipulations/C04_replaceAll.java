package Day08_stringManipulations;

import java.util.Scanner;

public class C04_replaceAll {

    public static void main(String[] args) {

        //kullanicidan isim, soyisim ve kart numarasını alın
        // asagidaki sekilde yazdirin
        //Isim Soyisim : S***** G****
        //Kart No : 1234 **** **** ****

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = scanner.next();

        System.out.println("Lutfen Soyisminizi giriniz");
        String soyisim = scanner.next();


        System.out.println("lütfen kart numanarinizi giriniz");
        String kartNo = scanner.next();

        String yildizliIsim = isim.substring(0,1).toUpperCase() +
                isim.substring(1).replaceAll("\\w","*");

        String yildizliSoyisim = soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\w","*");

        String yildizliKartNo = kartNo.substring(0,4)+ " **** **** ****";

        System.out.println("Isim soyisim : " + yildizliIsim + " " + yildizliSoyisim);
        System.out.println("Kart No : " + yildizliKartNo);




    }
}
