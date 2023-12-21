package Day19_passByValue;

public class C01_staticBlocks {

    C01_staticBlocks (){

        System.out.println("constructor çalıştı");

    }

    static {
        System.out.println("static block çalıştı");
    }

    public static void main(String[] args) {
        System.out.println("main method çalıştı");

        C01_staticBlocks obj = new C01_staticBlocks();
        C01_staticBlocks obj2 = new C01_staticBlocks();

        //main method çalıştı
        //constructor çalıştı şeklinde konsola yazdırılır. eğer constructor öncesinde statik olmayan method varsa o çalışır
        //3. constructor eklense de yine öncesinde statik olmayan method çalışır.


        //araya static{} block eklenince
        // static block çalıştı
        //main method çalıştı
        //constructor çalıştı  şeklinde yazdırdı. main methoddan önce çalıştı.
        //Eğer class çalışmaya başlamadan belirli ayarları yapmak istenirse static block oluşturulur.
        //Birden fazla olursa önce üstte olan static block çalışır (static blocklar arasında sıralama)
    }

    static {
        System.out.println("Alttaki static block çalıştı");

        //bu şekilde bir static block daha eklenirse;
        //static block çalıştı
        //Alttaki static block çalıştı
        //main method çalıştı
        //constructor çalıştı şeklinde konsola yazılır
    }

    {

        System.out.println("Static olmayan block"); //obje oluşturmadan önce oluşturulur ve objeden önce constructor dan önce bu çalışır.

        //static block çalıştı
        //Alttaki static block çalıştı
        //main method çalıştı
        //Static olmayan block
        //constructor çalıştı son hali bu şekilde oldu.
    }

    //static block çalıştı
    //Alttaki static block çalıştı
    //main method çalıştı
    //Static olmayan block
    //constructor çalıştı
    //Static olmayan block
    //constructor çalıştı  bir obje daha eklersek main method içine bu şekilde çalışma sırası olur.
}
