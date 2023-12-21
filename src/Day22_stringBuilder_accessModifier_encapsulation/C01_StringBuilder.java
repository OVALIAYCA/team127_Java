package Day22_stringBuilder_accessModifier_encapsulation;

public class C01_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java Candır");

        sb.reverse();
        System.out.println(sb); // rıdnaC avaJ
        //ters çevirir ve kalıcı olur.


        sb.reverse();
        System.out.println(sb);
        //Java Candır

        StringBuilder sb2 = new StringBuilder("Java Güzeldir");
        StringBuilder sb3 = new StringBuilder("Hava Güzel");
        StringBuilder sb4 = new StringBuilder("ne bu şimdi?");
        StringBuilder sb5 = new StringBuilder("Java Candır");

        System.out.println(sb.compareTo(sb2)); // -4
        System.out.println(sb.compareTo(sb3)); // 2
        System.out.println(sb.compareTo(sb4)); // -36 //küçük harf ve büyük harfler arasın 32 var. n ve j arasında 4. o yüzden -36
        System.out.println(sb.compareTo(sb5)); // 0 yazdırır fark yok.


        //compare karşılaştırma yapıyor harf harf boşluklar vs dahil.
        //ilk bulduğu farklı harflerin arasındaki farkı alıyor geride ise - ile belirtiyor
        // örneğin Java ile Hava yı karşılaştırıyor.
        //stringbuilder J h den 2 ilerde +2 oluyor
        //Java ile Ne bu şimdi de J ve N yi karşılaştırıyor.
        // j n'ye göre 4 geride o yüzden -4 yazdırır.

        //Eğer compareto ile karşılaştırdığımda bize 0 dönerse bu stringbuilder lar birbiri ile aynıdır.
        //equals methodu var ama burada kullanılmaz.
        System.out.println(sb.equals(sb5)); //aynı olmalarına rağmen false verdi. equals kullanma!



        String str = "Java Candır";
        //System.out.println(str == sb);
       //Javada farklı non pritimitive datalar == ile karşılaştırılamaz.

        System.out.println(str.equals(sb));
        //false verdi. metinler aynı olmasına rağmen.
        //doğru sonuç vermez kullanılmaz.
        //java burada cte vermez.


        System.out.println(sb.replace(0, 4, "Hava"));
        //Hava Candır
        // sadece stringbuilder da indexleri verip şu indeksle bu indeks arasını sil yerine yeni kelimeyi koy diyebiliriz.



    }
}
