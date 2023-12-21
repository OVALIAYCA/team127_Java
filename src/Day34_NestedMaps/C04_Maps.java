package Day34_NestedMaps;

import java.util.Arrays;

public class C04_Maps {
    public static void main(String[] args) {


    /*
    Soru : Verilen bir array’de kullanilan sayilari ve kacar defa kullanildigini yazdirin.
Input : {1,2,3,4,5,3,4,2,5,1,3,2,4,1}
output : 1 kullanimi : 3 adet
 2 kullanimi : 3 adet
 3 kullanimi : 3 adet
 4 kullanimi : 3 adet
 5 kullanimi : 2 adet
     */

    int [] input = {1,2,3,4,5,3,4,2,5,1,3,2,4,1};

    int sayilanSayi;
    int sayac = 0;

    Arrays.sort(input);
        for (int i = 0; i < input.length-1; i++)
        {
            sayilanSayi = input[i];
            if (input[i+1] == input[i])
            {
                sayac++;
            } else
            {
                sayac++;
                System.out.println(sayilanSayi + " : " + sayac + " adet");
                sayac = 0;
            }
        }
        if (input[input.length-1]==input[input.length-2]){
            System.out.println(input[input.length-1] + " : " + (sayac+1) + " adet");
        }
        System.out.println(Arrays.toString(input));
    }
}
