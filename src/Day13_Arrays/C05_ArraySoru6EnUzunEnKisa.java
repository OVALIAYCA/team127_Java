package Day13_Arrays;

public class C05_ArraySoru6EnUzunEnKisa {

    public static void main(String[] args) {

        //Soru 6- Verilen String bir array’deki en uzun ve
        // en kisa kelimeleri yazdiran bir method
        //olusturun.

    String [] isimler = {"Huseyin","Mehmet","Can","Ercan","Ali"};

    enUzunEnKisaYazdir(isimler);

    }

    public static void enUzunEnKisaYazdir(String[] isimler){

        String enKisaIsim = isimler[0];
        String enUzunIsim = isimler[0];

    //en kisa isim için ilk değeri hiçlik atarsak en kisayi bulamayiz
    //arrayin 0. indeksini atariz.
        for (int i = 0; i < isimler.length ; i++) {

            if (isimler[i].length() >= enUzunIsim.length()){

                enUzunIsim = isimler[i];
            }
            if (isimler.length <= enKisaIsim.length()){

                enKisaIsim = isimler [i];
            }

        }
        System.out.println("En uzun isim : " + enUzunIsim);
        System.out.println("En kisa isim : " + enKisaIsim);
    }
}
