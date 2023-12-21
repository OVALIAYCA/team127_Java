package Day18_parametrizedConstructor_constructorCalls;

public class C03_constructorCall {


    C03_constructorCall(){
        this("java"); //bunu eklersek string constructor a gidecek. string constructor içinde de integer constructor call edilmişti.
        System.out.println("Parametresiz constructor çalıştı");
    }

    C03_constructorCall(int sayi){
        System.out.println("integer parametreli bir constructor çalıştı");
    }

    C03_constructorCall(String metin){
        //C03_constructorCall(); // method call sintex i olduğundan java bu isimde method arar.
        this(6); //constructor call sintexi
        //bir constructor içinde 2 tane constructor çağıramayız. sadece 1 constructor çağırabiliriz.
        System.out.println("String parametreli constructor çalıştı");
    }

    public static void main(String[] args) {

        C03_constructorCall obj1 = new C03_constructorCall();
        //Parametresiz constructor çalıştı

        System.out.println("    ");

        C03_constructorCall obj2 = new C03_constructorCall(4);
        //integer parametreli bir constructor çalıştı

        System.out.println("    ");

        C03_constructorCall obj3 = new C03_constructorCall("A");
        //integer parametreli bir constructor çalıştı
        //String parametreli constructor çalıştı
        //çünkü constructor içinde integer constructor ı çağırdık....
    }
}
