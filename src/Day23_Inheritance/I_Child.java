package Day23_Inheritance;

public class I_Child extends H_Parent{

    public static void main(String[] args) {

        I_Child child1 = new I_Child();
        //child1.araba ulaşamadık. private a child class da olsa
        //ulaşamadık.

        System.out.println(child1.kasa);
        //static olarak oluşturulan variable a ulaştık. default variable dır.
        //kasa boş
        //static olduğu için her durumda zaten ulaşılırdı. obje olmadan da ulaşırdık.
        System.out.println(kasa); // kasa boş

        kasa = "75";
        //değer ataması da yapılır
        System.out.println(kasa); // 75

        child1.sayi = 34; //default olana da ulaştık.
        //Default normalde inheritence a uygun değildir ama bu class
        //aynı package da olduğu için kullanılabilir

        System.out.println(child1.adres);
        //parent başka package da olsaydı child class ,
        // defeault access modifiera sahip class üyelerine ulaşamazdı



    }
}
