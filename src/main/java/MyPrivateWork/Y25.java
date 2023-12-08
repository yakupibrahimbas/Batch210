package MyPrivateWork;

import java.util.Scanner;

public class Y25 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz");
        int sayi1= input.nextInt();
        int sayi2= input.nextInt();

        System.out.println(sayi1+sayi2);
        System.out.println(sayi1*sayi2);
        System.out.println(sayi1/sayi2);
        System.out.println(sayi1-sayi2);

    }
}
