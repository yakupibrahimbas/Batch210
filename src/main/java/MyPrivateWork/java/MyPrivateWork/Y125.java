package MyPrivateWork.java.MyPrivateWork;

public class Y125 {
    public static void main(String[] args) {
        int a=10;
        int b=200;
        int c=300;

        if (a<b&&a<c&&b<c){
            System.out.println("a<b<c");
        } else if (a>b&&a>c&&b>c) {
            System.out.println("a>b>c");
        } else if (b>a&&b>c) {
            System.out.println("b>c>a");
        }
    }
}
