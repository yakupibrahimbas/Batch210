package MyPrivateWork;

import java.util.Scanner;

public class Y97 {
    public static void main(String[] args) {

       Scanner input=new Scanner(System.in);
       int counter=0;
       do {
           if (counter==4){
               System.out.println("hesabiniz bloke olmustur");
               break;
           }
           System.out.println("Lutfen userName'i giriniz");
           String userName=input.next();
           System.out.println("Lutfen Password girin");
           String password=input.next();
           if (userName.equals("admin")&&password.equals("1234")){
               System.out.println("hesabina hosgeldin");
               break;
           }
           counter++;
       }while (true);
    }
}
