package Day08_stringManipulations;

public class C01_replace {
    public static void main(String[] args) {

        String str = "Java candir";
        System.out.println(str.replace('a', 'q'));
        //Jqvq cqndir yazdirir. butun a'larin yerine q koydu.


        System.out.println(str.replace("Java", "Tava"));
        //Tava candir yazdirir

        System.out.println(str.replace("Java", "x"));
        //x candir

        System.out.println(str.replace("x", "y"));
        // Java candir. x bulamadigi için degistirmedi

        System.out.println(str.replace("a", "e").replace("i", "a"));
        //Jeve cendar

        System.out.println(str.replace("i", "a").replace("a", "e"));
        //Jeve cender

        System.out.println(str.replaceFirst("a", "x"));
        //Jxva candir sadece ilk a'yi degistirdi
        // regex : regular expressions : belirlenmis kisaltmalar

        // Ilk harfi * yapalim ama metni bilmiyoruz. metni her zaman bilemeyiz
        System.out.println(str.replaceFirst("\\w", "*")); // *ava candir





        // varsa String icindeki ilk rakami + yapalim
        str = "Java 44Candir";

        System.out.println(str.replaceFirst("\\d", "+"));
        //Java +4Candir




    }
}
