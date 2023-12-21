package Day08_2_ForLoops;

import java.util.Scanner;

public class C03_ForLoops {

    public static void main(String[] args) {

        //kullanicidan pozitif bir tamsayi degeri isteyin
        //o sayiya kadar olan tüm pozitif tam sayilarin toplamini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayi giriniz");
        int sayi = scanner.nextInt();
        int toplam = 0;

        for (int i = 1; i <= sayi ; i++) {

            toplam += i;


        }

        System.out.println(sayi + " 'ye kadar olan tam sayilarin toplami : " + toplam);

        // yazdirma işlemi sout kismini loop içine yaparsak her seferinde yazdirma yapar
    }
}
