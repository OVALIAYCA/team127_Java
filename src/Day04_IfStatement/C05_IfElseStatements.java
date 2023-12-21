package Day04_IfStatement;

import java.util.Scanner;

public class C05_IfElseStatements {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir karakter giriniz");

        char karakter = scanner.next().charAt(0);

        if(karakter>= 'A' && karakter<= 'Z'){
            System.out.println("Girilen karakter büyük harf");

        } else {
            System.out.println("Girilen karakter büyük harf değildir");
        }







    }
}
