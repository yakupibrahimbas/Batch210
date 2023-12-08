package Practice.Practice06.inheritance01;

public class Child extends Parent{
    public static void main(String[] args) {

        System.out.println("Parent.isim = " + Parent.isim);
        //Math.max(1,2);
        Parent.method1();
        System.out.println(isim);
        method1();
        method2();

        Child obj1=new Child();
        System.out.println("obj1.yas = " + obj1.yas);

        Parent obj2=new Parent();
        System.out.println("obj2.yas = " + obj2.yas);
        obj2.method4();
    }
}
