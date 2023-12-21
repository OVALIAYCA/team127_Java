package Day05_NestedIfElse_Ternary_Switch;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C06_TernarySoru {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

 Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen üçgenin üç kenar uzunluğunu giriniz");
 double kenar1 = scanner.nextDouble();
 double kenar2 = scanner.nextDouble();
 double kenar3 = scanner.nextDouble();

        System.out.println( kenar1 == kenar2 && kenar2 == kenar3 && kenar1>0
                ?
                "Eskenar Üçgen"
                :
                "Eskenar degildir");



    }
}
