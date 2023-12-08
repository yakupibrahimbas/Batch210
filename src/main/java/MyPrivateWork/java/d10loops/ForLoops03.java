package MyPrivateWork.java.d10loops;

public class ForLoops03 {
    public static void main(String[] args) {
       /* int sum=0;
        for (int i = 578; i >0 ; i=i/10) {// i/=10 da yazabilirdik.
            sum=sum+i%10;

        }
        System.out.println("sum = " + sum); */

        //--------------------------------------------
        String t = "yusuf";
        String unique = "";
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (t.indexOf(ch) == t.lastIndexOf(ch)) {
                unique = unique + ch;

            }
        }

        System.out.println("Tekrarsiz:"+unique);
    }
}
