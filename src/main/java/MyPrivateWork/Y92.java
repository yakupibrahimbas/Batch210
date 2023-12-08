package MyPrivateWork;

import java.util.Scanner;

public class Y92 {
    public static void main(String[] args) {
        //nested-for-->icice forlar
      /*  for (int i = 1; i < 5; i++) {
            System.out.println("Week:"+i);
            System.out.println("        Day: 1");
            System.out.println("        Day: 2");
            System.out.println("        Day: 3");
            System.out.println("        Day: 4");
            System.out.println("        Day: 5");
            System.out.println("        Day: 6");
            System.out.println("        Day: 7");

        }

        for (int i = 1; i < 5; i++) {
            System.out.println("Week:"+i);
            for (int j = 1; j < 8; j++) {
                System.out.println("  Day:"+j);
            }
        }*/
        Scanner input=new Scanner(System.in);
        System.out.println("satir gir");
        int satir=input.nextInt();
        System.out.println("sutun gir");
        int sutun=input.nextInt();



        for (int i = 1 ; i <=satir; i++) {
            for (int j = 1; j <=sutun; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
