package Day29_exceptions_GarbageCollectors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_ParentChildExceptions {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("/Users/aycaergunovali/IdeaProjects/team127_Java/src/Day28_Exceptions1/text.txt");
            int k = 0;
            while ((k = fis.read()) != (-1)) {
                System.out.print((char) k);
            }
        }
        catch(FileNotFoundException e){
                System.out.println("Dosya yolu yanlış");
            }
        catch (IOException e) {
            System.out.println("Dosya okunamıyor");
        }

    }
}
