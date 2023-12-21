package Day17_Constructors;

import java.util.Random;

public class C01 {

    int sayi = 6;
    String str = "Java Candir";


    public void rastgeleSayiUret (){

        Random random = new Random();

        int rastgeleSayi = random.nextInt(1000);

        System.out.println("Bugünün sansli sayisi : " + rastgeleSayi);

    }


    public void bugunNePisireyim (){

        String[] yemekler = {"Kuru fasülye", "Pilav","Makarna","Mercimek Çorbası","Cacik"};

        Random random = new Random();

        int yemekNo = random.nextInt(yemekler.length);

        System.out.println("Bugünün yemek teklifi : " + yemekler[yemekNo]);

    }
}
