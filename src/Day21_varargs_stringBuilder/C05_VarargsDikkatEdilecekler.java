package Day21_varargs_stringBuilder;

public class C05_VarargsDikkatEdilecekler {

    //istenen kadar integer parametre alıp
    //ilk sayı dışındaki tüm sayıları toplayıp bulunan toplamı
    //ilk sayı ile çarpıp yazdıran bir method oluşturun

    public static void main(String[] args) {
         islem1(1,2,3,4,5,6);  // 1 * 20 = 20
         islem1(2,3,0); // 2 * 3 = 6
         islem1(0,3);  // 0*3 = 0
         islem1(1);
         //1 * 0 (boş array. başlangıçta toplam değeri 0 atanmıştı.o yüzden 0 alındı.) = 0

    }

    public static void islem1(int ilkSayi, int... ints){

        int toplam = 0;
        for (int each :  ints
             ) {

            toplam += each;

        }

        System.out.println(ilkSayi*toplam);
    }
}
