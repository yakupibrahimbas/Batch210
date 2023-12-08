package MyPrivateWork;

import java.util.Scanner;

public class Y73 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen uzun kenari giriniz");
        int uzunKenar= input.nextInt();
        System.out.println("Kisa kenari giriniz");
        int kisaKenar= input.nextInt();

        if (kisaKenar>uzunKenar){

            System.out.println("gecerli bir ifade giriniz");

        }


        System.out.println("Hipotenus = " + Math.sqrt(uzunKenar*uzunKenar+kisaKenar*kisaKenar));


    }
}
