package MyPrivateWork.java.d18stringbuilder_accessmodifier_static;

public class Student2 {
    /*
1) static variable veya static methodlar (class member) tum object'ler icin ortak elemandir
2) static class member'lar uzerinde yapilan degisiklikler tum objectleri etkiler.
3) static class member'lar class'a, non-static class memberlar objectler'e aittir
4) static class memberlar'a ulasmak icin object olusturmaya gerek duyulmaz,
    ama non-static class memberlar'a ulasmak icin object olusturmak sarttir
5) static variable'larin diger adi class variable'dir,
    non-static variable'larin diger adi instance variable veya object variable'dir
 */
    public static String stdName="Ali Can";
    public int age=18;
    public static void staticMethod(){
        System.out.println("Ben Static bir methodum");

    }
    public void nonStaticMethod(){
        System.out.println();
    }


}
