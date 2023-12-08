package MyPrivateWork;

import java.util.Scanner;

public class Y60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Satir gir");
        int satir = input.nextInt();
        System.out.println("Sutun gir");
        int sutun = input.nextInt();
        for (int i = 1; i <=satir; i++) {
            for (int j = 1; j < sutun; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
                }

            }



