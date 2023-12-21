package Day17_Constructors;

public class C07_Car {

    String marka = "Marka atanmamış";
    String model = "Model atanmamış";
    String renk = "Renk atanmamış";
    int yil = 1900;
    int fiyat = 0;

    C07_Car(){

    }

    C07_Car (String mrk, String mdl){
        marka = mrk;
        model = mdl;

    }
    //bunu yazdığımız anda default constructor gitti. diğer C08de oluşturulan objeler hata verdi
    //bu yüzden bu constructor öncesinde parametresiz biz constructor oluşturmamız gerekir.
    //C07 () {  } şeklinde.parametresi ve boş bir constructor oluşturuyoruz.

    C07_Car (String mrk, String mdl, int yl, int fyt){
        marka = mrk;
        model = mdl;
        yil = yl;
        fiyat = fyt;



    }

    @Override
    public String toString() {
        return " Ozellikler \n" +
                "marka :'" + marka + '\'' +
                ", model :'" + model + '\'' +
                ", renk :'" + renk + '\'' +
                ", yil :" + yil +
                ", fiyat :" + fiyat ;

    }
}
