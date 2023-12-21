package SonGunSorular;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class C08_OrtalamaUstundekiOgrenciSayisi {

    public static void main(String[] args) {

        //Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.

        //önce öğretmenden girmek istediği kadar not alalım
        //notları bir listeye koyalım
        //bir yandan da notları toplayalım
        //bitti demesi için Q'a bassın.

        Scanner scanner = new Scanner(System.in);
        List<Double> notlarListesi = new ArrayList<>();

        double notToplami = 0;
        double ortalamaNot;
        int ortalamaUstundekiOgrenciSayisi = 0;
        double not;
        boolean devamEdeyimMi = true;


        do
        {
            System.out.println("Lütfen öğrenci notu giriniz. Bitirmek için Q'ya basınız");
            try {    //Qya basınca exception oluşacak. onu yakalamamız lazım.
                not = scanner.nextDouble();

                if (not<0 || not>100){
                    throw new IllegalArgumentException();
                }
                notlarListesi.add(not);
                notToplami += not;
            } catch (InputMismatchException e) {
                String hocaMetin = scanner.nextLine();
                if (hocaMetin.equalsIgnoreCase("q")){
                    devamEdeyimMi = false;
                }else {
                    System.out.println("Hatalı giriş yaptınız.");
                }
            }catch (IllegalArgumentException e){
                System.out.println("Not geçersiz");
            }
        }
        while (devamEdeyimMi);


        //ortalamayı bulalım.

        ortalamaNot = notToplami/notlarListesi.size();

        //ortalama üstündeki öğrenci sayısını bulup yazdıralım

        for (Double each:
             notlarListesi) {

            if (each>=ortalamaNot){
                ortalamaUstundekiOgrenciSayisi++;
            }

        }

        System.out.println("Not girilen öğrenci sayısı : " + notlarListesi.size());
        System.out.println("Not ortalaması : " + ortalamaNot);
        System.out.println("Ortalama üstündeki öğrenci sayısı : " + ortalamaUstundekiOgrenciSayisi);
    }
}
