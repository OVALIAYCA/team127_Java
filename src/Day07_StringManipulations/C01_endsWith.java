package Day07_StringManipulations;

import java.util.Scanner;

public class C01_endsWith {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String mail = scanner.nextLine();
        
        if (!mail.contains("@")){

            System.out.println("Gecersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
            
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
            
        }
    }
}
