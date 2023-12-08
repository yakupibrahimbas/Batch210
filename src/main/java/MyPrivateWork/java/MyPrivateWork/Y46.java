package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y46 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi= input.nextInt();
        if (sayi<0&&sayi>100){
            System.out.println("gecersiz bir not girdiniz");
    }else if (sayi<50){
            System.out.println("F");
        } else if (sayi<60) {
            System.out.println("D");
        } else if (sayi < 80) {
            System.out.println("C");
        } else if (sayi<90) {
            System.out.println("B");
        } else if (sayi<=100) {
            System.out.println("A");
        }else System.out.println("gecersiz ifade");

    }
}
