package Day16_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_Array_Soru2_KullaniciyaListeOlusturtma {

    public static void main(String[] args) {

       // Soru 2- Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize
       // liste olarak dondurecek bir method olusturun.

        System.out.println(listeOlustur());


    }

    public static List<String> listeOlustur(){

        List<String> isimler = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String girilenIsim;
        //değer vermeye de gerek yok çünkü do-whileLoop sayesinde
        //kullanıcıdan bir kere alacağız

        do {
            System.out.println("Listeye eklemek için bir isim yazın," +
                    "\nİşlemi sonlandırmak için Q'ya basın");
            girilenIsim = scanner.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")){

                isimler.add(girilenIsim);
            }
        }
        while (!girilenIsim.equalsIgnoreCase("Q"));

        return isimler;

    }
}
