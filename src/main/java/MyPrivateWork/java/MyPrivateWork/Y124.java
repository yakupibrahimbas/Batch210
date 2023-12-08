package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y124 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen hava sicakligini giriniz");
        Double sicaklik= input.nextDouble();
        if (sicaklik<-40||sicaklik>60){
            System.out.println("Gecerli bir sicaklik giriniz");
        } else if (sicaklik<5) {
            System.out.println("Lutfen kayak yapiniz");
        } else if (sicaklik<25) {
            System.out.println("Lutfen gezmeye gidiniz");
        }else
            System.out.println("Lutfen yuzmeye gidiniz");
    }
}
