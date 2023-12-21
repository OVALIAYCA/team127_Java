package Day27_abstractClasses_Interfaces;

public class C02_UysalChild extends C01_KuralciParent{
    @Override
    void method1() {

    }

    @Override
    void method2() {

    }

    @Override
    void method3() {

    }

    @Override
    public int method5() {
        return 0;
    }

    @Override
    public void method4() {
        super.method4();
    }

   /*
    Java bir parent class'ın Child class'lara belirlenen methodları
    override etme mecburiyeti koyabilmesi için
    OZEL BIR KONSEPT hazırlamıştır.
    Eğer siz Parent class'da Abstract bir method oluşturursanız
    child class'lar parent class'daki Abstract methodları override etmek zorunda olur.
     */
}
