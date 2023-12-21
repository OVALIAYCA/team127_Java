package day02_DataCasting_Scanner;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdortgenin alanı : " + kenar1*kenar2) ;


    }
}
