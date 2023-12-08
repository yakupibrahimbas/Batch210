package Practice.Practice02;

import java.util.Scanner;

public class C04Ternary {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 1. tam sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen 2.sayiyi giriniz");
        int sayi2= scan.nextInt();

        System.out.println(sayi1==sayi2?("Esit"):(sayi2>sayi1?(sayi2*sayi2):sayi1*sayi1));

    }
}
