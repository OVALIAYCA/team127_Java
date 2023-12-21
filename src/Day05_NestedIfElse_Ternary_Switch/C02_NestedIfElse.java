package Day05_NestedIfElse_Ternary_Switch;

import java.util.Scanner;

public class C02_NestedIfElse {

    public static void main(String[] args) {


        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
        // “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        //birden fazla değişken varsa önce değişkenlerden birini ana değişken seçelim
        // ana yapıyı ona göre oluşturalım


        //önce cinsiyete göre bir yapı oluşturalım

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz E: Erkek K: Kadın");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        //touppercase ile kullanıcı nasıl girerse girsin büyük harf alınacak

        System.out.println("Lütfen yaşınızı giriniz");
        double yas = scanner.nextDouble();

        if ( cinsiyet == 'E'){ // sadece erkekler
            if (yas<20 || yas>80){
                System.out.println("Yaş girişi hatalı");
            }else if (yas>=65){
                System.out.println("Erkek emekli olabilir");
            }else {
                System.out.println("Erkek emekli olmak için daha " + (65-yas) + "yıl çalışması gerekir");
            }
        } else if ( cinsiyet == 'K') {
            if (yas<20 || yas>80){
                System.out.println("Yaş girişi hatalı");
            }else if (yas>=65){
                System.out.println("Kadın emekli olabilir");
            } else System.out.println("Kadın emekli olmak için daha " + (60-yas) + "yıl çalışması gerekir");

        } else {

            System.out.println("Cinsiyet için girilen bilgiler yanlış");
        }

    }
}
