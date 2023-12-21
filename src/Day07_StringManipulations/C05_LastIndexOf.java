package Day07_StringManipulations;

import java.util.Scanner;

public class C05_LastIndexOf {

    public static void main(String[] args) {

        // Verilen bir cumlede
        // aranan bir metin icin asagidaki cumlelerden
        // uygun olani yazdiracak bir program yaziniz
        // - Cumle aranan metni icermiyor
        // - Cumlede aranan metin sadece 1 kere kullanilmis
        // - Cumlede aranan metin sadece 1'den fazla kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen aranan metni giriniz");
        String metin = scanner.nextLine();

        int ilkIndex = cumle.indexOf(metin); // -1 veya index olabilir
        int sonIndex = cumle.lastIndexOf(metin); // -1 veya index olabilir

        if (ilkIndex == -1){
            System.out.println("Cumle aranan metni icermiyor");
        }else if (ilkIndex == sonIndex) {
            System.out.println("Cumlede aranan metin sadece 1 kere kullanilmis");
        }else {
            System.out.println("Cumlede aranan metin sadece 1'den fazla kullanilmis");
        }

        //ikinci index==ilkindex demek birinci -1 değil ikinci de -1 değil demek.




    }
}
