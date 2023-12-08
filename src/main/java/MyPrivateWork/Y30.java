package MyPrivateWork;

import java.util.Scanner;

public class Y30 {
    public static void main(String[] args) {

     String tv="$456.99";
     String laptop="$875.99";
     tv=tv.replace("$","");
     laptop=laptop.replace("$","");
     Double totalPrice=Double.valueOf(tv)+Double.valueOf(laptop);
        System.out.println(totalPrice);
        String name="  ali      cAN    ";
        char first=name.trim().toUpperCase().charAt(0);
        System.out.println(first);
        char last=name.trim().toUpperCase().split("\\s+")[1].charAt(0);
        System.out.println(last);
        System.out.println(""+first+last);
        String a="abc@gmail.com";
        System.out.println(a.substring(4,9));
        String company1=a.split("c")[1].split("\\.")[0];
        System.out.println(company1);
        int startingIndex=a.indexOf("@")+1;
        int endingIndex=a.indexOf(".");
        String companyName=a.substring(startingIndex,endingIndex);
        System.out.println(companyName);

    }
}
