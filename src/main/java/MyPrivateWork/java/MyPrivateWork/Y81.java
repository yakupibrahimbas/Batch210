package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y81 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Domates Miktari");
        double domates= input.nextDouble();
        System.out.println("salatalik miktari");
        double salatalik= input.nextDouble();
        System.out.println("biber miktari");
        double biber=input.nextDouble();


        double domatesfiyat=11.25;
        double salatafiyat=20.15;
        double biberFiyat=30.50;

        double total=((domates*domatesfiyat)+(salatalik*salatafiyat)+(biber*biberFiyat));
        System.out.println("total = " + total);
    }
}
