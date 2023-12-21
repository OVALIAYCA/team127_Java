package Day06_StringManipulations;

public class C04_charAt {

    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor.";

        //Ilk harfi yazdirin

        System.out.println(str.charAt(0));

        System.out.println(str.charAt(31-1)); // son karakter icin

        System.out.println(str.charAt(31-5)); // sondan 5. karakter

        System.out.println(str.charAt(5)); // gun'un g'si

       // System.out.println(str.charAt(44)); // olmayan karakter oldugu için calisinca hata verir


    }
}
