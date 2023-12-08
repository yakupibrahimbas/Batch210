package MyPrivateWork.java.d16overloading_varrags_passbyvalue_constructors;

public class Varargs {
    public static void main(String[] args) {

        //Variable arguments - degisken sayida argumanlar

        int sonuc = toplama(3,7,10,10,60);
        System.out.println(sonuc);
    }


    public static int toplama(int...a){
        int sum=0;
        for (int w:a){
            sum=sum+w;
        }
        return sum;
    }
}
