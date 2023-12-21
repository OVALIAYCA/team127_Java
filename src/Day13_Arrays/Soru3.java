package Day13_Arrays;

public class Soru3 {

    public static void main(String[] args) {

        //Soru 6- Verilen String bir array’deki en uzun ve
        // en kisa kelimeleri yazdiran bir method
        //olusturun.

        String [] isimler = {"Ahmet","Huseyin","Ali","Ercan","Omer"};

        enUzunEnKisaKelimeYazdir(isimler);

    }
    public static void enUzunEnKisaKelimeYazdir (String[] isimler ){

        String enUzunKelime = isimler[0];
        String enKisaKelime = isimler[0];

        for (int i = 0; i < isimler.length; i++) {

            if ( isimler[i].length() >= enUzunKelime.length() ){

                enUzunKelime = isimler[i];
            }
        if (isimler[i].length() <= enUzunKelime.length()){

            enKisaKelime = isimler[i];
        }
        }
        System.out.println("En uzun kelime : " + enUzunKelime + "\nEn kisa kelime : " + enKisaKelime);
    }
}
