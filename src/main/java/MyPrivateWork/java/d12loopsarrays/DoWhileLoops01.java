package MyPrivateWork.java.d12loopsarrays;

public class DoWhileLoops01 {
    public static void main(String[] args) {
        //Ornek 1: 5(dahil) den 3(dahil) e kadar tamsayilari console’a yazdiriniz

int i=5;
do {
    System.out.println(i);
i--;
}while (i>2);

        System.out.println("-----------------------");

        int k=1;
        while (k<3){
            System.out.println("ben while loop'um");
            k++;
        }
        System.out.println("-------------------");
        int m=1;
        do {
            System.out.println("Ben do while loop'um");
            m++;
        }while (m<1);
    }
}
