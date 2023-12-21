package Day22_stringBuilder_accessModifier_encapsulation;

public class SlaytSoru {

    public static void main(String[] args) {

        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1,2).length(); //b ve length 1
        total += letters.substring(6,6).length(); // hiçlik getirir. 0 olur lenght değeri
        total += letters.substring(6,5).length(); //çalışınca hata görünür. run time error.


        System.out.println(total);

    }
}
