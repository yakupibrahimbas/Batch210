package d21oop;

public class StudentRunner {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getAge(25));
        System.out.println(s.isSuccessful());
        s.getAge(25);
        System.out.println(s.getAge(25));
        s.setSuccessful(false);
        System.out.println(s.isSuccessful());

        //get ve set methodlarini cokca iceren class'lara Java Beans denir.
        //Java Beans aslinda ozel bir classtir


    }
}