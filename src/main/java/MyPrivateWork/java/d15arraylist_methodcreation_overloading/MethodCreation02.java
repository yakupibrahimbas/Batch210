package MyPrivateWork.java.d15arraylist_methodcreation_overloading;

public class MethodCreation02 {
    public static void main(String[] args) {
        int sonuc1 = carpma(3, 5);
        System.out.println("sonuc1 = " + sonuc1);
    }

    //Örnek: 2 Sayiyi carpan bir method olusturunuz.
    //Protected bu classtan erisilebilir
    int sonuc3 = carpTopla(4, 4, 2);


    protected static int carpma(int a, int b) {
        return a * b;
    }

    private static int carpTopla(int a, int b, int c) {
        return a * b + c;
    }
}

