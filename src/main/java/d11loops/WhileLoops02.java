package d11loops;

import java.util.Scanner;

public class WhileLoops02 {
    public static void main(String[] args) {
/*
        3 ==> 3x1=3
        3x2=6
        3x3=9
        3x4=12 …
        3x10=30 */
        Scanner inpu=new Scanner(System.in);
        System.out.println("Lutfen carpim tablosunu gormek icin bir sayi giriniz");
        int num= inpu.nextInt();

        int i=1;
        while (i<11){
            System.out.println(num+"x"+i+"="+(num*i));
            i++;
        }
    }
}
