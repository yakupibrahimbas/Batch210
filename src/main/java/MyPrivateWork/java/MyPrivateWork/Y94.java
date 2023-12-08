package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y94 {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("carpim tablosu");
        int sayi= input.nextInt();
        int i=1;
        while (i<11){
            System.out.println(sayi+"X"+i+"="+(sayi*i));
            i++;
        }

    }
}
