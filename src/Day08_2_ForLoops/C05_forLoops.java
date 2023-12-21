package Day08_2_ForLoops;

import java.util.Scanner;

public class C05_forLoops {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve
        // bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk OLSA DA PORGRAMI CALISTIRIN

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen başlangiç için pozitif bir tam sayi giriniz");
        int baslangic = scanner.nextInt();

        System.out.println("Lütfen bitiş için pozitif bir tam sayi giriniz");
        int bitis = scanner.nextInt();

        int toplam = 0;

        if (bitis>baslangic){
            for (int i = baslangic; i <=bitis ; i++) {

                toplam+=i;

            }
            
            
        }else {
            for (int i = bitis; i <=baslangic ; i++) {

                toplam+=i;


            }
            System.out.println( "verilen aralıktaki sayilarin toplami : " + toplam);
            
        }

    }
}
