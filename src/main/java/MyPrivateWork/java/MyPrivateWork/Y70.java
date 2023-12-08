package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y70 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=input.nextInt();
        if (yas<18){
            System.out.println("buyu de gel");
        } else if (yas>17) {
            System.out.println("lutfen kilonuzu giriniz");
            double kilo= input.nextDouble();
            if (kilo<50){
                System.out.println("kan veremezsiniz");
            }else System.out.println("kan bagisi yapabilirsiniz");
        }


    }
}
