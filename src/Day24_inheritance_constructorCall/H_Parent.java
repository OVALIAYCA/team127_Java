package Day24_inheritance_constructorCall;

public class H_Parent extends G_GrandParent{


    H_Parent (){

        System.out.println("Parent parametresiz constructor");
    }

    H_Parent (String str){
        this();

        System.out.println("Parent String");
    }
    H_Parent (int sayi){

        System.out.println("Parent integer");
    }

    H_Parent (boolean bl){
        super(false);

        System.out.println("Parent boolean");
    }
}
