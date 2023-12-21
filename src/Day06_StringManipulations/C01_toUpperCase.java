package Day06_StringManipulations;

public class C01_toUpperCase {

    public static void main(String[] args) {

        String str = "Java Candır";

        System.out.println(str.toUpperCase()); //JAVA CANDIR

        // sadece hepsini büyük yazdırır. stringi kalıcı olarak değiştirmez.

        System.out.println(str); // Java Candır

        // Degisikligin kalici olmasini isterseniz String'de atama yapilmalidir.

        str = str.toUpperCase();

        System.out.println(str); // JAVA CANDIR


        System.out.println(str.toLowerCase()); // java candır

        // hepsini küçük yazdirdi. Str hala buyuk sekilde JAVA CANDIR.








    }
}
