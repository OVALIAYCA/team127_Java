package Day05_NestedIfElse_Ternary_Switch;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C05_Ternary {

    public static void main(String[] args) {

        //Kullanicidan bir pozitif tam sayi alin. sayinin cift veya tek oldugunu yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen pozitif bir tamsayi girin");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0 ){
            System.out.println("Sayi çift");
        }else {
            System.out.println("Sayi tek");
        }


        System.out.println(sayi % 2==0 ? "Sayi cift" : "Sayi tek");
    //sorunun ifelse ile cözümü ve ternary ile cözümü
    // basit if else sorularında kullanılır


    //Sayi 100 den buyukse sayiyi 2 katina çikarin
    //Sayi 100 den buyuk degilse degerini 10 artirin

        sayi = sayi>=100 ? sayi*2 : sayi +10 ;
        System.out.println(sayi);


    //Sayinin yeni hali 100 den buyukse "sayi zaten buyuk" yazdirin
    //Yeni hali 100 den buyuk degilse sayinin 2 katina cikarin.yazdirin demiyor.atama yapilmali
    //BU SORUYU TERNARY ILE COZEMEYIZ. SADECE YAZDIRMA VE SADECE ATAMA YAPILAN SORULARDA
    //TERNARY KULLANILABILIR. IKISI FARKLI ISLEM OLDUGUNDA KULLANILMAZ.

    //IFELSE ILE COZULUR.



    }
}
