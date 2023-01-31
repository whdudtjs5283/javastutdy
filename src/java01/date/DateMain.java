package java01.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

// 오늘 날짜 구하기
public class DateMain {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Calendar cal = Calendar.getInstance();
        System.out.println("1. Calendar : " + sdf.format(cal.getTime()));

        Date date = new Date();
        System.out.println("2. Date : " + sdf.format(date));

        System.out.println("3. System : " + sdf.format(System.currentTimeMillis()));

        LocalDate localDate = LocalDate.now();
        System.out.println("4. localDate : " + localDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("5. localDate DateTimeFormatter : " + localDate.format(formatter));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("6. localDateTime : " + localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
