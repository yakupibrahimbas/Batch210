package MyPrivateWork.java.Practice.Practice05;

public class C05Varargs {
    public static void main(String[] args) {

        // kac tane kelime verilirse verilsin
        // iclerinden en uzun olanı yazdıran bir method olusturun

        String str1="Ali";
        String str2="Rıdvan";
        String str3="Aysel";
        String str4="Kerem";
        String str5="Mustafa";
        enUznunKelimeYazdir(str1,str2,str3,str4,str5);
        

    }

    private static void enUznunKelimeYazdir(String...str) {

        String enUzunKelime="";
        for (String each:str){
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println(enUzunKelime);
    }
}
