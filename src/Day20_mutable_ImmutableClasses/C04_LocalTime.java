package Day20_mutable_ImmutableClasses;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class C04_LocalTime {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); // 11:04:27.019352

        LocalTime japonyaSaati = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(japonyaSaati); // 19:09:22.959238

        System.out.println(localTime.getHour()); // 11

        System.out.println(localTime.toNanoOfDay()); // 40258228551000 günün nanosaniyesi

        // yüz bin ile bir milyon arasındaki sayıların toplamını
        //ve bu toplama işleminin kaç nano saniye sürdüğünü yazdırın.

        //localtime canlı bir kronometre değildir.
        //sadece oluşturulduğu anda sistemin saat bilgisini kaydeden bir variable dır

        System.out.println("loop başında local time : " +localTime);
        LocalTime baslangic = LocalTime.now();
        System.out.println("Local time başlangıç : " + baslangic);
        System.out.println("Başlangıçta nano saniye : " + baslangic.toNanoOfDay());
        long toplam = 0 ;

        for (int i = 100000; i <= 1000000 ; i++) {

            toplam += i;

        }
        System.out.println("loop sonunda local time : " +localTime); //loop sonu ve başında eşittir. çünkü variable dır.
        LocalTime bitis = LocalTime.now();
        System.out.println("Local time bitiş : " + bitis);
        System.out.println("Bitişte nano saniye : " + bitis.toNanoOfDay());
        System.out.println("toplam : " + toplam);

        System.out.println("İşlem süresi : " + (bitis.toNanoOfDay()-baslangic.toNanoOfDay()));

    }
}
