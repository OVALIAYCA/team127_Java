package Day04_IfStatement;

import java.util.Scanner;

public class C09_IfElseIfStatements {

    public static void main(String[] args) {

       // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse obez, 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal, 20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu kg olarak giriniz");
        double kilo = scanner.nextDouble();
        System.out.println("Lütfen boyunuzu cm olarak giriniz");
        double boy = scanner.nextDouble();

        double vke = (kilo*10000 / (boy * boy));

        if(kilo<20 || kilo>200 || boy < 30 || boy>200 || vke<10 || vke>50 ){
            System.out.println("Lütfen değerleri kontrol ediniz");
        }else if(vke > 30 ){
            System.out.println("Vücut Kitle Endeksi : " +vke + " Sonuc : Obez");
        }else if (vke > 25){
            System.out.println("Vücut Kitle Endeksi : " +vke + " Sonuc : Kilolu");
        }else if(vke > 20){
            System.out.println("Vücut Kitle Endeksi : " +vke + " Sonuc : Kilonuz normal sınırlar içinde");
        }else {
            System.out.println("Zayıfsınız");
        }


    }
}
