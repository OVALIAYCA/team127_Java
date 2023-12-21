package Day07_StringManipulations;

public class C04_LastIndexOf {

    public static void main(String[] args) {

        String str = "Java candir, Selenium heyecan";

        //str a ile mi baslar?
        System.out.println(str.startsWith("a")); // false

        //a'nin ilk kullanildigi index'i yazdirin
        System.out.println(str.indexOf("a")); // 1

        // str a ile mi biter
        System.out.println(str.endsWith("a")); // false

        // a'nin son kullaniminin index'ini yazdirin
        System.out.println(str.lastIndexOf("a")); // 27

        // can kelimesinin ilk indexini bulun
        System.out.println(str.indexOf("can")); // 5

        // can kelimesinin son kullaniminin indexini yazdirin
        System.out.println(str.lastIndexOf("can")); // 26

        // blok olarak baktigi için basladigi index'i söyler


        // seleinum kelimesinin ilk kullanim ve son kullanim index'ini yazdirin
        System.out.println(str.indexOf("Selenium"));
        System.out.println(str.lastIndexOf("Selenium"));
        //1 tane selenium kullanildigi için 1 tane verdi

        // can kelimesinin ilk kullanim ve son kullanim indexini yazdirin
        System.out.println(str.indexOf("can")); // 5
        System.out.println(str.lastIndexOf("can")); // 26



    }
}
