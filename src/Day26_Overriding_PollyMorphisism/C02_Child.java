package Day26_Overriding_PollyMorphisism;

public class C02_Child extends C01_Parent{

    //Bir methodun overriding yapması için
    //parent class'daki method ile
    //aynı SIGNATURE'a sahip olmalıdır

    @Override
    public void method1(String str) {

        //Overriding methodu Intellij'e oluşturtulunca
        //otomatik olarak @Override notasyonu ekliyor
        //Bu notasyonu kullanmak zorunlu değildir
        //Kullanılmışsa parent class daki class silinir ya da
        //signature değiştirilirse buradaki method da sinyal verir
        //değiştiremezsin diye.!!

    }

    public void method2 (){
       super.method2();
       // herheangi bir obje için ya overriding method
       //veya overridden method çalışır.
        //Eğer ikisinin de çalışmasını isterseniz
        //o zaman overriding methodun içine super.method..
        //  (overridden method) yazabilirsiniz.

    }

    //public void method3 (){    } parent ta olan method override edilemedi
    //final keyword kullanıldığı için.
    //final method değiştirilemez.

    public static void method4 (){
    //Static methodları çağırmak için obje kullanılmaz
    // override obje temelli olduğu için static method lar
    //override edilemezler.
    }
    public void method5 (){
        //private method u child class göremez
        //o yüzden override da edemez.
        //child class ta olan method5 bağımsız bir method olur.

    }

}
