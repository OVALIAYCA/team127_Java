package Day05_NestedIfElse_Ternary_Switch;

import java.util.Scanner;

public class C08_TernarySoru {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz");

        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        System.out.println( sayi1 > sayi2 ? sayi2 : sayi1);

        //buyuk olmayan demekle kucuktur demek farklidir.
        //9-9 verdildiginde buyuk olmayan 9 denir
        //9-9 verildiginde kucuk olan denirse - hicbiri
        //nested yapmak gerekirdi


    }
}
