package Day12_Scope;

public class C02_Scope_LocalVariables {




    public static void main(String[] args) {

        int sayi = 20;

        //System.out.println(str);
        //System.out.println(bl);

        for (int i = 0; i <10 ; i++) {

            String str = "Java";
            str += i ;
            System.out.println(str);

            //yazdırma kısmını kod blogunun dısına alırsak ÇALIŞMAZ
            //str kod blogunun (Loop içinde ) içinde oluşturuldu


        }
        //System.out.println(i); kabul etmedi. loop dışında olduğu için.



    }


    public static void staticMethod(){
        //System.out.println(sayi);

        String str = "Java";
        //System.out.println(bl);

    }

    public void staticOlmayanMethod(){

        //System.out.println(sayi);

        boolean bl = true;


    }
}
