package Day21_varargs_stringBuilder;

public class C07_StringBuilder_eklemesilme {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java Candır");

        System.out.println(sb);
        //Java Candır

        sb.append(".");
        //Java Candır.

        System.out.println(sb);
        //Java Candır. noktayı ekledi. değişiklik kalıcı oldu
        //mutable olduğu için


        String str = "Hava çok güzel";

        sb.append(str,5,8);
        System.out.println(sb);
        //Java Candır.çok yazdırdı çok kelimesini sona ekledi.

        sb.insert(5,"çok ");
        System.out.println(sb);
        //Java çok Candır.çok çok kısmını araya da ekledik. insert ile araya ekleme yaptık.


        sb.insert(19,str, 8,14);
        //bizim sb nin 19. indeksine yukarıdaki str ın 9. indeksi ile 14. indeksi arasını ekleme yaptık

        System.out.println(sb);
        //Java çok Candır.çok güzel
        //güzel kelimesini ekledik.


        sb.delete(16,25);
        System.out.println(sb);
        //Java çok Candır.

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
        //Java çok Candır noktayı sildi

       int indexCok =  sb.indexOf("çok");
       sb.delete(indexCok , indexCok+4);
        System.out.println(sb);
        // Java Candır



    }
}
