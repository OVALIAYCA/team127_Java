package Day06_StringManipulations;

public class C07_contains {

    public static void main(String[] args) {

        String str = "Java'ya çok çalışırsan, çok çabuk iş bulursun";

        System.out.println(str.contains("a")); // true

        System.out.println(str.contains("Java")); // true

        System.out.println(str.contains("t")); // false

        System.out.println(str.contains("java")); // false

        System.out.println(str.contains("av")); // true

        System.out.println(str.contains(" ")); // true

        System.out.println(str.contains("")); //true

        //harfler arasinda hiçlik vardir

        System.out.println(str.contains("çok çalış")); // true

        //char kabul etmez,string ister.





    }
}
