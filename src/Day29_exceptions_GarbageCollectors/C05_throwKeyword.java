package Day29_exceptions_GarbageCollectors;

import Day13_Arrays.Soru;

import java.util.Scanner;

public class C05_throwKeyword {

    public static void main(String[] args) {

        int sayi = -5;
        //sayi negatifse ilk üç satır çalışmasın

        try {
            if (sayi<0) throw new RuntimeException("sayi sifirdan küçük");
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(4);
        System.out.println(5);

        //kullanıcıdan yaşını isteyin
        //yaşını negatif girerse exception firlatin
        //ve hiçbir işlem yapmayın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");

        int yas = scanner.nextInt();
        try {
            if (yas<0){
                throw new IllegalArgumentException("Yas negatif olamaz");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace(); //IllegalArgumentException çalışmayı durdurmadan böyle bir mesaj veriyor.
        }

    }


}
