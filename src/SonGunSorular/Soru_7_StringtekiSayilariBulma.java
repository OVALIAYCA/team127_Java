package SonGunSorular;

public class Soru_7_StringtekiSayilariBulma {
    public static void main(String[] args) {

        /*
        Verilen bir metindeki rakamların toplamını yazdıran bir method oluşturun
        ornek: input = Istanbul1453. output = 13
         */
   String input = "Istanbul1453";
   metindekiSayilariTopla(input);
    }

    public static void metindekiSayilariTopla(String metin){

        //1.yol: replaceAll ile digit olmayanları yok edip
        //kalanları int'a parse edip
        //sayının rakamlar toplamını bulabiliriz

       //2.yol : character class'ından methodlar kullanabilirim

       int toplam = 0;
       char karakter;
        for (int i = 0; i <metin.length() ; i++) {

            karakter = metin.charAt(i);

            if (Character.isDigit(karakter)){
                toplam += Character.getNumericValue(karakter);
            }
        }
        System.out.println("Metindeki sayıların toplamı : " + toplam);
    }
}
