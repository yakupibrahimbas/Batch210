package MyPrivateWork.java.d8stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        String s="Learn Java earn 1234 money";
        String s1=s.replace("money" ,"dollar");
        System.out.println(s1);
        //-------------------------------
        System.out.println("-------------------------");
        String s2=s.replace("e"," ");
        System.out.println(s2);
        //-------------------------------
        System.out.println("-------------------------");

        /*
        Meshur Regex'ler: Bir grup data'yi almak icin kullanilir

    1) Tum rakamlar ==> [0-9]
    2) Tum kucuk harfler ==> [a-z]
    3) Tum buyuk harfler ==> [A-Z]
    4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
    5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
    6) Tum noktalama isaretleri ==> \\p{Punct}
    7) Tum sesli harfler ==> [aeiouAEIOU]
       Tum a, x, y harfleri ==> [axy]
 a'dan g'ye tum kucuk ve buyuk harfler: [A-Ga-g]
    8) Tum buyuk harfler haric: ==> [^a-z]
    9) Tum harfler haric ==> [^a-zA-Z]

Bu kisim da [] kullanilmaz. Buyuk harfler olumsuz anlama gelir
    Sadece space karakteri : \\s
    Space karakteri haric  : \\S
    Sadece rakamlar        : \\d  (digit ten geliyor)
    Rakamlar haric         : \\D
*/
        System.out.println("-------------------------");

        String s3=s.replaceAll("[0-9]","*");
        System.out.println(s3);

        System.out.println("-------------------------");

       int num= s.replaceAll("[^0-9]","").length();
        System.out.println(num);




    }
}
