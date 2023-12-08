package MyPrivateWork.java.d11loops;

public class ForLoops01 {
    public static void main(String[] args) {
        int toplam = 0;
        for (int i = 6; i < 11; i++) {
            toplam = toplam + i;

        }
        System.out.println(toplam);

        //--------------------------
        int carpim = 1;
        for (int i = 10; i > 6; i--) {
            carpim = carpim * i;
        }
        System.out.println(carpim);


    }
}
