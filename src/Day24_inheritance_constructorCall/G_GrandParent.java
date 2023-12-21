package Day24_inheritance_constructorCall;

public class G_GrandParent {


    G_GrandParent (){

        System.out.println("Grandparent parametresiz constructor");
    }

    G_GrandParent (String str){

        System.out.println("Grandparent String");
    }
    G_GrandParent (int sayi){
        this("b");

        System.out.println("Grandparent integer");
    }

    G_GrandParent (boolean bl){
        this(5);

        System.out.println("Grandparent boolean");
    }
}
