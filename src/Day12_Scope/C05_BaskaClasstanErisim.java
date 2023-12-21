package Day12_Scope;

public class C05_BaskaClasstanErisim {

    /* Class içerisinde oluşturduğumuz  class üyelerinin static olup olmamasi
     başka class'lardan erişimi de etkiler
     Başka class'dan statik bir class üyesine ulaşmak için
     " class ismi . statik class üyesi ismi " kullanılır

    Başka class'dan statik olmayan class üyesine ulaşmak için
    önce o class'dan bir obje oluşturup sonra "obje ismi.statik olmayan class üyesi ismi"
    kullanılır
     */


    public static void main(String[] args) {

        System.out.println(C03_Scope_ClassVariables.bl); // true
        System.out.println(C03_Scope_ClassVariables.chr); // a
        C03_Scope_ClassVariables.staticMethod(); // true a. methoddan geliyor


        C03_Scope_ClassVariables obj = new C03_Scope_ClassVariables();
        System.out.println(obj.sayi); // 23
        System.out.println(obj.str);  // Java
        obj.staticOlmayanMethod(); // true a

        System.out.println(obj.bl);
        System.out.println(obj.chr);

        /* statik üyeleri otomatik olarak önermiyor
         kendisi otomatik getirmiyor ama yazdırınca obje olarak getiriyor
        manuel olarak obj.statikClassUyeIsmi yazıyor
        bu durumda intellij bu kullanımı sarıya boyuyor
        statik bir class üyesine statik olmayan yolla
         erişiyorsun diye bizi uyarır. */



    }

}
