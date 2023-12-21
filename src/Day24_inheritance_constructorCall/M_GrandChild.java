package Day24_inheritance_constructorCall;

public class M_GrandChild extends K_Child{

     int sayi = 100;
     int yas = 23;
     String mahalle = "Birlik";
     String memleket = "Ankara";
     String arkadas = "Reyhan";


    public  void method1(){
        System.out.println("Grandchild method 1");
    }
    public  void method3(){
        System.out.println("Grandchild method 3");
    }
    public  void method4(){
        System.out.println("Grandchild method 4");
    }
    public void runnerMethod (){

        int sayi = 5;
        int sansliSayi=44;

        System.out.println(sayi); // 5

        System.out.println(this.sayi); //100 grandchild class ında üstte olan sayı çalıştı

        System.out.println(super.sayi); // 25 Kchild da olan yani parent ı olan class dan sayıyı aldı

        System.out.println(sinif); // 8 içinde bulunduğu scope da sınıf yok
        //class level da sınıf yok
        //parent class k child da sınıf var onu alır yazdırır

        System.out.println(isim); // j parent class ına kadar gider alican ı bulur alır.

        System.out.println(yas); // class level da yas 23 alır yazdırır

        System.out.println(telefon); // k child parent class ına gider .

        System.out.println(this.sinif); //this diyerek direk class level dan arama yapmaya başlar.
        //class da bulamazsa parent a gider.

        System.out.println(this.mahalle); //Birlik
        System.out.println(this.adres); // Çankaya
        this.method1(); //class da olan methodu yazdırır


        System.out.println(super.sayi); //direk parent class da aramaya başlarız super diyerek
        //kchild parent class ından 25 alır
        System.out.println(super.isim); // alican
        System.out.println(super.memleket); // İzmir



        System.out.println(sansliSayi);
        //this.sansliSayi scope da var ama aramaya class dan başlar. parentlarda da yok.
        //o yüzden cte verir.
        // super.sansliSayi yine olmadı.

        System.out.println(arkadas); // scope dan başlar. bulamayınca class a geçer.
        //Reyhan

        System.out.println(this.arkadas); // direk classdan aramaya başlar reyhanı bulur

        //System.out.println(super.arkadas); direk parent ta aramaya başlar
        //orada olmadığı için cte verir

        method2(); // Parent method2. granparent ta var
        this.method2(); // aramaya class içinden başlar aramaya devam eder.
        //Parent method2
        super.method2();
        //Parent method2 aramaya bu defa parent class dan başlar ve devam eder.

        method3(); // Grandchild method 3 class içinden aramaya başlar.
        this.method3(); // Grandchild method 3

        super.method3(); // Child method 3
        //parent class dan aramaya başlar




    }

    public static void main(String[] args) {
        M_GrandChild obj = new M_GrandChild();
        obj.runnerMethod();
    }
}
