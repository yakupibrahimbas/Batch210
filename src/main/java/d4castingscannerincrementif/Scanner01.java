package d4castingscannerincrementif;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Scanner class'i kullanıcıdan veya farklı kaynaktan girdi (input) almanın kolay bir yoludur.
        //Çeşitli veri tipleri girdisi (int,float) alabilirsiniz.
        // Çeşitli methodları vardır.

        //1.adım: Scanner class'tan object oluşturun

        Scanner giris = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");

        byte age = giris.nextByte();
        System.out.println(age);


    }
}
