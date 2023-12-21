package Day28_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        /*
        Checked exceptions daha çok dosya okuma  veya
        dosyaya bilgi kaydetme ile ilgilidir.
        javada bu işlemlere input/output dendiğinden
        exception olarak IOException ve child classları oluşturulmuştur
         */

        String dosyaYolu = "/Users/aycaergunovali/IdeaProjects/team127_Java/src/Day28_Exceptions/text.txt";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        /*
        Unhandled exception: java.io.FileNotFoundException
        CheckedExceptions kod çalışmadan riskli olan kodlarda bizi uyarır
        Bu konuda insiyatif bizdedir
        1-İstersek bu satırı try-catch ile handle eder
        ve exception oluşsa da yoluna devam etmesini sağlarız
        2- veya exception oluştuğunda kodun durmasını istiyorsa
        sadece altındaki kırmızı çizginin gitmesini ve çalışmasını
        istiyorsak method deklarasyonunun yanına bu riskin farkında olduğumuzu
        ve bu methodun belirtilen exception'ı fırlatabileceğini yazarız
        */


    }
}
