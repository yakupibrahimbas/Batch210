package d8stringmanipulations;

public class StringManipulation03 {
    public static void main(String[] args) {
        String tv="$456.50";
        String laptop="$852.25";
        tv=tv.replace("$","");
        laptop=laptop.replace("$","");
        Double totalPrice=Double.valueOf(tv)+Double.valueOf(laptop);
        System.out.println(totalPrice);
//----------------------------------------------------
        String name="      ali  cAn    ";
        char first=name.trim().toUpperCase().charAt(0);
        System.out.println(first);
//----------------------------------------------------

        char last=name.trim().toUpperCase().split("")[4].charAt(0);
        System.out.println(last);
        System.out.println(""+first+last);

        //-------------------
        String a="abcdededed@gmail.com";
        System.out.println(a.substring(4,9));

        //--------------------
        String company1=a.split("@")[1].split("\\.")[0];
        System.out.println(company1);

        int startingındex=a.indexOf(".");
        System.out.println(startingındex);

        int endingIndex=a.indexOf(".");
        System.out.println(endingIndex);
        String companyName=a.substring(startingındex,endingIndex);
        System.out.println(companyName);


    }
}
