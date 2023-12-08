package Practice.Practice03;

import java.util.Scanner;

public class C01ForLoop {
    public static void main(String[] args) {
        /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */
        Scanner scan=new Scanner(System.in);
        System.out.println("kelime gir");
        String kelime=scan.next().toLowerCase();

        int sayac=0;

        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i)=='c'){
                break;

            } else if (kelime.charAt(i)=='a') {
                sayac++;
            }
        }
        System.out.println(sayac);

    }
}
