package Day12_Scope;

public class C04_Scope_DefaultValues {

    String str = "Java";
    String str2 ;
    int sayi = 23;
    int sayi2 ;

    static boolean bl = true;
    static boolean bl2 ;
    static char chr = 'a';
    static char chr2 ;

    public static void main(String[] args) {

        String metin ;
        //System.out.println(metin);
        //Local variables değer atamadan oluşturulabilir ancak yazdırılamaz

        //System.out.println(str); Static değil, method seçici olduğu için kullanılamaz

        //System.out.println(sayi);

        System.out.println(bl); // seçkin, kullanildi çünkü static.
        System.out.println(bl2); // deger atanmamış olmasına rağmen kullanmaya izin verdi
        System.out.println(chr); // static olduğu için izin verdi
        System.out.println(chr2); //deger atanmadığı için hiçlik yazdırdı konsolda

        //staticOlmayanMethod(); methodu çağıramadık.statik olmadığı için statik method içinde
        //tercih edilmez dedi.

        //static methodlar içerisinden static olmayan class üyelerine ulaşmak istersek
        //obje oluşturmamız gerekir.

        C04_Scope_DefaultValues obj = new C04_Scope_DefaultValues();
        obj.staticOlmayanMethod();

    }

    public void staticOlmayanMethod (){


        System.out.println(str); // statik olmayan method seçici değildi.yazdırdı
        System.out.println(str2); // null yazdi
        System.out.println(sayi); //23
        System.out.println(sayi2); // 0


        /*
        Local variable'lar deger atamadan olusturulabilir
        ANCAK deger atanmadan KULLANILAMAZ

        class level variable'lar ise
        ister static olsun, ister static olmasin
        deger atamadan olusturulabilir
        VE deger atanmadan da KULLANILABILIR

        Class level variable'lara biz deger ATAMAZSAK
        Java default olarak belirledigi degerleri ATAR

        Default Java Degerleri

        char ==> hiclik
        boolean ==> false
        sayisal primitive'ler ==> 0
        non-primitive'ler ==> null

     */





    }



}
