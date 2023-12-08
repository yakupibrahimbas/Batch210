package MyPrivateWork.java.MyPrivateWork;

public class y54 {
    public static void main(String[] args) {
       String pwd="12345 ";
       boolean first=pwd.isEmpty();
       boolean second=pwd.isBlank();
       boolean third=pwd.trim().equals(pwd);
       if (first){
           System.out.println("parola bos olmamalidir.");
       } if (second){
            System.out.println("karakterler sadece spaceden ibaret oolmamali");
        }if (!third){
            System.out.println("basinda ve sonunda bosluk olmamalidir");
        }

       }
    }

