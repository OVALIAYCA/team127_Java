package day02_DataCasting_Scanner;

public class C06_ExplicitlyNarrowing {

    public static void main(String[] args) {

        int sayi = 20;

        byte byt = (byte) sayi;

        System.out.println("20'nin byte olarak karsiligi : " + byt);

        //byte sınırlarının içinde olduğu için 20 yazdırdı.

        sayi = 130;

        byt = (byte) sayi;

        System.out.println("130'un byte olarak karsiligi : " + byt);

        // -126 yazdırdı.

        sayi = 257;

        byt = (byte) sayi;

        System.out.println("257'nin byte olarak karsiligi : " + byt);

        sayi = 567;

        byt = (byte) sayi;

        System.out.println("567'nin byte olarak karsiligi : " + byt);

        sayi = -415;

        byt = (byte) sayi;

        System.out.println("-415'in byte olarak karsiligi : " + byt);

        double dbl = 34.7;
        sayi = (int) dbl;

        System.out.println("34.7'nin byte olarak karsiligi : " + sayi);

        // 34 olarak yazdırdı. ondalık kısmı attı direk olarak.


        //String str = (String) sayi; // bu sekilde olmaz..

        // Sayısal Primitive data türlerinde geniş değeri dar kapsamlı variable'a atamak için
        //kullanıyoruz..Non-primitive data türlerinde de olur ancak paretn-child class lar
        //arasında geçerlidir. ilerleyen konularda görülecek..




    }
}
