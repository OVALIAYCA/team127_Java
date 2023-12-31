package Day25_InheritanceDataTypeKullanimi_Overriding;

public class M_Child extends L_Parent{

    public void method1(){
        System.out.println("Child method1");
    }

    public static void main(String[] args) {

        M_Child child1 = new M_Child();

        child1.method1(); // Child method1

        L_Parent child2 = new M_Child();
        child2.method1(); // Child method1

        K_Grandparent child3 = new M_Child();
        child3.method1(); // Child method1

        L_Parent parent1 = new L_Parent();
        parent1.method1(); // Parent method1

        K_Grandparent parent2 = new L_Parent();
        parent2.method1(); // Parent method1

        K_Grandparent gp1 = new K_Grandparent();
        gp1.method1(); // Grandparent method1


    }
}
