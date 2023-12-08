package MyPrivateWork;

public class Y20 {
    public static void main(String[] args) {

        String s = "Java is very hard";
        int sLength = s.length();
        System.out.println(sLength);
        System.out.println("------------");
        char firstChar = s.charAt(0);
        System.out.println(firstChar);
        System.out.println("------------");
        char lastChar = s.charAt(sLength - 1);
        System.out.println(lastChar);
        System.out.println("------------");
        String sub1 = s.substring(0, 4);
        System.out.println(sub1);
        System.out.println("------------");
        String sub4 = s.substring(8);
        System.out.println(sub4);
        System.out.println("------------");
        boolean isExist = s.contains("hard");
        System.out.println(isExist);
        System.out.println("------------");
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);
        System.out.println("------------");
        boolean isEnd=s.endsWith("hard");
        System.out.println(isEnd);


    }
}
