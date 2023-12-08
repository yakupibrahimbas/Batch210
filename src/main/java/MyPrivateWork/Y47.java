package MyPrivateWork;

import java.util.Scanner;

public class Y47 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Harf giriniz");
        String harf=scan.next().toLowerCase();
        harf=harf.replaceAll("[^a-zA-Z]","*");
        harf=harf.replaceAll("[aeiou]","e");
        if (harf.contains("*")||harf.length()!=1){
            System.out.println("Lutfen bir harf giriniz");
        } else if (harf.equals("e")) {
            System.out.println("sesli harftir");
        }else System.out.println("sessiz harftir");
    }
}