package Day05_NestedIfElse_Ternary_Switch;

import java.util.Scanner;

public class C03_NestedIfElse {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan aldigi urun adedi ve ürün fiyatini alin,
//        kullaniciya musteri karti olup olmadigini sorun.
//        Musteri karti varsa
//              10 urun veya fazla alirsa %20,
//              10 urunden az alirsa %15 indirim yapin,
//        Musteri karti yoksa
//              10 urun veya fazla alirsa %15,
//              10 urunden az %10 indirim yapin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen aldığınız ürün adedini giriniz");
        int urunAdedi = scanner.nextInt();
        System.out.println("Lütfen ürün fiyatını giriniz");
        double urunFiyati = scanner.nextDouble();

        System.out.println("Müşteri kartınız var mı? \nE: Evet H: Hayır");
        char kartVarMi=scanner.next().toUpperCase().charAt(0);

        //kartın olup olmaması ana değşken seçelim

        if (kartVarMi == 'E'){

            if (urunAdedi>=10){

                System.out.println("%20 indirimli toplam fiyat : " +(urunAdedi*urunFiyati)*80 / 100);
            } else {

                System.out.println("%15 indirimli toplam fiyat : " +(urunAdedi*urunFiyati)*85 / 100);
            }

        } else if (kartVarMi == 'H') {

            if (urunAdedi>=10){

                System.out.println("%15 indirimli toplam fiyat : " +(urunAdedi*urunFiyati)*85 / 100);
            } else {

                System.out.println("%10 indirimli toplam fiyat : " +(urunAdedi*urunFiyati)*90 / 100);
            }

        }else {
            System.out.println("Kart bilgisini doğru giriniz");
        }


    }
}
