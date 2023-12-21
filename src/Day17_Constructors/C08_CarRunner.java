package Day17_Constructors;

public class C08_CarRunner {

    public static void main(String[] args) {

        C07_Car car1 = new C07_Car();

        System.out.println(car1.marka); //Marka atanmamış
        System.out.println(car1.model); //Model atanmamış

        //System.out.println(car1); //Day17_Constructors.C07_Car@35bbe5e8 referans yazdirdi

        //Eğer bir class'dan obje oluşturduğumuzda objenin tüm özelliklerini tek bir sout
        //ile yazdırmak istersek o class'a toString methodu oluşturulmalıdır

        //System.out.println(car1.toString()); //Day17_Constructors.C07_Car@35bbe5e8
        //class içine oluşturulmadan toString çalışmaz.

        System.out.println("Car 1 : " + car1);
        //C07_Car{marka='Marka atanmamış', model='Model atanmamış', renk='Renk atanmamış', yil=1900, fiyat=0}
        //C07 Class'ından Code kısmından Generate diyerek toString methodu
        //oluşturduk ve orada görsel değişiklikleri yaptık ve sonuçta şu şekilde yazdırdı.

        //C07_Car Ozellikler
        //marka :'Marka atanmamış', model :'Model atanmamış', renk :'Renk atanmamış', yil :1900, fiyat :0


        C07_Car car2 = new C07_Car();
        System.out.println("Car 2 : " + car2);
        //C07_Car Ozellikler
        //marka :'Marka atanmamış', model :'Model atanmamış', renk :'Renk atanmamış', yil :1900, fiyat :0

        car2.marka = "Toyota";
        car2.model = "Corolla";
        car2.renk = "Kırmızı";
        car2.yil = 2015 ;
        car2.fiyat = 10000;

        System.out.println(car2);
        //C07_Car Ozellikler
        //marka :'Toyota', model :'Corolla', renk :'Kırmızı', yil :2015, fiyat :10000

        //değer atadık ve atadığımız değerler ile gördük

        C07_Car car3 = new C07_Car();
        System.out.println("Car 3 : " + car3);
        //C07_Car Ozellikler
        //marka :'Marka atanmamış', model :'Model atanmamış', renk :'Renk atanmamış', yil :1900, fiyat :0

        //ATAMA YAPALIM

        car3.marka = "Mercedes";
        car3.model = "E200";
        car3.renk = "Siyah";
        car3.yil = 2010 ;
        car3.fiyat = 15000;

        System.out.println(car3);
        //C07_Car Ozellikler
        //marka :'Mercedes', model :'E200', renk :'Siyah', yil :2010, fiyat :15000

        //eğer atamayı her seferinde tek tek yapmak istemiyorsak
        // (Constructor çalışmak zorunda yoksa obje oluşturulmaz)
        //atama işlemini constructor da yapabiliriz

        C07_Car car4 = new C07_Car("Porsche","Carrera");
        //System.out.println(car4);
        //C07_Car Ozellikler
        //marka :'Marka atanmamış', model :'Model atanmamış', renk :'Renk atanmamış', yil :1900, fiyat :0
        //ATAMA YAPILMADIĞI İÇİN ÇIKMADI.
        //C07 İÇİNDE CONSTRUCTOR İÇİNDE ATAMA YAPILMALIDIR
        // marka = mrk;
        // model = mdl; şeklinde atama yaptık tekrar yazdırıyoruz
        System.out.println("Car 4 : " + car4);

        //C07_Car Ozellikler
        //marka :'Porsche', model :'Carrera', renk :'Renk atanmamış', yil :1900, fiyat :0
        // Yıl ve fiyat gelmedi.

        //bu constructor ı kaç kare kullanırsak aynı şekilde atama yapılan kısımlar gelecek

        C07_Car car5 = new C07_Car("Audi","Q7");
        System.out.println("Car 5: " + car5);
        //C07_Car Ozellikler
        //marka :'Audi', model :'Q7', renk :'Renk atanmamış', yil :1900, fiyat :0

        C07_Car car6 = new C07_Car("Honda","Jazz",2016, 7000);
        System.out.println("Car 6 : " + car6);
        //Car 6 : C07_Car Ozellikler
        //marka :'Honda', model :'Jazz', renk :'Renk atanmamış', yil :2016, fiyat :7000

        C07_Car car7 = new C07_Car("Opel","Corsa",2018,8000);
        System.out.println("Car 7 : " + car7);
        //Car 7 :  Ozellikler
        //marka :'Opel', model :'Corsa', renk :'Renk atanmamış', yil :2018, fiyat :8000


    }
}
