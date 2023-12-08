package MyPrivateWork;

import java.util.Scanner;

public class Y32 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("no gir");
        int number= input.nextInt();

        if (number<0){
            System.out.println("negatif");
        } else if (number<10) {
            System.out.println("Rakam");
        }else
            System.out.println("pozitif sayi");
    }
}
