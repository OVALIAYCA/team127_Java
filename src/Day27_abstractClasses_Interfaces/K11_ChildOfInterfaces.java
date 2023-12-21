package Day27_abstractClasses_Interfaces;

import Day26_Overriding_PollyMorphisism.C03_ZorlamaSevmeyenParent;

public class K11_ChildOfInterfaces extends C03_ZorlamaSevmeyenParent implements I08_Interface,I10_Interface{

    //class ile interface arasında extends keyword olmaz. ımplement keyword kullanılır
    //bir class istediği kadar interface'i implement edebilir
    //ama birden fazla class extends edilemez.
    //extends ve implements birarada kullanılabilir.



    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public int method3() {
        return 0;
    }


    @Override
    public int method5() {

        return 0;

    }

    @Override
    public String method4() {
        return null;
    }
}
