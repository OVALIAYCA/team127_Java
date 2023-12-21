package Day13_Arrays;

public class C04_Arrays {

    public static void main(String[] args) {

    //Verilen String bir array'de istenen harfi içeren elementleri yazdirin
    String [] isimler = {"Huseyin","Mehmet","Esra","Ercan","Omer"};
    String istenenHarf = "a";

        for (int i = 0; i < isimler.length ; i++) {

            if (isimler[i].contains(istenenHarf)){

                System.out.print(isimler[i] + " "); // Esra Ercan
            }
        }
        System.out.println("    ");

        String istenenHarf2 = "e";
        for (int i = 0; i < isimler.length ; i++) {

            if (isimler[i].contains(istenenHarf2)){

                System.out.print(isimler[i] + " "); //Huseyin Mehmet Omer
            }
        }

    }
}
