package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y10 {
    public static void main(String[] args) {
        Scanner yas=new Scanner(System.in);
        System.out.println("Yaş giriniz.");
        int yasiniz= yas.nextInt();
        if (yasiniz<=0&&yasiniz<=4){
            System.out.println("bebek");
        } else if (yasiniz<=5&&yasiniz<=12) {
            System.out.println("çocuk");
        }
        else if (yasiniz<=13&&yasiniz<=20) {
            System.out.println("yetişkin");

        }else
            System.out.println("tanımlanmamış");
    }
}
