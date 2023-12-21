package Day20_mutable_ImmutableClasses;

public class C02_StringPool {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";
        String str4 = new String("Java");
        String str5 = "Ja" + "va";
        String str6 = "Ja";
        String str7 = "va";
        String str8 = str6+str7;

        //equals() methodu sadece metne bakar
        // == ise hem metne hem referansa bakar.


        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // true
        System.out.println(str1 == str4); // false
        System.out.println(str1 == str5); // true
        System.out.println(str1 == str8); //fasle

        System.out.println(str1 == "Java"); // true

        /*
        Basit şekilde oluşturulan string objeler için
        java öncelikle string pool kontrol eder. eğer pool içinde aynı değere sahip
        başka bir string varsa yeni objeye ile eski objenin referansını ve değerini eşleştirir.
        == kullanımında havuzda olan ve değeri aynı olanlar true verir.
        havuzda olmayanların true verme ihtimali yoktur.
         */
    }
}
