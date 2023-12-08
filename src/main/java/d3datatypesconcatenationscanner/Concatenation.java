package d3datatypesconcatenationscanner;

public class Concatenation {
    public static void main(String[] args) {
        //Örnek1: Bir string ve iki int variable oluşturun. String değeri ile int değeri toplamını
        //console'a yazdırınız.
        String s="elma";
        int a=10;
        int b=11;
        System.out.println(s+a+b);
        System.out.println(s+(a+b));
        System.out.println(s+a*b);
        System.out.println(a+b+s);

    }
}
