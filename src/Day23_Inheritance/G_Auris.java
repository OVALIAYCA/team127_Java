package Day23_Inheritance;

public class G_Auris extends E_Toyota{

    public static void main(String[] args) {
        G_Auris auris1 = new G_Auris();
        System.out.println(auris1.marka); // Toyota ilk bulduğu markayı yazar -- toyota class'ından
        System.out.println(auris1.model); // Model atannamış -- car class'ından
        System.out.println(auris1.renk); // Renk atanmamış -- car class'ından
        System.out.println(auris1.yakit); // Yakıt türü atanmamış  -- car class'ından
        System.out.println(auris1.uretimYeri); // Japonya ve Türkiye  -- toyota class'ından
        System.out.println(auris1.sanziman); // Otomatik veya manuel  -- toyota class'ından
        System.out.println(auris1.lastik);  // Pirelli  -- toyota class'ından
        System.out.println(auris1.guvenlik); // Toyota araçlar ekstra güvenlik donanımına sahiptir -- toyota class'ından
        System.out.println(auris1.aku); // Akü atanmadı -- toyota class'ından

        /*
        Bir Class başka bir Class'a extends ile child olursa o Class'taki ve onun parentında olan tüm özellikleri
        OTOMATİK olarak sahiplenir.
        child class isterse parent class'lardaki özellikleri sahiplenir. İsterse o bilgileri günceller
        isterse de parent class'larda olan özelliklere ek olarak kendi spesifik özelliklerini oluşturur.
        Child Class ne kadar güncelleme yaparsa özellikleri o kadar kendisine uyarlamış olur.
        Özellikleri kendisine uyarlamazsa paretn class'ın bütün child class'ları kapsayan DAHA GENEL özelliklerini
        sahiplenmiş olur.
         */

    }
}
