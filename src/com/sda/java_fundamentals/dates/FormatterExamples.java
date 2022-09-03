package com.sda.java_fundamentals.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatterExamples {
    public static void main(String[] args) {
        System.out.println("\n" + "-------------" + "\n");

        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local time: "+localTime);
        System.out.println("Local date: " + localDate);
        System.out.println("Local date and time: "+localDateTime);
        System.out.println("\n" + "-------------" + "\n");

        //daca vrem doar ore si minute
        System.out.println("\n" + "--------------------------------" + "\n" + "Local Time" + "\n" + "--------------------------------" + "\n");
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm");
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh - mm");
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH MM"); // not working
        DateTimeFormatter localTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");//HH merge dar MM inseamna luna si se poate pune " " sau "-" si "a" e de la AM/PM
        String formattedLocalTime = localTimeFormatter.format(localTime);
        System.out.println("Formated local time: " + formattedLocalTime);

        System.out.println("\n" + "--------------------------------" + "\n" + "Local Date" + "\n" + "--------------------------------" + "\n");
//        DateTimeFormatter localDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");//la an merge si yy / arata 2 caractere
        DateTimeFormatter localDateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//        DateTimeFormatter localDateFormatter = DateTimeFormatter.BASIC_LOCAL_DATE;
//        DateTimeFormatter localDateFormatter = DateTimeFormatter.ISO_LOCAL_DATE;

        String formatterLocalDate = localDateFormatter.format(localDate);
        System.out.println("Formated local date: " + formatterLocalDate);

        System.out.println("---");

        System.out.println("\n" + "--------------------------------" + "\n" + "Local Date Time" + "\n" + "--------------------------------" + "\n");
//        DateTimeFormatter isoLocalTimeFormatter = DateTimeFormatter.ISO_LOCAL_TIME; - forteaza doar ora
//        DateTimeFormatter isoLocalTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE; - forteaza doar data
        DateTimeFormatter isoLocalTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
//        DateTimeFormatter isoLocalTimeFormatter = DateTimeFormatter.RFC_1123_DATE_TIME;   nu functioneaza
        System.out.println(isoLocalTimeFormatter.format(localDateTime));
        System.out.println("Formated local date: " + localTimeFormatter.format(localDateTime));
        System.out.println("\n" + "-------------" + "\n");

    }
}
