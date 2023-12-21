package day03_WrapperClassesVeMatematikselIslemler;

public class C05_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        int a = 20 ;

        // a'nın değerini yazdırın. Sonra a'nın değerini 1 artırıp oluşturacağınız
        // b variable'ına yeni değeri atayın.

        System.out.println("a : " + a);

        a += 1;
        int b = a;


        System.out.println("işlem sonunda a değeri: " + a + " " + "b değeri : " + b);

        a = 20;

        // a'nın değerini b ye ata önce. Sonra a'nın değerini 1 artır

        b = a;
        a += 1;

        System.out.println("işlem sonunda a değeri: " + a + " " + "b değeri : " + b);

        System.out.println("=================================");

        a = 20;
        b = a++;

        System.out.println("işlem sonunda a++ değeri: " + a + " " + "b değeri : " + b);

        a = 20;
        b = ++a;

        System.out.println("işlem sonunda ++a değeri: " + a + " " + "b değeri : " + b);


        int c = 40;

        System.out.println("c++ ile yazdirinca : " + c++);
        System.out.println("c++ ile bir alt satirda c'nin degeri : " + c);


        c = 40;

        System.out.println("++c ile yazdirinca : " + ++c);
        System.out.println("++c ile bir alt satirda c'nin degeri : " + c);



















    }
}
