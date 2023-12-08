package MyPrivateWork;

import java.util.Scanner;

public class Y63 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int counter=0;
       do {
           if (counter==4){
               System.out.println("hesabiniz bloke olmustur");
               break;

           }
           System.out.println("ad");
           String ad= input.next();
           System.out.println("sifre");
           String sifre=input.next();
           if (ad.equals("admin")&&sifre.equals("1234pwd")){
               System.out.println("hesabiniza hos geldiniz");
               counter++;
           }break;

       }while (true);


    }
}
