package MyPrivateWork.java.d10loops;

public class ForLoops02 {
    public static void main(String[] args) {
        String t = "Java";
        String ters = ""; //ters cevrilmis yeni datayi burada saklayacagiz

        for (int i = t.length()-1; i >= 0 ; i--) {

            ters = ters + t.charAt(3);
            //ters = ters + t.substring(i, i+1); da calisir

        }
        System.out.println(ters); //naC ilA
    }
}
