package Day07_StringManipulations;

public class C07_nullPointer {

    public static void main(String[] args) {

        String str;

        //System.out.println(str);
        //Java'da main methof içerisinde deger atamadan bir variable olusturabiliriz
        //Ancak deger atamadan kullanamayiz

        String str2 = "";
        System.out.println("str2'nin yazdirma hali : " +str2); // hiçlik yazdirir. deger atandi

        /* Java deger atanmamis variable lari isaretlemek için özel
        bir null keyword'u olusturmustur
         */

        //String str3 = true;
        //String str3 = 45;
        //String str3 = 'f';
        //bunları kabul etmez

        String str3 = null; // null "" içinde olmamasina ragmen kabul etti
        //bu bir deger değildir, işaretçidir. str3'ün oluşturulduğunu ve bir değer atanana
        //kadar bu sekilde kullanimak istendigini Java'ya söyler
        //null olarak işaretlenen bir String'i yazdırabilirsiniz ancak methodlarda kullanamazsınız


        String str4 = ""; // hiçlik değeri atanmıştır
        String str5 = "Tava"; // tava degeri atanmıştır

        System.out.println(str3);

        str3 = "Ayça";
        System.out.println(str3);
        //null işaretçisine sonradan değer atanabilir

        //sadece stringi değil non primitive türündeki herhangi bir objeyi
        //oluşturup değer atamak istemediğimizde null olarak işaretleriz
        //istenirse sonradan değer ataması yapılır





    }
}
