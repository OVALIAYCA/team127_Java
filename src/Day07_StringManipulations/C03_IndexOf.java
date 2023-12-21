package Day07_StringManipulations;

import java.util.Scanner;

public class C03_IndexOf {
    public static void main(String[] args) {

        // Verilen bir cumlede
        // aranan bir metin icin asagidaki cumlelerden
        // uygun olani yazdiracak bir program yaziniz
        // - Cumle aranan metni icermiyor
        // - Cumlede aranan metin sadece 1 kere kullanilmis
        // - Cumlede aranan metin sadece 2 kere kullanilmis
        // - Cumlede aranan metin 2'den fazla kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen aranan metni giriniz");
        String metin = scanner.nextLine();

        int ilkIndex = 0;
        int ikinciIndex = 0;
        int ucuncuIndex = 0;

        ilkIndex = cumle.indexOf(metin); // -1 veya index olarak verir

        if (ilkIndex == -1){
            System.out.println("Cumle aranan metni icermiyor");

        } else if ((ikinciIndex =  cumle.indexOf(metin,ilkIndex+1)) == -1) {
            System.out.println("Cumlede aranan metin sadece 1 kere kullanilmis");

        } else  {
            ucuncuIndex = cumle.indexOf(metin,ikinciIndex+1);

            if (ucuncuIndex == -1){
                System.out.println("Cumlede aranan metin sadece 2 kere kullanilmis");
            }else {
                System.out.println("Cumlede aranan metin 2'den fazla kullanilmis");
            }
            // açıklamasını screenshot olarak aldım. indexof soru cozumu olarak


        }

    }
}
