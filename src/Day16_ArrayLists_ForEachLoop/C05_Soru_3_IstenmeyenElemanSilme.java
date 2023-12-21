package Day16_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C05_Soru_3_IstenmeyenElemanSilme {

    public static void main(String[] args) {

        //Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip,
        //kalan kismini list olarak bize donduren bir method olusturun

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");
        isimler.add("Ayca");

        String silinecekHarf = "a";

        System.out.println(istenmeyenleriSil(isimler, silinecekHarf));
        System.out.println(istenmeyenleriSilKalanlariKaydet(isimler, silinecekHarf));
        System.out.println(istenmeyenleriSilKalanlariKaydet2(isimler,silinecekHarf));

    }
    public static List<String> istenmeyenleriSil(List<String> isimler, String silinecekHarf){

        for (int i = 0; i < isimler.size() ; i++) {

            if (isimler.get(i).toUpperCase().contains(silinecekHarf.toUpperCase())){

                isimler.remove(isimler.get(i));
                i--; // silinen indeks olursa onun yerine gelecek indeksi kontrol etmesi için
                //1 eksiltme yaptık
            }

        }
        return isimler;

        // yada yeni bir list oluşturup silinmeyecek elemanlar yeni listeye eklenir.
    }
    public static List<String> istenmeyenleriSilKalanlariKaydet(List<String> isimler, String silinecekHarf ) {

        List<String> silinmeyeceklerListesi = new ArrayList<>();

        for (int i = 0; i < isimler.size() ; i++) {

             /*
            if (isimler.get(i).toUpperCase().contains(silinecekHarf.toUpperCase())){

                isimler.remove(isimler.get(i));
                i--;
            }
            yerine aşağıdaki yapıyı kullanabilirz

             */


            if (!isimler.get(i).toUpperCase().contains(silinecekHarf.toUpperCase())){
                silinmeyeceklerListesi.add(isimler.get(i));
            }
        }
        return silinmeyeceklerListesi;
        }

        public static List<String> istenmeyenleriSilKalanlariKaydet2 (List<String> isimler, String silinecekHarf){

            List<String> silinmeyeceklerListesi = new ArrayList<>();
            for (String each : isimler) {


                if (!each.toUpperCase().contains(silinecekHarf.toUpperCase())) {
                    silinmeyeceklerListesi.add(each);
                }

            }
            return silinmeyeceklerListesi;
        }
    }


