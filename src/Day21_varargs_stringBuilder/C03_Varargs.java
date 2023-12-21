package Day21_varargs_stringBuilder;

public class C03_Varargs {
    //1 int ve istenen kadar String parametre alıp
    //String parametre sayısı ile int sayının çarpımını yazdıran bir method oluşturun

    public static void main(String[] args) {

      islemYap(5,"a","b","c");  // 5*3 = 15
      islemYap(2,"a"); // 2*1 = 2
      islemYap(5); // 5 * 0 = 0 string yok. array boş. değeri 0 olur.
      islemYap(3,"","","","",""); // 3*5 = 15

    }

    public static void islemYap(int sayi1 , String... str){

        System.out.println(sayi1 * str.length);
    }
}
