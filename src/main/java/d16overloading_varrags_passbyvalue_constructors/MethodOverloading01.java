package d16overloading_varrags_passbyvalue_constructors;

public class MethodOverloading01 {
    public static void main(String[] args) {
//Polymorphism - Cok Bicimlilik
        //Method Overloading (static polymorphism) + Method Overriding (dynamic polymorphism)
        //Bir method'u, istedigimiz sonuclari alacak sekilde, farkli farkli sekillerde calistirabilmek icin kullanilir

        //i. Method Overloading (Asiri Yukleme)
        //String s = "Java";
        //s.substring(int beginIndex); //substring non-static bir metottur
        //s.substring(int beginIndex, int endIndex);

        add(3.5,5);


    } //main disi

    //ornek : Toplama islemi yapan bir method olusturalim ve sonrada onu overload edelim
  /*  public static void add(int a, int b){
        System.out.println(a + b); //8
    }*/
    public static void add(double a, double b){
        System.out.println(a + b);
    }
    public static void add(double a, int b){
        System.out.println(a + b);
    }


}