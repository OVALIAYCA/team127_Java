package Day16_ArrayLists_ForEachLoop;

public class C10_ForEachLoop {

    public static void main(String[] args) {

        /* for each loop birden fazla eleman barındıran
        array ve List gibi yapılarla çalışmak üzere hazırlanmıştır

        1'den 10'a kadar olan sayilari toplama,
        sayi 50'den küçük olduğu müddetçe .... yapma
        gibi işlemler için uygun değildir

        for each loop
        birden fazla eleman barındıran yapılardaki elementleri
        hiç bir siralama sartı olmadan ve index kullanmadan BİZE GETİRİR

        For each loop da 3 şey yazılmalıdır
        1- çalışacağımız elementlerin data türü
        2- Loop içinde gelen elemanları hangi isimle kullanacağımızı
        3- üzerinde işlem yapacağumız çok elementli obje
         */

        int[] arr = {2,5,7,9,0};
        //array'in tüm elementlerini yazdırın

        for (int each:arr
             ) {
            System.out.print(each + " ");
        }


        System.out.println("    ");

        // array'deki tüm elemanları toplayın
       int toplam = 0;
        for ( int w :arr
             ) {
            toplam += w;

        }
        System.out.println(toplam);


        System.out.println("      ");


        // array'deki çift sayıların çarpımını yazdirin

        int carpim = 1 ;
        for (int q : arr
             ) {
            if (q %2 == 0){
                carpim *= q;
            }
        }
        System.out.println("Çarpım sonu : " + carpim);


    }
}
