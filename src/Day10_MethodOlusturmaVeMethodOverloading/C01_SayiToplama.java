package Day10_MethodOlusturmaVeMethodOverloading;

public class C01_SayiToplama {

    public static void main(String[] args) {

        //verilen iki sayiyi toplayip, sonucu yazdiran bir method olusturun

        toplaYazdir(5,6.4);

    }

    public static void toplaYazdir(double sayi1,double sayi2){

        System.out.println("Verilen iki sayinin toplami : " +(sayi1+sayi2));

    }


}
