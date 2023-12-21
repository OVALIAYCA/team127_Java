package Day17_Constructors;

public class C04_HemsireRunner {

    public static void main(String[] args) {

        C03_Hemsire hemsire1= new C03_Hemsire();

        hemsire1.hemsireAdi = "Esra";
        hemsire1.hemsireAdresi = "Yenimahalle";



        C03_Hemsire hemsire2= new C03_Hemsire();
        System.out.println(hemsire2.hemsireTelefonu); //null
        //henüz değer atanmadi çünkü


        System.out.println(new C03_Hemsire().hemsireAdresi); // null
        //isim vermediğimiz için bir daha bu objeyi kullanamayız
        //heap memory kısmında boşlukta durur
        //Javadaki Garbage Collector tarafından toplanıp yok edilir.



        C03_Hemsire hemsire3; // deklarasyondur.değer atamasi olmadığı için yazdırmaz
        //System.out.println(hemsire3.hemsireAdresi);
        //initialize yapılmadı.

        // hemsire3.method1(); hemşire 3'e değer atamadın ki ona bir method çağırasın.İzin vermiyor. Önce değer ata
        //sonra kullan diyor


    }
}
