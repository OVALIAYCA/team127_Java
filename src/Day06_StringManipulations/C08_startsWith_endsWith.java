package Day06_StringManipulations;

public class C08_startsWith_endsWith {

    public static void main(String[] args) {

        String str = "Java candir.";

        System.out.println(str.contains("a")); // true

        // metnin içinde bir yerde a var mı diye kontrol eder.



        System.out.println(str.startsWith("a")); // false

        //a ile başlamıyor


        System.out.println(str.endsWith("a")); //false

        // a ile bitmiyor.


        System.out.println(str.startsWith("Java candir.")); // true

        System.out.println(str.endsWith("Java candir.")); // true

        System.out.println(str.endsWith("candir")); // false

        // . ile bittigi için false yazdirir


        System.out.println(str.startsWith("")); // true
        System.out.println(str.endsWith("")); // true

        System.out.println(str.startsWith("java")); // false

        // büyük j ile başladığı için false yazdırır


    }
}
