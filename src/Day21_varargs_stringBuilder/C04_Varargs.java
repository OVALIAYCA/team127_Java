package Day21_varargs_stringBuilder;

public class C04_Varargs {

    public static void main(String[] args) {

        islem(3,4,5,6,7,8);
        // 3+4+8=15
        //8 almasının sebebi c[a] istemesi. c arrayinin a sayisi kadar olan indeksteki değeri isteniyor.

        islem(1,2,3,4,5,6); //7
        //1+2 + 4 = 7

        islem(0,1,2);
        // 0+1 + 2 = 3

        islem(3,4);
        //c arrayi yok.boş bir array.
        //Index 3 out of bounds for length 0
        //cte yok rte var

    }

    public static void islem(int a, int b, int... c){

        System.out.println(a+b+c[a]);

    }
}
