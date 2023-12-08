package MyPrivateWork;

import java.util.Scanner;

public class Y122 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kac km yol aldiniz");
        double km= scan.nextDouble();

        double tutar=10+(2.20*km);
        if (tutar<20){
tutar=20;
        }else{
            System.out.println(tutar);

        }
    }
}
