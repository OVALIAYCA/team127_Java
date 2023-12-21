package Day05_NestedIfElse_Ternary_Switch;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C11_SwitchStatementsSoru {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan ISTQB kisaltmasindaki harflerden
        // harfin anlamini ogrenmek istedigini harfi alin ve
        // girilen harfin karsiligini yazdirin.
        // I : International S : Software T : Testing Q : Qualifications B: Board

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ISTQB kisaltmasindan anlamini bilmek istediğiniz harfi giriniz");
        char girilenHarf = scanner.next().charAt(0);

        switch (girilenHarf){

            case 'I' :
            case 'i' :
                System.out.println("International");
                break;
            case 's' :
            case 'S' :
                System.out.println("Software");
                break;
            case 't' :
            case 'T' :
                System.out.println("Testing");
                break;
            case 'q' :
            case 'Q' :
                System.out.println("Qualifications");
                break;
            case 'b' :
            case 'B' :
                System.out.println("Board");
                break;
            default:
                System.out.println("Lütfen kisaltmadaki harflerden birini giriniz");

        }




    }
}
