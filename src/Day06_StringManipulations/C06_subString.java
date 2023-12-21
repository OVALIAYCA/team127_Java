package Day06_StringManipulations;

public class C06_subString {

    public static void main(String[] args) {

        String str = "Java en güzel proglamlama dili";

        System.out.println(str.substring(5)); //en güzel proglamlama dili
        System.out.println(str.substring(0)); //Java en güzel proglamlama dili
        System.out.println(str.substring(1)); //ava en güzel proglamlama dili

        //son 4 karakteri yazdirin

        System.out.println(str.substring(str.length()-4)); // dili

        // metinden sadece Java kismini yazdirin

        System.out.println(str.substring(0,4)); // Java

        //0. indexten basla 4 karakter yazdir diye dusunulebilir
        // ya da 0. index (dahil) ile 4. index (hariç) arasi yazdir da diyebiliriz

        // cumledeki ikinci space 'in index'i 7 ise
        // 2. space'den sonraki 5 harfi yazdirin

        System.out.println(str.substring(8,13)); // güzel

        System.out.println(str.substring(0,1)); // J

        System.out.println(str.substring(3,4)); // a

        // 6. index'teki harfi String olarak kaydedin

        String index6dakiHarf = str.substring(6,7);
        System.out.println(index6dakiHarf); // n

        System.out.println("Baslangic ve bitis index i ayni olursa:" + str.substring(5,5)+"---"); //hiçlik yazdirir

       // System.out.println(str.substring(5,2)); hata verdi





    }
}
