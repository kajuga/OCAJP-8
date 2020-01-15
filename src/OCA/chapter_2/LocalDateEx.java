package OCA.chapter_2;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateEx {
    public static void main(String[] args)
    {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());
//
//
//        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
//        LocalDate date2 = LocalDate.of(2015, 1, 20);

//    LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
//        System.out.println(date);
//
//    date = date.plusMonths(2);
//        System.out.println(date);
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalDate date2 = date.plusDays(10);
        System.out.println(date);
        System.out.println(date2);



}}

