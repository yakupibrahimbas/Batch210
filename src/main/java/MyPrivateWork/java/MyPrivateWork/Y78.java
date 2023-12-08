package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y78 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String pwd=input.nextLine();
        boolean lengthControl=pwd.length()>7;
        System.out.println(lengthControl);
        boolean spaceControl=pwd.replaceAll("^ ","").length()==0;
        boolean spacecontrol=pwd.replaceAll("[^ ]","").isEmpty();
        System.out.println("SpaceControl="+spaceControl);
        boolean upperCaseControl=pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("upperCaseControl = " + upperCaseControl);
        boolean lowerCaseControl=pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("lowerCaseControl = " + lowerCaseControl);
        boolean digitControl=pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("digitControl = " + digitControl);
        boolean isValid=lengthControl&&spaceControl&&upperCaseControl&&lowerCaseControl&&digitControl;

        if (isValid){
            System.out.println("Sifre gecerlidir");
        }else {
            System.out.println("Sifre gecersizdir");
        }

    }
}
