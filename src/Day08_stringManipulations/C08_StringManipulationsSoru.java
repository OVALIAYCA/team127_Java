package Day08_stringManipulations;

import java.util.Scanner;

public class C08_StringManipulationsSoru {

    public static void main(String[] args) {

        //Soru 6 : Kullanicidan alinan bir String alin,
        // String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        // String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        int uzunluk = metin.length();
        String yeniHal = "";


        if (uzunluk % 2 == 0){
            yeniHal = metin.substring(0,uzunluk/2) + ":)" + metin.substring(uzunluk/2);

        }else {

            yeniHal = metin.substring(0,uzunluk/2) + ":(" + metin.substring((uzunluk+1)/2);
        }


        System.out.println(metin + " yazdiniz ve ben onu değiştirdim : " + yeniHal);
    }
}
