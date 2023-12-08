package d15arraylist_methodcreation_overloading;

public class MethodCreations01 {
    public static void main(String[] args) {
        /*Java da Method Olusturma: Java'da bir metot (örneğin main metodu) içinde başka bir metot tanımlanamaz.

Ancak bir metod içinde (mesela main), bir iç Class (nested class veya inner class) tanımlanabilir ve bu iç class'in içinde metotlar tanımlanabilir. Ancak LocalInnerClass yalnızca main metodu içinde geçerli ve erişilebilir olduğu için, main dışında bir yerde kullanılamaz. */

toplama(3,5);


    }//main method kapanisi
    //Ornek1:toplama islemi yapam bir method olusturunuz.

    public static int toplama(int a,int b){
        return  a+b;
    }
    //Ornek2:
}
