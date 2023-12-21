package Day25_InheritanceDataTypeKullanimi_Overriding;

import Day23_Inheritance.G_Auris;

public class H_Runner {

    public static void main(String[] args) {

        G_AvciKuslar kartal4 = new G_AvciKuslar();
        //constructor ve data türü aynı yerde. avcı kuslarda.
        //o class a gidip o class ya da parentlarından ilk bulunan method çalıştırılır.


        kartal4.hareket(); // G uçarlar
        kartal4.solunum(); // F akcigerle nefes alirlar
        kartal4.beslenme(); // G et yerler
        kartal4.cogalma();  // F yumurtayla cogalirlar
        kartal4.omur(); // E yasar ve olurler
        kartal4.kanat(); // F kanatlidirlar
        kartal4.gaga(); // G sivri gagalı
        kartal4.pence(); // G pençelidir

        F_Kuslar kartal5 = new G_AvciKuslar(); // aramaya f classından başlar
        //yukarı doğru devam eder
        //bulduğunda tekrar geri hakeret ile daha günceli var mı overriding edilmiş mi diye bakar
        //method olduğunda bu şekilde hareket eder.

        kartal5.hareket(); // G uçarlar
        kartal5.solunum(); // F akcigerle nefes alirlar
        kartal5.beslenme(); // G et yerler
        kartal5.cogalma();  // F yumurtayla cogalirlar
        kartal5.omur(); // E yasar ve olurler
        kartal5.kanat(); // F kanatlidirlar
        kartal5.gaga(); // G sivri gagalı
        //kartal5.pence(); // aramaya f kuşlardan başladık parent ı da aradık
        //aradığımız özelliği bulamadık. o yüzden günceli var mı diye de bakılmaz
        //CTE verir.


        E_Hayvanlar kartal6 = new G_AvciKuslar();
        //Aramaya hayvanlar class ından başlarız ve daha günceli var mı diye aşağı
        //yönlü arama yaparız.

        kartal6.hareket(); // G uçarlar
        kartal6.solunum(); // F akcigerle nefes alirlar
        kartal6.beslenme(); // G et yerler
        kartal6.cogalma();  // F yumurtayla cogalirlar
        kartal6.omur(); // E yasar ve olurler
        //kartal6.kanat(); // CTE
        //kartal6.gaga(); // CTE
        //kartal6.pence(); // CTE

        F_Kuslar kus1 = new F_Kuslar();
        //obje de constructor da kuslar class ında. altta chil class varsa ona hiç bakmaz.

        kus1.hareket(); // E class hareket ederler
        kus1.solunum(); // F  akcigerle nefes alirlar
        kus1.beslenme(); // E beslenirler
        kus1.cogalma();  // F  yumurtayla cogalirlar
        kus1.omur(); // E yasar ve olurler
        kus1.kanat(); // F kanatlidirlar
        kus1.gaga(); // F gagalari vardir
        //kus1.pence(); // CTE


        E_Hayvanlar kus2 = new F_Kuslar();
        //Data türü ve constructor aynı değil
        //Data türü hayvanlar class ta o yüzden aramaya Hayvanlar Classından başlanır
        //method bulunur overriding edilmiş mi diye child class lara bakılır
        //daha günceli var mı diye bakılır.

        kus2.hareket(); // E class hareket ederler
        kus2.solunum(); // F  akcigerle nefes alirlar
        kus2.beslenme(); // E beslenirler
        kus2.cogalma();  // F  yumurtayla cogalirlar
        kus2.omur(); // E yasar ve olurler
        //kus2.kanat(); // CTE
        //kus2.gaga(); // CTE
        //kus1.pence(); // CTE

        E_Hayvanlar hayvanlar1 = new E_Hayvanlar();

        hayvanlar1.hareket(); // E class hareket ederler
        hayvanlar1.solunum(); // F  akcigerle nefes alirlar
        hayvanlar1.beslenme(); // E beslenirler
        hayvanlar1.cogalma();  // F  yumurtayla cogalirlar
        hayvanlar1.omur(); // E yasar ve olurler
        //hayvanlar1.kanat(); // F kanatlidirlar
        //hayvanlar1.gaga(); // F gagalari vardir
        //hayvanlar1.pence(); // CTE

    }
}
