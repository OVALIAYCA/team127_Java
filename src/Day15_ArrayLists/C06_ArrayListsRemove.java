package Day15_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_ArrayListsRemove {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");

        System.out.println(isimler);

        //remove(silinecekObject) olarak seçip çalıştırınca silinecek obje varsa siler
        //bize true döndürür
        //yoksa false döndürür liste değişmez

        System.out.println(isimler.remove("Esra"));
        //boolean ile sadece true ya da false döndürür

        System.out.println(isimler);
        //[Deniz, Omer, Hamza, Basak] tekrar yazdirdigimizda esra yi silip getirir

        //listede olmayan bir şeyi istersek
        System.out.println(isimler.remove("Ercan"));
        //false döndürür

        System.out.println(isimler);
        //[Deniz, Omer, Hamza, Basak] listeyi aynen yazdirdi

        isimler.remove("Omer");
        System.out.println(isimler); // [Deniz, Hamza, Basak]

        System.out.println("=========");

        //remove silinecek obje değil de silinecek index olursa

        System.out.println(isimler.remove(0));
        // deniz indexinin silineceğini yazdirir

        System.out.println(isimler);
        //[Hamza, Basak] 0. indexteki denizi sildi yeni list i yazdirdi

        //System.out.println(isimler.remove(5));
        //olmayan index i silmeye çalışırsa hata verir

        isimler.add("Ibrahim");
        isimler.add("Fırat");
        isimler.add("Beliz");
        System.out.println(isimler);
        //[Hamza, Basak, Ibrahim, Fırat, Beliz]

        List<String> silinecekler = new ArrayList<>();

        silinecekler.add("Basak");
        silinecekler.add("Hamza");
        silinecekler.add("Ibrahim");

        System.out.println(silinecekler); //[Basak, Hamza, Ibrahim]

        System.out.println(isimler.removeAll(silinecekler)); // true döndürür

        System.out.println(isimler); //[Fırat, Beliz] kalanlar

        List<String> silinecekler2 = new ArrayList<>();
        silinecekler2.add("Gulnur");
        silinecekler2.add("Beliz");
        System.out.println(silinecekler2);

        System.out.println(isimler.removeAll(silinecekler2)); // true
        System.out.println(isimler); // [Fırat] kalan




    }
}
