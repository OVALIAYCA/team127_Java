package Day24_inheritance_constructorCall;

public class L_Runner {


    public static void main(String[] args) {


        K_Child child = new K_Child();

        System.out.println(child.sayi);//25 güncel olan child class da olanı alır
        System.out.println(child.yas); // 20. parent class dan alır kendisinde yoksa.

        child.method1(); // Child method 1
        child.method2(); // Parent method2 parent class dan aldı kendisinde yok.

    }
}
