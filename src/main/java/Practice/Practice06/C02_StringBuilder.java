package Practice.Practice06;

public class C02_StringBuilder {
    public static void main(String[] args) {
                    /*
        kapasitesi 7 olan bir stringbuilder objesi olusturun, capacity, lenght yazdırın
        "hava guzel" verisini ekleyin, yazdırın
        sbdeki boslugu silin
        sb'yi ters cevirin
        sbnin son 4 karakterini silin
        sbyi tekrar ters cevirin ve "Java guzel" yazısını elde edin
         *

             */
        StringBuilder sb1=new StringBuilder(7);
        System.out.println("sb1.capacity() = " + sb1.capacity());
        System.out.println("sb1.length() = " + sb1.length());
        sb1.append("hava guzel");
        System.out.println(sb1);
      /*  String str="merhaba";
        str.substring(5);
        System.out.println(str); */

       int idx= sb1.indexOf(" ");
        sb1.deleteCharAt(idx);
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);
        sb1.delete(sb1.length()-4,sb1.length());
        System.out.println(sb1);
        sb1.reverse();
        sb1.insert(0,"Java");
        System.out.println(sb1);

        System.out.println("sb1.capacity()="+sb1.capacity());
        sb1.append("Java guzel");
        System.out.println("sb1.capacity() = " + sb1.capacity());

    }
}
