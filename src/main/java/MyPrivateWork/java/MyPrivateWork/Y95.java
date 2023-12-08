package MyPrivateWork.java.MyPrivateWork;

public class Y95 {
    public static void main(String[] args) {
        int k=312;
        String m=String.valueOf(k);
        String reversed="";
        int n=m.length()-1;
        while (n>=0){
        reversed=reversed+m.charAt(n);
        n--;
        }
        System.out.println(reversed);
        if (m.equals(reversed)){
            System.out.println("palindromdur");
        }else{
            System.out.println("Palindrom degildir");

        }
    }
}
