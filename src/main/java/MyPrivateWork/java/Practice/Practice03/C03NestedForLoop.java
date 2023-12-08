package MyPrivateWork.java.Practice.Practice03;

public class C03NestedForLoop {
    public static void main(String[] args) {

        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */

int sayi=7;

        for (int i = 0; i < sayi; i++) {//satirlar icin loop olusturduk
            for (int j = 0; j <i; j++) {//sutunlar icin * icin
                System.out.print("* ");

            }
            System.out.println();
        }

        for (int i = sayi-1; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
