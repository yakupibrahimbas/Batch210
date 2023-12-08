package Practice.Practice09;

public class Utils {
    //pozitif elemanlari filtreleyecek method, eger gelen eleman pozitif ise method true dondursun, degilse false dondursun

    public static boolean pozitifMi(int a){
        return a>0;
    }

    public static boolean ciftMi(int i){
        return i%2==0;
    }
    //ayni satirda bir bosluklu yazdiran method
    public static void yazdir(Object i){
        System.out.println(i+" ");
    }
    public static int kareBul(int i){
        return i*i;
    }
}
