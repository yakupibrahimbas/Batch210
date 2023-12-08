package MyPrivateWork;

import java.util.Scanner;

public class Y14 {
    public static void main(String[] args) {
        Scanner gun=new Scanner(System.in);
        System.out.println("Lütfen bir gün girer misin");
String gunIsmi= gun.next();
if (gunIsmi.equalsIgnoreCase("pazar")){
    System.out.println("1");
} else if (gunIsmi.equalsIgnoreCase("pazartesi")) {
    System.out.println("2");
}else if (gunIsmi.equalsIgnoreCase("Salı")) {
    System.out.println("3");
}else if (gunIsmi.equalsIgnoreCase("Çarşamba")) {
    System.out.println("4");
}else if (gunIsmi.equalsIgnoreCase("Perşembe")) {
    System.out.println("5");
}else if (gunIsmi.equalsIgnoreCase("Cuma")) {
    System.out.println("6");
}else if (gunIsmi.equalsIgnoreCase("Cumartesi")) {
    System.out.println("7");

}else
    System.out.println("Lütfen geçerli bir gün giriniz.");
    }
}
