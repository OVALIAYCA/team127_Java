package Day21_varargs_stringBuilder;

public class C06_StringBuilder_length_capacity {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();

        System.out.println("sb1 length : " + sb1.length());
        //sb1 length : 0

        System.out.println("sb1 capacity : " + sb1.capacity());
        //sb1 capacity : 16

        System.out.println("---------");

        StringBuilder sb2 = new StringBuilder("Ali Can");
        System.out.println(sb2.length()); // 7 "ali can" boşluk dahil 7

        System.out.println(sb2.capacity()); // 23   16+7 şekline hesaplanır

        System.out.println("---------");

        StringBuilder sb3 = new StringBuilder(11);
        System.out.println(sb3.length()); // 0 içinde yazı yok

        System.out.println(sb3.capacity()); // 11 yukarda belirtilmiş


        // 2 * eski kapasite + 2 yeni bir string eklenince otomatik olarak stringbuilder kapasite artırır.

        StringBuilder sb = new StringBuilder(7);

        sb.append("Ali");

        sb.append(" Kemal");

        System.out.println(sb.capacity()); // 16 kapasite 7 iken 16 ya çıktı

        sb.append(" okula gidiyor");

        System.out.println(sb.capacity()); //34 (16*2+2)
        System.out.println(sb.length()); // 23 yazdırır. Ali Kemal okula gidiyor
        System.out.println(sb); // Ali Kemal okula gidiyor   yazdırır


        System.out.println("----------");

        sb.trimToSize(); //kapasite ve length eşitlemek istersek

        System.out.println(sb.capacity()); //34 (16*2+2) iken 23 yaptı fazlalıkları attı trimtosize sayesinde
        System.out.println(sb.length()); // 23 yazdırır. Ali Kemal okula gidiyor
        System.out.println(sb); // Ali Kemal okula gidiyor   yazdırır







    }
}
