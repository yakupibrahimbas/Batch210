package MyPrivateWork.java.MyPrivateWork;

public class Y52 {
    public static void main(String[] args) {
        String pwd="a";
        boolean first=pwd.isEmpty();
        System.out.println(first);
        boolean second=pwd.isBlank();
        System.out.println(second);
        boolean third=pwd.trim().equals(pwd);
        System.out.println(third);
        if (first){
            System.out.println("parola bos birakilamaz");
        }if (second){
            System.out.println("parola bos birakilmamali ve bosluk haric ifadeler girilmeli");
        }if (!third){
            System.out.println("Parolanin basinda yada sonunda bosluk birakilmamalidir.");
        }
    }
}
