package Day12_Scope;

public class C06_InstanceVeStaticVariableKullanimi {

    //okul uygulamasi yaptigimiz dusunelim

    static String okulIsmi = "Yildiz Koleji";
    static String mudur = "Fikret Zeybek";
    static String okulAdresi = "Cankaya";
    String ogretmenIsmi = "Isim atanmadi";
    String ogretmenAdresi = "Adres girilmedi";
    String ogretmenTelefonu = "Telefon girilmedi";

    public static void main(String[] args) {

        C06_InstanceVeStaticVariableKullanimi ogr1 = new C06_InstanceVeStaticVariableKullanimi();

        System.out.println(ogr1.ogretmenAdresi); // Adres girilmedi
        ogr1.ogretmenIsmi = "Omer";
        ogr1.ogretmenAdresi = "Kizilay";
        System.out.println(ogr1.mudur); //Fikret Zeybek


        C06_InstanceVeStaticVariableKullanimi ogr2 = new C06_InstanceVeStaticVariableKullanimi();

        System.out.println(ogr2.ogretmenIsmi);  // Isim atanmadi
        ogr2.ogretmenIsmi = "Zeliha";

        C06_InstanceVeStaticVariableKullanimi ogr3 = new C06_InstanceVeStaticVariableKullanimi();


        System.out.println("=========");

        System.out.println(ogr1.ogretmenIsmi); // Omer
        System.out.println(ogr2.ogretmenIsmi); // Zeliha
        System.out.println(ogr3.ogretmenIsmi); // ısım atanmadı

        System.out.println(ogr1.okulIsmi); // yıldız koleji
        System.out.println(ogr2.okulIsmi); // yıldız koleji
        System.out.println(ogr3.okulIsmi); // yıldız koleji

        ogr1.okulAdresi = "Yeni Mahalle";

        System.out.println(okulAdresi);

        //Statik obje değiştiği için hepsi değişir

        System.out.println(ogr2.okulAdresi); // artık Yeni Mahalle olarak yazdırır
        System.out.println(ogr3.okulAdresi); // Yeni Mahalle









    }




}
