package Day24_inheritance_constructorCall;

public class F_Corolla extends E_Toyota {

    String model = "Corolla";
    String uretimYeri ="Türkiye";
    String lastik = "Pirelli Sakarya";
    String aku = "İnci Akü";


    String tekerCapi = "19 inc";
    String guvenlik = "Safe Drive";
    String bagajHacmi = "200 litre";

    F_Corolla(){
        super(); // parenttaki parametesiz constructor ı çalıştır diyor.
    }

    public static void main(String[] args) {

        F_Corolla corolla1 = new F_Corolla();

        System.out.println(corolla1.marka); //Toyota ---- Toyota class'ından
        System.out.println(corolla1.model); // Corolla --- Corolla class'ından
        System.out.println(corolla1.renk); // Renk atanmamış ---- Car class'ından
        System.out.println(corolla1.yakit); //Yakıt türü atanmamış ---Car class'ından
        System.out.println(corolla1.uretimYeri); // Türkiye ---- Corolla class'ından
        System.out.println(corolla1.sanziman); // Otomatik veya manuel --- Toyota class'ından
        System.out.println(corolla1.lastik); // Pirelli Sakarya --- Corolla class'ından
        System.out.println(corolla1.tekerCapi); // 19 inc --- Corolla class'ından
        System.out.println(corolla1.guvenlik); // Safe Drive ---- Corolla class'ından
        System.out.println(corolla1.aku); // İnci Akü ---- Corolla class'ından
        System.out.println(corolla1.bagajHacmi); // 200 litre ---- Corolla class'ından
    }




}
