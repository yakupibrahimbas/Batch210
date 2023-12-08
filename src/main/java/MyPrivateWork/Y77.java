package MyPrivateWork;

public class Y77 {
    public static void main(String[] args) {
        String s="Learn Java earn money";
        String s1=s.replace("money","dollar");
        System.out.println(s1);

        //------------------------------
        String s2=s.replace("e","");
        System.out.println(s2);

        //-----------------

        String m="Ali Can Kahraman";
        String n=m.replace("[AZ]","[az]");
        System.out.println(n);


        //---------------------
        String y="abcvcscsc413415466464";
        int z=y.replaceAll("[^0-9]","*").length();
        System.out.println(z);

        //--------------------------


    }
}
