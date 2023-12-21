package Day07_StringManipulations;

public class C02_IndexOf {

    public static void main(String[] args) {

        String str = "Java candir, Selenium heyecan.";

        //str Selenium içeriyor mu ?
        System.out.println(str.contains("Selenium")); //true

        // str Selenium ile mi bitiyor?
        System.out.println(str.endsWith("Selenium")); // false

        // str Selenium ile mi başlıyor?
        System.out.println(str.startsWith("Selenium")); //false

        // Selenium'un yerini soyle dersek
        System.out.println(str.indexOf("Selenium")); // 13
        //13.karakterden sonra geliyor.

        //olmayan bir metin ararsak
        System.out.println(str.indexOf("Ayca")); // -1 olarak olmadigini soyluyor
        System.out.println(str.indexOf("x")); //-1
        System.out.println(str.indexOf("a")); // 1 yazar.İlk kullanim yerini verir

        //contains() methodu kullanmadan str'in java icerip icermedigini
        //yazdirin

        System.out.println(str.indexOf("java")); // -1 oldu cunku kucuk j ile yazdik
        if (str.indexOf("java") == -1){
            System.out.println("false");
        }else {
            System.out.println("true");
        } // false yazdirir

        // str'daki ilk a harfinin indexini yazdirin
        System.out.println(str.indexOf("a"));

        // str'daki 2. a harfinin indexini yazdirin
        //System.out.println(str.indexOf("a", 1)); // 1
        // cunku ilk indexi dahil ederek arama yapmaya baslar, o yüzden 1 den degil 2 den baslamamiz gerekir
        System.out.println(str.indexOf("a", 2)); // 3 verir dogru cevaptir


        //str daki 3. a harfinin indexini yazdirin
        System.out.println(str.indexOf("a", 4)); // 6

        //str da 4. a varsa index'ini yazdirin, yoksa 'str sadece 3 tane a içeriyor' yazdirin

        if (str.indexOf("a",7)== -1){
            System.out.println("str sadece 3 tane a var");
        }else {
            System.out.println("4. a'nin index!i : " + str.indexOf("a",7)); //27
        }

        // str da 5. a varsa indexini yazdirin
        // yoksa sadece 4 tane a içeriyor yazdirin

        System.out.println(str.indexOf("a", 28)); // -1 döndürüyor yani 5. a yok!
        if (str.indexOf("a",28)== -1){
            System.out.println("Str sadece 4 tane a içeriyor");
        }else {
            System.out.println("5. a'nin index'i : " + str.indexOf("a",28));

            //str sadece 4 tane a içeriyor şeklinde yazdirir
        }


    }
}
