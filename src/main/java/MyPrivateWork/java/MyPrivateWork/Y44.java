package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y44 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Cumle yaziniz");
        String cumle= scan.nextLine();
        cumle=cumle.toUpperCase().charAt(0)+cumle.substring(1);
if (cumle.endsWith(".")){
    System.out.println(cumle);
}if (!cumle.endsWith("."))
        System.out.println(cumle+".");
    }
}
