package MyPrivateWork.java.d18stringbuilder_accessmodifier_static;

public class Sb01 {
    public static void main(String[] args) {
        String a="Money";
        a=a+"More";

        /*
1=>String'i degistirdikten sonra ayni String'e assign ederseniz Java yine yeni bir container olusturur.
2=>Degismis degeri bu yeni container'in icine koyar ve eski container'i gosteren pointer yeni container'a yonlendirilir
3=>Dolayisiyla eski container adressiz kalir ve "Garbage Collector-cop toplayici"
adressiz olan container'lari siler. GC bellek sızıntılarını önler. GC, Java'nın birçok uygulama için güvenli ve verimli bir dil olmasını sağlayan önemli bir özelliktir.Veri memory'de sahipsiz ve guvenliksiz bir sekilde beklemez.
4=>GC'nin çalışma zamanlaması tamamen JVM (Java Virtual Machine) tarafından kontrol edilir ve uygulamadan bağımsızdır*/


        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        sb1.append("xxxxxxxxxxxxxx");
        sb1.append("Java");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        /*capacity Java'nin size verdigi data depolama yer sayisidir,
        length ise size verilen data depolama yerinin kullanilan kismidir

        ==>Java  baslangic olarak size capacity 16 olarak verir,
        Siz eger verilen bu capacity'i asarsaniz Java yeni capacity'i var olanin 2 katinin 2 fazlasi olacak sekilde ayarlar
        16==> 16*2+2 = 34,  34 ==> 34*2+2 = 70  …..*/

        StringBuilder sb2=new StringBuilder(3);
        StringBuilder sb3 = new StringBuilder(3); //constructor kismina int bir deger yazilirsa capacity degistirilir.
        System.out.println(sb2.append("Alis"));

    }
}
