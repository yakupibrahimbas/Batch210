package MyPrivateWork.java.d7switchternarystring;

public class Ternary03 {
    public static void main(String[] args) {
        int year = 1800;

        String result = (year%100==0) ? ((year%400==0) ?
                ("Leap year") : ("Leap year değil")) :
                ((year%4==0) ? ("Leap year'dır.") : ("Leap year degildir"));
        System.out.println(result);


    }
}
