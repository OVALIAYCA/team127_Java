package Day09_ForLoops_ve_MethodOlusturma;

import java.util.Scanner;

public class C02_FaktoriyelYazdirma {

    public static void main(String[] args) {

       // Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
       // bu sayinin faktoryel degerini hesaplayin.
       // Konsolda faktoryel hesabinin yapilisini da yazdirin.
       // Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720 bu kismi yazdirmak icin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20^den küçük bir pozitif tam sayi giriniz ");
        int sayi = scanner.nextInt();

        long fakSonuc = 1;

        System.out.print(sayi+"!=");

        for (int i = sayi; i >=1 ; i--) {

            fakSonuc *= i;
            if ( i !=1 ){
                System.out.print(i + " * ");
            }else {
                System.out.print(i + " = ");

            }

        }

        System.out.println(fakSonuc);

    }
}
