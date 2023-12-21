package Day27_abstractClasses_Interfaces;

public interface I08_Interface {

    /*
   1- Interface'ler full abstraction sağlar
   2- Full abstrac sağladığı için yazsak da yazmasak da
    tüm method'lar PUBLIC ve ABSTRACT'tır.
   3-Interface de oluşturulan her variable yazsak da yazmasak da
   PUBLIC, STATIC VE FINAL ' dır.
     */

    public final static int sayi1 = 20;
    final int sayi2 = 10; //değer atamadan kabul etmezdi
    static String isim = "Ali Can";



    public void method1();
    public abstract void method2 ();
    abstract int method3 ();
    String method4 ();
    int method5 ();

    public static void main(String[] args) {

        // sayi1=30;  sayiya sonradan değer atayamadık
        //çünkü final olarak sayı oluşturduk, sonradan final a değer atanmaz.
    }

}
