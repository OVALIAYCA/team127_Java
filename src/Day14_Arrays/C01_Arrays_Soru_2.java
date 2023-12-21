package Day14_Arrays;

public class C01_Arrays_Soru_2 {

    public static void main(String[] args) {

        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        //sonucu bize donduren bir method yaziniz.

        int[] arr = {20,-12,45,-3,23,10};

        System.out.println(pozitifSayilariTopla(arr));

    }

    public static int pozitifSayilariTopla(int [] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0){

                toplam += arr[i];

            }
        }
        return toplam;
    }
}
