package Day27_abstractClasses_Interfaces;

public abstract class C01_KuralciParent {

    /*
    1-Bir Class'ın child class'ları override etmeye zorlayacağı
    methodları Abstract olarak tanımlaması gerekir
    2-Bir Class'ın abstract methodlar barındırabilmesi için
    kendisinin de abstract olarak tanımlanması gerekir
    3-Abstract methodlar child class'ların Override etmesi için oluşturulur
    Bu sebeple Body'ye ihtiyaç yoktur

    */

  abstract void method1 ();
  abstract void method2 ();
  abstract void method3 ();

  public void method4 (){
      //abstract değilse method body gereklidir.
  }
  public abstract int method5();

  public static void main(String[] args) {

    //C01_KuralciParent obj = new KuralciParent();
    //obj.method1();
    //Java abstract class'lardan obje oluşturmaya izin vermez.
    C01_KuralciParent obj2 = new C04_ChildOfKuralciParent();
    obj2.method1();

  }
}
