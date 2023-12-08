package d9stringloops;

public class StringManipulations01 {
    public static void main(String[] args) {

        /*
        String s="Yusuf Kaya";
        boolean isStart=s.startsWith("K",6);
        System.out.println(isStart);
*/

        String s = "Yusuf";
        if (s.indexOf("y") == s.lastIndexOf("y")) {
            System.out.print("y");

        }
        if (s.indexOf("u") == s.lastIndexOf("u")) {
            System.out.println("u");
        }
        if (s.indexOf("s") == s.lastIndexOf("s")) {
            System.out.print("s");
        }
        if (s.indexOf("f") == s.lastIndexOf("f")) {
            System.out.print("f");
        }
        System.out.println();

        String cardNum="1234 6789 1234 6789";
        String first=cardNum.substring(0,15).replaceAll("[0-9]","*");
       // System.out.println(first);

        String last=cardNum.substring(15);
        //System.out.println(last);

String result1=first+last;
        System.out.println(result1);
        String result2=first.concat(last);
        System.out.println(result2);
    }
}
