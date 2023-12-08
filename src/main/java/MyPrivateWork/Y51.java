package MyPrivateWork;

public class Y51 {
    public static void main(String[] args) {
        String cardNum="1234 5678 9012 3456";
        String first=cardNum.substring(0,15).replaceAll("[0-9]","*");
        System.out.println("first");
        String last=cardNum.substring(15);
        System.out.println(last);
        String result=first+last;
        System.out.println(result);



    }
}
