package Day09_ForLoops_ve_MethodOlusturma;

public class C13_MethodOlusturma {

    public static void main(String[] args) {

        String str = "Sevim bak kim gelmis ?";

        str.toUpperCase();

        // method bize sonuc donduruyorsa 2 sekilde kullanabilir
        // sadece gecici sekilde yazdirabiliriz
        // ya da atama yaparak kalici sekilde dondurebiliriz

        System.out.println(str.toLowerCase()); // kucuk harf ile direk yazdirdik

        String strBuyukHarf = str.toUpperCase(); // kalici sekilde atama yaptik
        // yazdirma yapmadan goremeyiz ama bundan sonra yazdirirsak hep buyuk harf
        // seklinde yazdiracak.ama biz yeni variable a atarsak orjinal halini de
        //korumuş oluruz

        System.out.println(str); // orjinali

        System.out.println(strBuyukHarf); // buyuk harf seklinde atanmis hali








    }
}
