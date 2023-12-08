package MyPrivateWork;

import java.util.Scanner;

public class Y123 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1.sayi");
        double sayi1= input.nextDouble();
        System.out.println("2.sayi");
        double sayi2= input.nextDouble();
        System.out.println("Lutfen Yapacak Oldugunuz Islemi Seciniz: 1:+,2:-,3:*,4:/");
        int islem= input.nextInt();
        if (islem<1||islem>4){
            System.out.println("Lutfen gecerli bir islem giriniz");
        }


        switch (islem){
            case 1:
                System.out.println(sayi1+sayi2);break;
            case 2:
                System.out.println(sayi1-sayi2);break;
            case 3:
                System.out.println(sayi1*sayi2);break;
            case 4:
                System.out.println(sayi1/sayi2);
        }

    }
}
