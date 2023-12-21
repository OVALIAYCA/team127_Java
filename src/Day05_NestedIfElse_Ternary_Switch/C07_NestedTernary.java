package Day05_NestedIfElse_Ternary_Switch;

import java.util.Scanner;

public class C07_NestedTernary {

    public static void main(String[] args) {

        //kullanicidan bir tam sayi alin
        //sayi pozitifse 100'den buyuk veya kucuk oldugunu yazdirin
        //sayi negatifse tek veya cift oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        System.out.println(
                sayi>0
                ?
           //sayi 0'dan buyukse yazdirilicak kisim
           sayi >100 ? "Sayi buyuk" : "Sayi kucuk"
                :
           //sayi negatifse
           sayi %2 == 0 ? "Sayi cift" : "Sayi tek"


        );
    }
}
