package Day35_Maps_GenelTekrar;

public class C02_Soru_ForLoop {

    public static void main(String[] args) {

          /*
       Yıldızlar (*) ile baklava deseni oluşturabileceğiniz bir kod yazınız.
       Sonuç böyle olmalıdır;
              *           //enbaşta bırakılan boşlukları hesap ederek başlarız
             * *
            * * *
           * * * *
          * * * * *
           * * * *
            * * *
             * *
              *
          şeklini konsola yazdiriniz.
          */
        int enGenisSatir = 5;

        for (int i = 1; i <= enGenisSatir; i++)
        {

            for (int j = 0; j < enGenisSatir-i ; j++) //başktaki boşluklar için
            {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) // yıldızlar için
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 1; i <= enGenisSatir-1 ; i++) //alt kısım için.
        {
            for (int j = 1; j <= i ; j++) //boşluklar için
            {
                System.out.print(" ");
            }
            for (int j = i; j <=enGenisSatir-1 ; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }




    }
}
