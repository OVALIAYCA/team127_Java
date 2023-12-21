package Day27_abstractClasses_Interfaces;

public abstract class C06_AbstractParent extends C05_AbtractGrandParent {

    /*
    Abstract olan child class'lardan da obje oluşturulamayacağı için
    Child olsalar da parent'larındaki abstract methodları
    UYARLAMAK ZORUNDA KALMAZLAR.

    (bu da kural koyan bir sınıf, çünkü bu da abstract class)

    Abstract parent child arasındaki ilişki
    normal inheritence kullanan parent - child class'lar gibidir.
    Yani isterse override eder, istemezse uyarlamaz.
     */

    //public abstract void method1();
    public void method1(){
        System.out.println("Grandparenttaki abstract method1 parentta Concrete yapıldı.");
        //concrete oldu artık bir bodysi var
        //yolculuğa abstract başladı bu noktada concrete oldu
    }
    public void method4 (){
        System.out.println("Parentta oluşturulan yeni method, concrete method.");
    }

    public abstract int method5 ();
    public abstract String method6 ();
}
