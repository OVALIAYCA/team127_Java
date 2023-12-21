package Day22_stringBuilder_accessModifier_encapsulation;

public class C05_EncapsulationRunner {

    public static void main(String[] args) {

       C04_Encapsulation obj = new C04_Encapsulation();

       //obj.gorulebilsin = "deneme";

       //System.out.println(obj.degerAtanabilsin);

        System.out.println(obj.getGorulebilsin());
        //Bu variable görülebilir ama değiştirilemez

       // obj.getGorulebilsin() = "deneme";
        //methoda değer atanmaz

        obj.setDegerAtanabilsin("Ali");
        obj.setDegerAtanabilsin("Veli");
       // System.out.println(obj.setDegerAtanabilsin(););
       // method yazdırılmaz. değer atandı ama yazdırılamadı.


     obj.gorulebilirVeDegerAtanabilir = "Deneme";
     System.out.println(obj.gorulebilirVeDegerAtanabilir);
     // Deneme hem yazdırdık hem değer atadık.
        //İhtiyaç ise yaparız.

        //C04 classında oluşturulan private int sayı variable'ına ilk etapta  ulaşamıyoruz.
        // generate den getter ve setter yaptık

        obj.setSayi(20); // yeni 20 değeri atadık
        System.out.println(obj.getSayi()); // 20 yazdırdı



    }
}
