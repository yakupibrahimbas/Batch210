package MyPrivateWork;

import java.util.Scanner;

public class Y85 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Ürün tutarını giriniz");
        double tutar= scan.nextDouble();
        double kdvTutar=tutar*18/100;
        System.out.println("kdvTutar = " + kdvTutar);
        if (kdvTutar<50){
            System.out.println("vergi odeme");
        }else System.out.println("vergi ode");

    }
}
