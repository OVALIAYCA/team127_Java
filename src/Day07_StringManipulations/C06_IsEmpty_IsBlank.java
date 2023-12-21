package Day07_StringManipulations;

public class C06_IsEmpty_IsBlank {

    public static void main(String[] args) {

        String str1 = "";
        String str2 = "    ";
        String str3 = "Java";

        System.out.println(str2.isBlank()); // true
        //blank boşluk(space) demek

        System.out.println(str2.isEmpty()); // false
        // space de bir karakterdir. boş diyemeyiz.

        System.out.println(str1.isEmpty()); // true hiçlik var
        System.out.println(str1.isBlank()); //true hiçliği de space gibi kabul ediyor

        System.out.println(str3.isBlank()); //false. bos değildir java yazıyor
        System.out.println(str3.isEmpty()); // false. java yazıyor space yoktur


    }
}
