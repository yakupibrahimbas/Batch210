package MyPrivateWork.java.d27exceptions_enum_iterators;

import java.io.FileInputStream;
import java.io.IOException;

public class E01 {
    public static void main(String[] args) {

        //Not:bir onceki uygulamamizda method signature icine exception eklemesi yaptik. Bu seferde try-catch kullanalim


        try {
            FileInputStream fis = new FileInputStream("src/main/java/d26exceptions/file.txt");
            int k = 0;
            while ((k = fis.read()) != -1) {

                System.out.print((char) k);

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        /*
1) FileNotFoundException ve IOException Compile Time Exception'lardir. Yani kodu yazarken hata aliriz.
2) IOException Class, FileNotFoundException class'in parent'idir yani
  istenirse FileNotFoundException yerine IOException'da kullanilabilir
3) IOException ve FileNotFoundException beraber kullanilacak ise FileNotFoundException üstte olmalidir
 */

    }
}