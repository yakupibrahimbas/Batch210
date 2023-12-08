package MyPrivateWork;

import java.util.Scanner;

public class Y12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Yaş gir");
        int age=input.nextInt();
        if (age<0){
            System.out.println("geçersiz yaş");
        } else if (age<5) {
            System.out.println("bebek");
        } else if (age<13) {
            System.out.println("çocuk");
        } else if (age<31) {
            System.out.println("yetişkin");
        }else
            System.out.println("tanımlanmamış yaş");
    }
}
