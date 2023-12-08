package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y64 {
    public static void main(String[] args) {
 Scanner input=new Scanner(System.in);
 int fizik,matematik,kimya,turkce,muzik;
        System.out.println("Fizik notunuz   ");
        fizik= input.nextInt();
        System.out.println("Kimya notunuz   ");
        kimya= input.nextInt();
        System.out.println("Matematik notunuz   ");
        matematik= input.nextInt();
        System.out.println("Turkce notunuz   ");
        turkce= input.nextInt();
        System.out.println("Muzik notunuz   ");
        muzik= input.nextInt();
      int  sonuc=(fizik+matematik+turkce+kimya+muzik)/5;
        System.out.println("Ortalama :" +sonuc);










    }
}
