package Day06_StringManipulations;

public class C05_length {

    public static void main(String[] args) {

        String str = "Java öğrenen işsiz kalmaz.";

        System.out.println(str.length());

        System.out.println(str.charAt(26-2));

        // dinamik olmali

        System.out.println(str.charAt(str.length()-2));

        // ayni islemi verdi, metin uzunlugu degisse de kod calisir

       // metnin son karakterini yazdirin

        System.out.println(str.charAt(str.length()-1));

        // son karakter daima lenght'in 1 eksigi olur.

        // metni degistirsek de kod calisir.




    }
}
