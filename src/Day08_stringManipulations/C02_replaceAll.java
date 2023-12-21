package Day08_stringManipulations;

public class C02_replaceAll {

    public static void main(String[] args) {

        String str = "J1a5v8a +/can87dir";

        //metindeki sayi ve karakterleri temizleyip
        // sadece harflerden olusan "Java candir" sekline
        //donusturun

        // tum sayilari yok edelim
        str = str.replaceAll("\\d", ""); // atama yapildi kalici olarak degisti
        System.out.println(str);
        //Java +/candir

        // space ' i korumak için space yerine 1 rakam atayalim
        str = str.replaceAll("\\s","5");
        System.out.println(str);

        str = str.replaceAll("\\W","");
        System.out.println(str);
        str = str.replaceAll("_","");
        //alt çizgiiyi yok etmek istersek bu satiri kullanabiliriz


        str = str.replaceAll("5"," ");
        System.out.println(str); // Java candir oldu





    }
}
