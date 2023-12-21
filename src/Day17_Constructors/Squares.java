package Day17_Constructors;

public class Squares {

    public static long square (int x){
        long y = x * (long) x ;  // value9 ile işlem yapıldı. 9*9=81
        x = -1 ;  // -1 in koda bir etkisi yoktur. int x -1 olarak atandı.
        return y ; // 81

    }

    public static void main(String[] args) {
        int value = 9 ;
        long result = square(value);

        System.out.println(result); //81 döner method çalışır. y değeri result a atanır.
        System.out.println(value);  // 9 output. value değeri main method içinde 9 atanmış.
        //System.out.println(x); hata verir

    }
}
