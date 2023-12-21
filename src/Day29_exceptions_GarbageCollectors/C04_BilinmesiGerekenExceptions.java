package Day29_exceptions_GarbageCollectors;

public class C04_BilinmesiGerekenExceptions {

    public static void main(String[] args) {

        String str = "Java Candir";

        //Integer sayi = str;

        Object obj = str; //objeyi kabul etti.arada parent child ilişkisi var.
        //autowidening

        //Integer sayi = (Integer) obj;
        //arada parent child ilişkisi olduğundan explicitnarrowing yapılabilir. cast edilir.

        //System.out.println(sayi); // ClassCastException verdi****
        // Integer sayi = (Integer) obj; bu satırda exception verdi


        String aramaSonucuStr = "123a";
        //123a olduğunda NumberFormatException verir.*****
        //arama sonuç sayısının 100 den fazla olduğunu test edin.
        int aramaSonucuInt = Integer.parseInt(aramaSonucuStr);
        //arama sonucunu integer a çevirdik


        if (aramaSonucuInt > 100 ){
            System.out.println("Arama sonucu 100'den büyük. Test Passed");
        }else {
            System.out.println("Arama sonucu 100'den büyük değil. Test Failed");
        }


    }
}
