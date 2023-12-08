package MyPrivateWork;

public class Y55 {
    public static void main(String[] args) {
        String s = "Tom";

        int a = 12;

        String str1 = new String("merhaba");
        String str2 = new String("merhaba");
        String str3 = str1;

        System.out.println(str1 == str2); //false, cunku iki farkli bellek adresinde iki farkli nesne var
        System.out.println(str1.equals(str2)); //true, cunku icerikleri (degerleri ayni)
        System.out.println(str1 == str3); //true cunku str3, str1'in referansini aliyor.

    }
}
