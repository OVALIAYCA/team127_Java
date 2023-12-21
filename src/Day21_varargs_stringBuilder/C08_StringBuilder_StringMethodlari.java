package Day21_varargs_stringBuilder;

public class C08_StringBuilder_StringMethodlari {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb.substring(2));  // va

        System.out.println(sb); // Java

        //StringBuilder döndürmüyorsa değişiklik olmaz

        System.out.println(sb.charAt(2)); //2.indeksi bize getirir ama kalıcı değişiklik yapmaz
        // v yazdırır
        System.out.println(sb);
        //Java

        sb.setCharAt(0,'H');
        System.out.println(sb);
        //Hava olarak değişiklik yaptı. set olduğu için.

        //char ya da string döndürenler kalıcı değişiklik yapmaz.

        System.out.println(sb.toString().contains("a")); //true
        System.out.println(sb); // Hava
        //bazı string methodları ise stringbuilder da yoktur. contains gibi
        //kullanmak istersek tostring yaparak önce stringe çeviririz sonra istenen methodu yaparız
        //ama bu kalıcı değişiklik sağlamaz.

    }
}
