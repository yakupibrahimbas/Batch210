package d6ifswitchternary;

public class Switch01 {
    public static void main(String[] args) {

        String dayName="Wednesday";
        if(dayName.equals("Sunday")) {
            System.out.println(1);
        } else if (dayName.equals("Monday")) {
            System.out.println(2);

        }
        else if (dayName.equals("Tuesday")) {
            System.out.println(3);

        }else if (dayName.equals("Wednesday")) {
            System.out.println(4);

        }else if (dayName.equals("Thursday")) {
            System.out.println(5);

        }else if (dayName.equals("Friday")) {
            System.out.println(6);

        }else if (dayName.equals("Saturday")) {
            System.out.println(7);

        }else {
            System.out.println("Lütfen geçerli bir gün giriniz");
    }
    }
}
