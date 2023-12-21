package day02_DataCasting_Scanner;

import java.util.Scanner;

public class C07_AsciiTable {

    public static void main(String[] args) {

        char chr1 = 'a';
        char chr2 = 'b';

        System.out.println(chr1 + chr2); //195 yazdırdı. a ve b nin ascii değerlerini topladı.

        int sayı1 = chr1;

        System.out.println(sayı1); // a'nın ascii değeri 97. 97 yazdırdı.



        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Ascii table dan bir karakter giriniz");

        char krk = scanner.next().charAt(0);

        System.out.println("girilen karakterden 1 sonraki karakter : "+(char)(krk + 1));
        System.out.println("girilen karakterden 2 sonraki karakter : "+(char)(krk + 2));
        System.out.println("girilen karakterden 3 sonraki karakter : "+(char)(krk + 3));

        //matematiksel karşılığı değil de char olarak karşılığını görmek için char castingi yapılmalıdır.



    }
}
