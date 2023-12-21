package Day06_StringManipulations;

public class C02_equals {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";
        String str4 = new String("Java");
        String str5 = "Ja" + "va";
        String str6 = "Ja";
        String str7 = "va";
        String str8 = str6+str7;

        //equals methodu String'lerin case sensitive olarak esitligini kontrol eder.

        System.out.println(str1.equals(str2)); // false sonucunu yazdirdi
        System.out.println(str1.equals(str3)); // true sonucunu yazdirdi
        System.out.println(str1.equals(str5)); // true sonucunu yazdirdi
        // Simdilik stringleri karsilastirmak için == kullanilmaz, equals() kullanilir.


    }
}
