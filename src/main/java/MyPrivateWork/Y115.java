package MyPrivateWork;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Y115 {
    public static void main(String[] args) {
    LocalTime myCurrentTime=LocalTime.now();
        System.out.println(myCurrentTime);
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("hh:mm a");
        dtf1.format(myCurrentTime);
        LocalDate dateInTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter.ofPattern("dd*MM*yyyy-hh:mm a");

    }
}
