package MyPrivateWork;

import java.util.Scanner;

public class Y26 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Yarıçap giriniz");
        double r= input.nextDouble();
        System.out.println("dairenin cevresi:"+(2*Math.PI*r));
        System.out.println("dairenin alani:"+(Math.PI*r*r));

    }
}
