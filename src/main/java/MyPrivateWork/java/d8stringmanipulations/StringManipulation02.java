package MyPrivateWork.java.d8stringmanipulations;

import java.util.Scanner;

public class StringManipulation02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String pwd = input.nextLine();
        boolean lengthControl = pwd.length() > 7;
        System.out.println("lengthControl = " + lengthControl);
        System.out.println("---------------");
        boolean spaceControl =pwd.replaceAll("[^ ]","").isEmpty();
        System.out.println("spaceControl = " + spaceControl);

        System.out.println("---------------");
        boolean upperCaseControl=pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("upperCaseControl = " + upperCaseControl);

        System.out.println("---------------");

        boolean lowerCaseControl=pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("lowerCaseControl = " + lowerCaseControl);

        System.out.println("---------------");

        boolean rakamControl=pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("rakamControl = " + rakamControl);

        System.out.println("---------------");

        boolean isValid=lengthControl&&spaceControl&&upperCaseControl&&lowerCaseControl;
        if (isValid){
            System.out.println("Şifre geçerlidir");

        }else {
            System.out.println("şifre geçersizdir.");
        }





    }
}
