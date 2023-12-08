package MyPrivateWork.java.Practice.Practice06;

public class C03_StaticKeyword {


    //Bir classta instance, static, local ve loop variablelar olusturunuz
    //instance ve static 2 method olusturunuz
    //main method içinde 2 tane obje olusturunuz, variableları yazdırınız
    //static variable degerini artırınız
    //obj1 inst varb degerini guncelleyiniz
    //obj1, obj2'in ins ve static variablelarını yazdırınız
    //obj2'nin instance ve static variable artırınız
    //obj1, obj2'in ins ve static variablelarını yazdırınız

    int instanceSayi;
    static int staticSayi;

    public void instanceMethod() {

    }

    public static void staticMethod() {

    }

    public static void main(String[] args) {

        int localSayi = 0;
        for (int i = 0; i < 2; i++) {

        }
        C03_StaticKeyword obj1 = new C03_StaticKeyword();
        C03_StaticKeyword obj2 = new C03_StaticKeyword();

        System.out.println(staticSayi);
        System.out.println(obj1.instanceSayi);
        staticSayi++;
        obj1.instanceSayi++;
        System.out.println(staticSayi);
        System.out.println("obj1.instanceSayi = " + obj1.instanceSayi);
        System.out.println("obj2.instanceSayi = " + obj2.instanceSayi);
        System.out.println("obj1.staticSayi = " + obj1.staticSayi);
        obj2.staticSayi++;
        System.out.println(staticSayi);

        obj2.instanceSayi++;
        System.out.println(obj1.instanceSayi);
        staticMethod();
        obj1.instanceMethod();

                /*
        Aynı classtaki static bir method icinden;
          1-static fieldlar direk cagrılır,
          2-instance fieldlar obje ile cagrılır

        Aynı classtaki instance method icinden;
          1- static fieldlar direk cagrılır
          2-instance fieldlar direk cagrılabilir

        Farklı class static method icinden
          1- static fieldlar class ismi ile cagrılır
          2- instance fieldlar obje ile cagrılır

          Farklı class instance method icinden
          1- static fieldlar class ismi ile cagrılır
          2- instance fieldlar obje ile cagrılır
         */

    }
}
