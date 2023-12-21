package Day17_Constructors;

public class C05 {

    //default constructor ile aynı işlevi yapan görünür bir
    //constructor oluşturalım

    public C05(){
        System.out.println("Merhaba, ben constructor");
    }
    // bu constructor görünür olduğu için default denmez
    //parametresiz constructor denir.
    //Default constructor bodysinde kod olmaz ama parametresiz
    //constructor bodysine kod ekleme yapılabilir
    //Bu parametresiz constructor'dır. Default constructor iptal olur.


    int sayi = 0 ;
    String str;

    public void method1 (){

        System.out.println("C05 method1 çalıştı");
    }

    public void C05(){
        //method isimleri küçükharf ile başlamalıdır.java öyle ister.
        //ama bu bir kural değildir convention (genel kabul )dir.
        //Bir kod bloğunun return type'ı varsa method'dur.

    }

   // public asd(){   }
        //ınvalid method declaration; return type required
    //ismi class adı ile aynı değil, bu method olur ama return type gerekir

   // c05(){   } Invalid method declaration; return type required
   //return type gerekir method olur.
}
