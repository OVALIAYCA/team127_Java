package Day05_NestedIfElse_Ternary_Switch;

import java.util.Scanner;

public class C10_SwitchStatements {

    public static void main(String[] args) {

        //Kullanicidan gun numarasini alip haftaici ya da
        //hafta sonu yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz");
        int gunNo = scanner.nextInt();

        switch ( gunNo){

            case 1 :
                System.out.println("Hafta ici");
            case 2 :
                System.out.println("Hafta ici");
            case 3 :
                System.out.println("Hafta ici");
            case 4 :
                System.out.println("Hafta ici");
            case 5 :
                System.out.println("Hafta ici");
                break;
            case 6 :
                System.out.println("Hafta sonu");
            case 7 :
                System.out.println("Hafta sonu");
                break;

            default:
                System.out.println("Yanlis gun numarasi");}
    }
}
