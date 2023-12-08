package MyPrivateWork;

public class Y88 {
    public static void main(String[] args) {
        //Kucuk harfleri sil...

       String s="123sndABC?";
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch>='a'&&ch<='z'){
                continue;
            }else {
                System.out.println(ch);
            }
        }

    }
}
