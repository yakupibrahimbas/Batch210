package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y76 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        String harf=scan.next().toLowerCase();
        harf=harf.replaceAll("[aeiou]","e");
        System.out.println(harf.contains(".")||harf.length()!=1?"Lutfen tek bir harf girerek tekrar deneyin":(harf.equals("e")?"sesli harf":"sessiz harf"));

        Scanner input =new Scanner(System.in);
        System.out.println("harf gir");
        String harf2= input.next().toLowerCase();
        harf2=harf2.replaceAll("[aeiou]","e");
        System.out.println(harf2.contains(".")||harf.length()!=1?"Lutfen tek bir harf girerek tekrar deneyin.":harf2.equals("e"));





    }
}
