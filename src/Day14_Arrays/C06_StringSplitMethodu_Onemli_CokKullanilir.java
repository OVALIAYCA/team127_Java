package Day14_Arrays;

import java.util.Arrays;

public class C06_StringSplitMethodu_Onemli_CokKullanilir {

    public static void main(String[] args) {

        String str = "About 197.000.000 results (0,43 seconds) ";

        //arama sonuç sayisinin 1 milyondan cok oldugunu test edin.


        String [] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        //space lerden bolunce [About, 197.000.000, results, (0,43, seconds)] verdi
        // elemnet olarak kaydetti hepsini
        //şimdi içinden 197.000.000 sayisini string olarak aliriz.

        int sonucSayisi = Integer.parseInt(kelimeler[1].replaceAll("\\D",""));
        //kelimler arrayin 1. indeksi 197.000.0000 biz bunu replaceall ile dijit olmayan
        //her şeyden kurtulmak için \\D kullandik.
        //Integer.parsinteger ile string i integer olarak aldik

        System.out.println(sonucSayisi); // 197000000


        String[] ayirace = str.split("e");
        System.out.println(Arrays.toString(ayirace)); //[About 197.000.000 r, sults (0,43 s, conds) ]


        String [] ayiracHiclik = str.split("");
        System.out.println(Arrays.toString(ayiracHiclik));
        //[A, b, o, u, t,  , 1, 9, 7, ., 0, 0, 0, ., 0, 0, 0,  , r, e, s, u, l, t, s,  , (, 0, ,, 4, 3,  , s, e, c, o, n, d, s, ),  ]
        //karakter karatker ayirdi.
        // bu eğer Array olarak bu karakterleri alip üzerinde bir şey yapmak istersek, kullanilabilir.

       String [] ayiracNokta = str.split("s");
       System.out.println(Arrays.toString(ayiracNokta)); //[About 197.000.000 re, ult,  (0,43 , econd, ) ]










    }
}
