package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y90 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("daire yaricapi giriniz");
        int r=scan.nextInt();

        double alan=Math.PI*r*r;
        double cevre=2*Math.PI*r;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


    }
}
