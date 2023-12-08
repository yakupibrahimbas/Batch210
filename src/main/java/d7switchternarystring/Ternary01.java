package d7switchternarystring;

import java.util.Objects;
import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        int c = 8;
       int result= c < 0 ? -1 * c : c;
        System.out.println(result);

        int a=-10;
        int b=4;
        Object sonuc=(a>0 &&b>0)||(a<0 && b<0)? a*b:"Farkli isaretleri carpamiyorum";
        System.out.println(sonuc);



    }
}
