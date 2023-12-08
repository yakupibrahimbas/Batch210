package MyPrivateWork.java.d16overloading_varrags_passbyvalue_constructors;

public class PassByValuePassByReference {
    public static void main(String[] args) {

       /*Pass by Value (Değer ile Geçiş):

Bir değişkenin değerini, yani veriyi, bir metoda parametre olarak ilettiğinizde, aslında o değişkenin bir kopyasını iletirsiniz. Metodun içinde bu kopya değiştirilse bile, orijinal değişkenin değeri değişmez. Degisken ve Object'lerin adreslerinin (reference) kopyasinda calisilir. */

            int x=3;
            int y=5;

            add(x,y);


    }
    public static int add(int a, int b){
        return a + b;
    }
}
