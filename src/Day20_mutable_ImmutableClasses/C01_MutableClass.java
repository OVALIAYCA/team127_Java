package Day20_mutable_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_MutableClass {

    public static void main(String[] args) {

        String s  = "Java";

        String str = new String("Java Candır");

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str);  // Java Candır

        str.toLowerCase();

        //String methodlarının yaptığı değişiklikler sadece o satır için geçerlidir
        //kalıcı olmaz.kalıcı olması için yeni bir variable a atama yapmalıyız.

        System.out.println("-------------");

        List<String> isimler = new ArrayList<>();
        isimler.add("Senayda");
        isimler.add("Aslı");
        isimler.add("Beytullah");
        System.out.println(isimler); //[Senayda, Aslı, Beytullah]


        isimler.set(1,"Yusuf");
        System.out.println(isimler); //[Senayda, Yusuf, Beytullah]
        //kalıcı değişiklik oldu. Mutable ve immutable olması ile ilgilidir.





    }
}
