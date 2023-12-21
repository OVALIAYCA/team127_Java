package Day18_parametrizedConstructor_constructorCalls;

public class Deneme {
    static int sayi=20;
    int yas=40;
    public Deneme () {
        sayi++; //21 // 22
        yas=10; //10 // 10
    }
    public static int method1 (){
        return 2*sayi; // 44
    }
    public static void main (String[] args) {
        Deneme obj1=new Deneme(); //sayı :21 yas :10
        Deneme obj2=new Deneme(); // sayı:22 yas :10
        int sonuc=obj2.method1(); //44
        System.out.println(obj2.yas +", "+obj2.sayi+", "+sonuc);
                               // 10         //22          //44

        //public class'ta static deger atansa da constructor içinde değişime uğrar.
    }
}
