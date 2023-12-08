package MyPrivateWork;

import d16overloading_varrags_passbyvalue_constructors.Car;

import java.time.LocalDate;
import java.time.Month;

public class Y114 {
    public static void main(String[] args) {

        LocalDate myDate=LocalDate.now();
        System.out.println(myDate);
        System.out.println(myDate.getMonthValue());
        Month ay=myDate.getMonth();
        System.out.println(ay);
        System.out.println(myDate.getYear());
        System.out.println(myDate.getDayOfYear());
        System.out.println(myDate.minusYears(1).minusMonths(1).minusDays(1));
        LocalDate date1=  LocalDate.of(1980,8,3);
        LocalDate date2=LocalDate.of(2010,5,4);
        System.out.println("date1="+date1+",date2="+date2);
        Boolean sonrami=date2.isAfter(date1);
        System.out.println(sonrami);




    }
}
