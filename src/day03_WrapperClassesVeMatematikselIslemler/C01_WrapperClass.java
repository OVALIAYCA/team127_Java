package day03_WrapperClassesVeMatematikselIslemler;

public class C01_WrapperClass {

    public static void main(String[] args) {

        int sayi = 20;

        String str = "Java";

        Integer sayi2=30;
        //Büyük harfle başladığında sayi2. yazılınca yanında hazır metodlar çıkar.
        //Primitive kullanmak istiyorsak ve hazır metodlara ihtiyacımız varsa bunu kullanırız.

        System.out.println(Integer.MIN_VALUE);

        String str1 = "34";
        String str2 = "45";

        // str1 ve str2'nin degerlerini matematiksel olarak toplayınız.

        System.out.println(str1+str2);  //3445

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); //79




    }
}
