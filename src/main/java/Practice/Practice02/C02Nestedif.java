package Practice.Practice02;

import java.util.Scanner;

public class C02Nestedif {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir numara giriniz");
        int numara=input.nextInt();

        if(numara<0){
            System.out.println("Negatif Sayi");
        }
        else {
            if (numara<10){
                System.out.println("Rakam");
            }else
                System.out.println("pozitif");
        }
    }
}
