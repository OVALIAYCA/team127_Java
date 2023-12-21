package Day21_varargs_stringBuilder;

public class C02_Varargs {

    public static void main(String[] args) {

        topla(3,5);  // Toplam : 8

        topla(3,5,7); //Toplam : 15

        //method call sırasında istediğimiz kadar argument yazabilmek için
        //java variety of arguments ===> varargs ile hizmetinizde
        //varargs array alt yapısını kullanarak istediğimiz kadar argument yazmamıza imkan verir.


        topla(1,2,3);  //Toplam : 6
        topla(1,2);    //Toplam : 3
        topla(1,2,3,4); //10
        topla(5,4,8,7,3,2,1);  //30
        topla(3,2,4,5); //14
        topla(2,5,6,7,8,4,2,4,6,7); //51

    }
    //int... yazarsak sayısız argument ekleme şansımız olur
    public static void topla(int... sayi){

     int toplam = 0;
        for (int each: sayi
             ) {
            toplam += each;
        }
        System.out.println(toplam);
    }

    public static void topla (int sayi1, int sayi2){

        System.out.println("Toplam : " + (sayi1+sayi2));
    }

    public static void topla (int sayi1, int sayi2, int sayi3){

        System.out.println("Toplam : " + (sayi1+sayi2+sayi3));
    }
}
