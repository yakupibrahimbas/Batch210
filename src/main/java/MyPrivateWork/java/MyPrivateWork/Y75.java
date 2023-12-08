package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y75 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz");
        double kilo= input.nextDouble();
        System.out.println("Lutfen boyunuzu giriniz");
        double boy= input.nextDouble();

        double indeks=kilo/(boy*boy);
        System.out.println(indeks);


    }
}
