package MyPrivateWork.java.MyPrivateWork;

public class Y29 {
    public static void main(String[] args) {
        String s="Learn Java earn 1111 Money";

        String s1=s.replace("Money","dollar");
        System.out.println(s1);
        String s2=s.replace("e"," ");
        System.out.println(s2);
        String s3=s.replaceAll("[0-9]","*");
        System.out.println(s3);
        int num = s.replaceAll("[^0-9]", "").length();
        System.out.println(num); //4
    }
}
