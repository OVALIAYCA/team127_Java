package Day09_ForLoops_ve_MethodOlusturma;

import java.util.Scanner;

public class C05_StringTerseCevirme {

    public static void main(String[] args) {

        //Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen terse çevirmek için bir metin yazınız");

        String metin = scanner.nextLine();

        String tersMetin = "";

        for (int i = metin.length()-1 ; i >= 0 ; i--) {

            tersMetin += metin.charAt(i);
            
        }

        System.out.println("girilen metnin ters hali : "+ tersMetin);

        // tersi ile düzden yazilisi ayni olan metinlere PALINDROME denir
        // girilen metnin palindrome olup olmadigini yazdiralim

        if (metin.equalsIgnoreCase(tersMetin)){

            System.out.println("Girilen metin palindrome");

        }else {

            System.out.println("Girilen metin palindrome değil");
        }


    }
}
