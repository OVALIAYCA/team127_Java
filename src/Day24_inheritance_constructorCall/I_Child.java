package Day24_inheritance_constructorCall;

public class I_Child extends H_Parent{

    I_Child (){

        System.out.println("Child parametresiz constructor");
    }

    I_Child (String str){
        super(5); //bunu kullanacak şekilde main method içinde yeni obje oluşturduk
        //görünür super koyduk gizli olan devre dışı kaldı
        //parent classına gider integer parent contructor a gider
        //o da super() parametresiz i görüp granparent parametresiz constructor a gider ve yazdırmaya başlar.
        /*
        Grandparent parametresiz constructor
        Parent integer
        Child String

         */
        System.out.println("Child String");
    }
    I_Child (int sayi){
        super("a");

        //child3 buraya gelir. parametresiz super constructor yok. parent class a gider
        //parent class string constructorına gider.
        //orada this(); ekli
        //parent parametresiz constructor a çıkar this dediği için
        //parent parametresiz de bir super() constructor var. oradan grandparent parametresiz constructor a gider
        //ve oradan çalışmaya başlar
        /*
        grandparent parametresiz
        parent parametresiz
        parent string
        child integer çalışır

         */

        System.out.println("Child integer");
    }

    I_Child (boolean bl){
        super(true);
        //burada artık görünmeyen super yok.
        //parent booleana git diyor
        //orada da boolean false var
        //grandparetn class boolean a gönderir
        //orada this (5) diye bir contructor aranacak. integer grandparetn constructor a gidilir
        //o da bizi grandparent string e götürür ve dönüş yolculuğu başlar

        System.out.println("Child boolean");
    }

    public static void main(String[] args) {

        I_Child child4 = new I_Child(true);
        //true yu parametre olarak kabul eden bir constructor var mı diye bakar ve child boolean a gider
        /*
        Grandparent String
        Grandparent integer
        Grandparent boolean
        Parent boolean
        Child boolean
         */

        I_Child child3 = new I_Child(3);
        //integer bir constructor var mı diye kontrol etmeye gider
        //child integer constructorına gider



        I_Child child2 = new I_Child("ali"); //ali diye bir parametre kabul eden constructor var mı diye bakar
        //child string e gider.
        //Grandparent parametresiz constructor
        //Parent integer
        //Child String


        I_Child child1 = new I_Child();

        /*
        Grandparent parametresiz constructor
        Parent parametresiz constructor
        Child parametresiz constructor
         */

        /*
        Biz bir class'da görünür bir contructor oluşturduğumuzda default contructor silindiği gibi
        eğer extends kullanan bir class'daki herhangi bir constructor'ın ilk satırına görünür bir contructor
        call yazarsak java default süper constructor call'ı siler.
         */

    }
}
