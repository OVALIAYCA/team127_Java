package Day06_StringManipulations;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C03_equalsIgnoreCase {

    public static void main(String[] args) {

        // buyuk kucuk harfleri ignore ederek Stringlerde karsilastirma yapmak için.

        // Kullanicidan bir harf isteyin.
        // Kullanici a yazarsa "Aile"
        // i yazarsa "Is" yazdirin
        // Bu harflerin disinda bir karatker girerse
        // "Bu harfi bilmiyorum" yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz");
        char girilenHarf = scanner.next().charAt(0);

        //Kullanici buyuk ya da kucuk harf girmis olabilir
        // String'leri buyuk kucuk harf gozetmeksizin karsilastirabiliriz

        String harf = girilenHarf + "";

        if (harf.equals("a") || harf.equals("A")){

            System.out.println("Aile");
        } else if (harf.equalsIgnoreCase("i")) {

            System.out.println("Is");

        } else {

            System.out.println("Bu harfi bilmiyorum");
        }


    }
}
