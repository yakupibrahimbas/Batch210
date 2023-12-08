package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y65 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double price,total,kdvPrice=18;
        double rate=18;
        System.out.print("Tutar giriniz:  ");
        price=scan.nextDouble();
        kdvPrice=price*(rate/100);
        total=price+kdvPrice;
        System.out.println("Kdv orani: %"+ rate);
        System.out.println("KDV tutari : " + kdvPrice);
        System.out.println("KDV'li tutar : " + total);









    }
}
