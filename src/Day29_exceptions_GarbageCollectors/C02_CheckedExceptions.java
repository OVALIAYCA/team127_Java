package Day29_exceptions_GarbageCollectors;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_CheckedExceptions {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("/Users/aycaergunovali/IdeaProjects/team127_Java/src/Day28_Exceptions/text.txt");
        int k = 0;
        while ((k = fis.read() ) != (-1)){
            System.out.print((char) k);

            //FileNotFoundException yerine IOExceptions geldi geniş kapsamlı exceptions geliyor
            //read kısmındaki hata kalkıyor.

        }

    }
}
