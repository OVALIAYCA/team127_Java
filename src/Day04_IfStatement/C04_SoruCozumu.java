package Day04_IfStatement;

import java.util.Scanner;

public class C04_SoruCozumu {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen üçgen için 3 kenar uzunluğu giriniz");

        double a= scanner.nextDouble();
        double b= scanner.nextDouble();
        double c= scanner.nextDouble();

        if(a==b && b==c && a>0) {

            System.out.println("Verilen kenar uzunlukları eşkenar üçgen oluşturur");
            
        }





    }
}
