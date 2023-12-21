package Day19_passByValue;

public class C02_PassByValue {

    public static void main(String[] args) {

        int sayi = 20;

        System.out.println("Method call öncesi sayi : " + sayi); // 20

        System.out.println("method return degeri : " + sayiDegistir(sayi)); // 25

        System.out.println("Method call sonrasi sayi : " + sayi); // 20

        sayi = sayiDegistir(sayi);  //bu aşamada main method içindeki sayı değişti. 25 oldu.

        System.out.println("atama call sonrasi sayi : " + sayi); //25

    }


    public static int sayiDegistir (int sayi){

        sayi += 5;

        System.out.println("Method içinde sayi : " + sayi); //25
        return sayi;
    }

    //public static int sayiDegistir (int a){
    //    a += 5;
    //    System.out.println("Method içinde sayi : " + a); //25
    //    return a;
    //}  böyle de yapsak bir şey değişmezdi. a da denebilir. sayi da denebilir. anlaşılması açısından sayi diyoruz.

    //Method call öncesi sayi : 20
    //Method içinde sayi : 25
    //method return degeri : 25
    //Method call sonrasi sayi : 20
    //Method içinde sayi : 25
    //atama call sonrasi sayi : 25
}
