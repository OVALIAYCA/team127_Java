package day02_DataCasting_Scanner;

public class C05_DataCasting {
    public static void main(String[] args) {

        int sayiINT= 34;
        String str = "Java Candır";
        boolean bl = true;
        char chr = '%';
        double dbl = 4.5;
        byte byt = 10;
        short shrt = 23;

        //bl = sayiINT ;
        //bl = str;
        //bl = char;

        //str = sayiINT;
        //str = bl;
        //str = chr;

        dbl = sayiINT;
        dbl = byt;
        dbl = shrt;
        dbl = chr;

        //sayiINT = dbl;
        sayiINT = shrt;
        sayiINT = byt;
        sayiINT = chr;


        //shrt = dbl;
        //shrt = sayiINT;
        shrt = byt;
        //shrt = chr;
        //küçük data türünü büyük data türüne atayabiliriz. Buna auto-widening denir.





    }
}
