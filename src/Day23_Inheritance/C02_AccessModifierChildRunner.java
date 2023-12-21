package Day23_Inheritance;

public class C02_AccessModifierChildRunner  {

    public static String marka =   "Toyota"; // access modifier--- public
    public static int yil; // access modifier--- public
    //her yerden kullanılır.
    //Class lar private ve protected olmaz.
    //Class üyeleri olur; variable, method, constructor, static block, non-static block... gibi



    protected static String renk;
    protected static int maxHiz;
    //içinde bulunduğunuz class, package ve child class larda(ilintili sınıflar ama başka package larda)  kullanılır



    static String model; // default değer = null access modifier---- default
    static int fiyat; //default değer = 0 access modifier---- default
    //görünür bir acccess modifier yoksa DEFAULT access modifier geçerlidir.
    //Sadece kendi class ve package da kullanılır



    private static String seriNo;
    private static int km;
    //sadece kendi classında kullanılır




    public static void main(String[] args) {

    }
}

