package Day04_IfStatement;

import java.util.Scanner;

public class C07_IfElseIfStatements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen pozitif bir tam sayı giriniz");

        int sayi = scanner.nextInt();

        if (sayi % 3 ==0 && sayi % 5==0) {
            System.out.println("Süper Sayı");
        }else if(sayi % 5==0){
            System.out.println("Sayı 5'e bölünüyor");
        } else if (sayi % 3==0) {
            System.out.println("Süper sayı");
            
        }else {
            System.out.println("Çöpe at gitsin");
        }
    }
}
