package Day13_Arrays;

public class Soru4 {

    public static void main(String[] args) {

        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //kullanildigini yazdiran bir method olusturun.

        int [] arr = {3,4,2,6,5,4,5,7,8,2,3,9};
        int arananSayi = 8;

        arananSayiyiYazdir(arr,arananSayi);

    }

    public static void arananSayiyiYazdir (int [] arr, int aranansayi){

        int sayac = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] == aranansayi) {

                sayac++;

            }
        }
        if(sayac == 0){System.out.println("Aranan sayi Array içinde yok");}
        else {System.out.println("Aranan sayi array'de " + sayac + " kere kullanilmiştir");}
    }
}
