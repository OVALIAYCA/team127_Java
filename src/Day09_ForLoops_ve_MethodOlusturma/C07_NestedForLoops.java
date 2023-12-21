package Day09_ForLoops_ve_MethodOlusturma;

public class C07_NestedForLoops {

    public static void main(String[] args) {

        // 1 2 3 4 yazdirin

        for (int i = 1; i <= 4 ; i++) {

            System.out.print(i + " ");
        }

        System.out.println("");

        // 2 4 6 8 yazdirin

        for (int i = 1; i <= 4 ; i++) {

            System.out.print(2*i + " ");

        }

        System.out.println("");

        // 3 6 9 12 yazdirin

        for (int i = 1; i <= 4 ; i++) {

            System.out.print(3*i + " ");

        }
        System.out.println("");

        System.out.println("================");

        // for loop aynı. sadece fark 1*i, 2*i, 3*i olması
        //nested forloop ile çözülür
        //iç içe forloop oluştur. dıştaki loop outer loop- satırları kontrol eder
        //içerdeki loop inner loop - sütunları kontrol eder

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <=4 ; j++) {

                System.out.print(i*j + " ");

            }
            System.out.println("");

        }
    }
}
