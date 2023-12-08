package MyPrivateWork.java.d26exceptions;

public class E06 {
    public static void main(String[] args) {

        //5) NullPointerException:(bos isaretcisi) Null degerindeki bir variable referans olarak kullanildiginda olusur

        String s="Java";
        karakterSayisi(s);
        String t="";
        karakterSayisi(t);

        String u=null;
        karakterSayisi(u);

    } //main disi

    public static void karakterSayisi(String s){
        try {
            int a=s.length();
            System.out.println(a);
        } catch (Exception e) {
        System.err.println("null degerini kullanamyiniz");

        //null degeriyle length methodunu kullanmayiniz
        }
    }
}
