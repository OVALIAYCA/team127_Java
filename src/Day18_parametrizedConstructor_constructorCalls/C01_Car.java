package Day18_parametrizedConstructor_constructorCalls;

public class C01_Car {

    String marka = "Marka atanmamış";
    String model = "Model atanmamış";
    String renk = "Renk atanmamış";
    int yil = 1900;
    int fiyat;

    public C01_Car(){

        //renk = "Kırmızı";

    }
    // boş bir constructor mutlaka olmalı parametresiz bir constructor.
    // eğer bu constructor içine bir özellik atanırsa tüm hepsi için geçerli olur
    // örn : renk = "Kırmızı"; gibi.
    //Car 1 :  Ozellikler
    //marka :'Marka atanmamış', model :'Model atanmamış', renk :'Kırmızı', yil :1900, fiyat :0 RUN CLASS'INDA BU ŞEKİLDE GÖRÜNÜR
    //Car 1 :  Ozellikler
    //marka :'BMW', model :'116', renk :'Kırmızı', yil :2010, fiyat :7500

    //Altta oluşturulan constructor public olabilir void vs olamaz. o zaman method olur. RUN CLASS'INDA BU ŞEKİLDE GÖRÜNÜR
    //() parantez ve {} body olacak.
    public C01_Car(String mrk, String mdl, String rnk){

        marka = mrk;
        model = mdl;
        renk = rnk;

    }

    public C01_Car(String marka, String model, String renk, int fiyat){

        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.fiyat = fiyat;

        //this diyerek bu scope içini baz aldık.

    }

    //TÜM INSTANCE'LAR İÇİN PARAMETRE ALAN BİR CONSTRUCTOR OLUŞTURALIM

    public C01_Car(String marka, String model, String renk, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    // Model ve Yıl Parametreleri olsun
    //Biz hep toyota satıyoruz. renkleri de hep mavi.
    public C01_Car(String model, int yil) {
        this.model = model;
        this.yil = yil;
        marka = "Toyota";
        renk = "Mavi";
        //Scope adında marka ve renk adında bir variable olmadığı için karıştırmadı genele atadı.
        //yukarda () parantez içinde marka ve renk olsaydı this demek zorunda olurduk.
    }



    public String toString() {
        return " Ozellikler \n" +
                "marka :'" + marka + '\'' +
                ", model :'" + model + '\'' +
                ", renk :'" + renk + '\'' +
                ", yil :" + yil +
                ", fiyat :" + fiyat;
    }
}