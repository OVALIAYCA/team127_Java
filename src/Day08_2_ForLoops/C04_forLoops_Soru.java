package Day08_2_ForLoops;

import java.util.Scanner;

public class C04_forLoops_Soru {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve
        // bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen başlangiç için pozitif bir tam sayi giriniz");
        int baslangic = scanner.nextInt();

        System.out.println("Lütfen bitiş için pozitif bir tam sayi giriniz");
        int bitis = scanner.nextInt();

        int toplam = 0;


        if (bitis< baslangic) {
            System.out.println("Bitiş degeri baslangic degerinden buyuk olmalidir");
        }else {
            for (int i = baslangic; i <= bitis; i++) {

                toplam += i ;


            }
            System.out.println("girilen araliktaki sayilarin toplami :  " + toplam);
        }






    }
}
