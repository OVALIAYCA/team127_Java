package day01_javaGiris;

public class C03_VariableOlusturma {

    public static void main(String[] args) {

        int sayi = 20;

        System.out.println(sayi);  // 20 yazdirir
        System.out.println("Sayi"); // Sayi olarak yazdirir

        int sayi2 = 10;

        System.out.println(sayi2);  //10 yazdirir

        // ya  da

        int sayi2a;
        sayi2a = 10;
        System.out.println(sayi2a); //seklinde de atama yapilabilir.
        // bu da 10 yazdirir.


        int a = 10;

        a = a+20;  // önce deger hesaplanir.a+20 için 10+20 yapar. yeni deger
        // olan 30 degerini a'ya atama yapar.

        a = 2 * a +1 ; //a'nin yeni degeri 61 olur
        //Esitligin solunda daima variable olur.


        System.out.println(a); //konsolda son atama degerini (61) yazdirdi.

        float sayiFl = 3.4f;

        System.out.println(sayiFl); //yanina büyük ya da küçük f yazilmali.

        float sayi3 = 20f;
        float sayi4 = 6f;

        System.out.println(sayi3/sayi4); // 3.3333333

        double sayi5 = 20;
        double sayi6 = 3;

        System.out.println(sayi5/sayi6); //6.666666666666667


    }
}
