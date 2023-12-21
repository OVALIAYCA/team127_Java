package Day05_NestedIfElse_Ternary_Switch;

import java.util.Scanner;

public class C09_SwitchStatement {

    public static void main(String[] args) {

   //Kullanicidan girdigi gun numarasina gore
   //gun isimlerini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz");
        int gunNo = scanner.nextInt();

        switch ( gunNo){

            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3 :
                System.out.println("Carşamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;

            default:
                System.out.println("Yanlis gun numarasi");


            //switch de long,double,float ve boolean kullanilmaz
            //calismanin bitmesi için break yazilmalidir
        }

    }
}
