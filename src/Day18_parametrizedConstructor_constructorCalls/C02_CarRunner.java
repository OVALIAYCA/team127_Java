package Day18_parametrizedConstructor_constructorCalls;

public class C02_CarRunner {

    public static void main(String[] args) {


        C01_Car car1 = new C01_Car();

        System.out.println("Car 1 : " + car1);
        //Car 1 :  Ozellikler
        //marka :'Marka atanmamış', model :'Model atanmamış', renk :'Renk atanmamış', yil :1900, fiyat :0

        car1.marka = "BMW";
        car1.model = "116";
        car1.yil = 2010 ;
        car1.fiyat = 7500 ;
        System.out.println("Car 1 : " + car1);
        //Car 1 :  Ozellikler
        //marka :'BMW', model :'116', renk :'Renk atanmamış', yil :2010, fiyat :7500



        //marka model ve değerlerini parametre olarak yollayabileceğimiz bir constructor oluşturalım.

        C01_Car car2 = new C01_Car("Nissan","Micra","Mavi");
        System.out.println("Car 2 : " + car2);
        //Car 2 :  Ozellikler
        //marka :'Nissan', model :'Micra', renk :'Mavi', yil :1900, fiyat :0

        C01_Car car3 = new C01_Car("Opel","Corsa","Beyaz");
        System.out.println("Car 3 : " + car3);
        //Car 3 :  Ozellikler
        //marka :'Opel', model :'Corsa', renk :'Beyaz', yil :1900, fiyat :0


        //MARKA, MODEL, RENK, FİYAT PARAMETRELERİ OLAN BİR CONSTRUCTOR OLUŞTURUN

        C01_Car car4 = new C01_Car("Toyota","Corolla","Beyaz",15000);
        System.out.println("Car 4 : " + car4);
        //Car 4 :  Ozellikler
        //marka :'Toyota', model :'Corolla', renk :'Beyaz', yil :1900, fiyat :15000
        //bu satırı çalıştırmak için constructor içinde this.marka şeklinde kullandık

    }
}
