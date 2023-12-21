package Day27_abstractClasses_Interfaces;

public class K12_ChildOfInterfaces implements I08_Interface,I10_Interface{

    public void method1(){

        //method 1 hem I08 de hem de I10 da var
        //her ikisinde olsa da, ikisi de void olduğundan
        //hangisini implement ettiğimizin önemi yok
    }

    public void method2 (){
        //I08
    }

    public int method3 (){
        return 0; // I08 den geldi override edilmişti K11 de
    }

    public String method4 (){
        return null; //I08 den
    }

    public int method5 (){
        return 0;
    }


}
