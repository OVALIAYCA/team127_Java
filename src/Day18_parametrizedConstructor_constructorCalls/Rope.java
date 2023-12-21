package Day18_parametrizedConstructor_constructorCalls;

public class Rope {

    public static void swing(){
        System.out.print("swing ");
    }
    public void climb(){
        System.out.println("climb ");
    }
    public static void play (){
        swing();
        //climb();
    }
    public static void main (String[] args){
        Rope rope = new Rope();
        rope.play();  //altını sarı çizmesinin sebebi static bir methodu static method içinde çağırdığımız için.
        //play(); yazsak da çalışır.
        Rope rope2 = null;
        rope2.play(); // eğer rope2 için değer atamasaydık kullanmamıza izin vermezdi. null olarak işaretledik o yüzden.
        //değer atamadık null olarak işaretledik.
        //elde bir obje olmadan da play methoduna ulaştırıp çalıştırabilir.
        //play(); yazsak da çalışır.
        //rope2.climb(); //NullPointerException
        





    }
}
