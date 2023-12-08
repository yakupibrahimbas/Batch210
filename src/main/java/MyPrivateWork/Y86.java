package MyPrivateWork;


import java.util.Scanner;

public class Y86 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("gun gir");
        int gun= input.nextInt();
        switch (gun){
            case 1:
                System.out.println("Pazartesi");break;
            case 2:
                System.out.println("Sali");break;
            case 3:
                System.out.println("Carsamba");break;
            case 4:
                System.out.println("Persembe");break;
            case 5:
                System.out.println("Cuma");break;
            case 6:
                System.out.println("Cumartesi");break;
            case 7:
                System.out.println("Pazar");break;
        }
        if (gun>0&&gun<8){
            System.out.println("");
        }else System.out.println("hatali gun girdiniz");



        }

    }

