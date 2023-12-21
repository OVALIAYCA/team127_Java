package Day34_NestedMaps;

import Day32_maps.MapMethodDepo;

import java.util.HashMap;
import java.util.Map;

public class C03_FarkliDataTurleriIleMapOlusturma {
    public static void main(String[] args) {


        /*
        {
           "firstname" : "Ahmet",
           "lastname" : "Bulut",
           "totalprice" : 500,
           "depositpaid" : false,
           "bookingdates" : {
                  "checkin" : "2023-07-21",
                  "checkout" : "2023-08-10"
                     },
           "additionalneeds" : "wi-fi" }
        */
        Map<String, Object> bookingMap = new HashMap<>();

        MapMethodDepo.rezervasyonOlustur("Ahmet","Bulut",500,
                false,"2023-07-21","2023-08-10","wi-fi");

        System.out.println(bookingMap);

        System.out.println(bookingMap.get("firstname"));
    }
}
