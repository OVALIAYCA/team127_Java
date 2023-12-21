package Day22_stringBuilder_accessModifier_encapsulation;

import java.util.PrimitiveIterator;

public class C04_Encapsulation {


    private String gorulebilsin = "Bu variable görülebilir ama değiştirilemez";

    private String degerAtanabilsin = "Bu variable'a değer ataması yapılabilir ama atanmış değer görünemez";

    public String gorulebilirVeDegerAtanabilir = "Bu variable'a hem değer atanabilir hem de değeri görülebilir";

    private int sayi = 10;

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public String getGorulebilsin() {
        return gorulebilsin;
    }

    public void setDegerAtanabilsin(String degerAtanabilsin) {
        this.degerAtanabilsin = degerAtanabilsin;
    }


     /*
    Bir porjede çalışırken en önemli konulardan birisi de
    class üyelerine kimlerin ulaşabileceğinin ve değiştirebileceğinin belirlenmesidir

    Bu sınırlamayı en kolay olarak access modifier ile yapabiliriz.

    Access modifier ile bir variable a ulaşabilirseniz o variable a hem değer atayabilir
    hem de değerini okuyup kullanabilirsiniz

    Gerçek hayatta değerleri görme (read) ve yeni değer atayabilme (write)
    yetkilerinin ayrılması istenebilir.


    Yetkileri ayırmak istiyorsak;
    1-öncelikle access modifier ile erişimi engelleyin
    2- istenen yetkiyi sağlayan getter ve/veya setter methodu oluşturun




     */
}
