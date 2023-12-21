package Day25_InheritanceDataTypeKullanimi_Overriding;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class D_Runner {

    public static void main(String[] args) {

        C_AvciKuslar kartal1 = new C_AvciKuslar();
        System.out.println(kartal1.hareket); //ucarlar C class'ından getirir
        //aramaya avci kuslar class ından başlar.Yukarı doğru aramaya devam eder. ilk bulduğu değeri alır
        System.out.println(kartal1.solunum); // akcigerle nefes alirlar B class'ından buldu
        System.out.println(kartal1.beslenme); // et yerler C class
        System.out.println(kartal1.cogalma); // yumurtayla cogalirlar B class
        System.out.println(kartal1.omur); // yasar ve olurler A class
        System.out.println(kartal1.kanat); //kanatlidirlar B class
        System.out.println(kartal1.gaga); // sivri gagali C class
        System.out.println(kartal1.pence); // pencelidir C class

        /*
        Bir obje oluşturulurken
        Data türü ve Contructor aynı class tan ise variable'ların hangi değeri
        alacağını bulmak için ilgili class'a gidip aramaya başlarız.
        Parent class'lara doğru aramaya devam ederiz.
        İlk bulduğumuz en güncel olan değer geçerli değer olur.
        Java bir objenin data türü olarak constructor'ın olduğu
        veya parent class'ları kabul eder.
        burası kendi constructor ya da parent  = new C_AvciKuslar();

        data türü constructor ın parent ı ise aramaya constructor dan değil data türünün olduğu
        class'dan başlanır
        parent class lara doğru aramaya devam edilir
        ilk bulunan değer kullanılır
         */

        B_Kuslar kartal2 = new C_AvciKuslar();
        System.out.println(kartal2.hareket); //hareket ederler A class
        System.out.println(kartal2.solunum); // akcigerle nefes alirlar  B class
        System.out.println(kartal2.beslenme); // beslenirler A class
        System.out.println(kartal2.cogalma); // yumurtayla cogalirlar B class
        System.out.println(kartal2.omur); // yasar ve olurler A class
        System.out.println(kartal2.kanat); //kanatlidirlar  B class
        System.out.println(kartal2.gaga); // gagaları vardır B class

        //System.out.println(kartal2.pence); //CTE verir
        //aramaya b class dan başlanır. data türü kuslar. constructor c.
        //aramaya data türünden başlanır





        A_hayvanlar kartal3 = new C_AvciKuslar();
        System.out.println(kartal3.hareket); //hareket ederler A class
        System.out.println(kartal3.solunum); //nefes alirlar A class
        System.out.println(kartal3.beslenme); //beslenirler A class
        System.out.println(kartal3.cogalma); //cogalirlar  A class
        System.out.println(kartal3.omur); // yasar ve olurler A class
        //System.out.println(kartal3.kanat); // A class da yok CTE
        //System.out.println(kartal3.gaga); //A class da yok CTE
        //System.out.println(kartal3.pence); //A class da yok CTE




        List<String> liste1 = new LinkedList<>();
        Queue<String> liste2 = new LinkedList<>();
        Deque<String> liste3 = new LinkedList<>();
        LinkedList<String> liste4 = new LinkedList<>();




    }
}
