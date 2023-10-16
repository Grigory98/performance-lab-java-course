package birthday;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        long startAllTime = System.currentTimeMillis();
        long startTime = System.currentTimeMillis();
        LocalDate birthday1 = LocalDate.of(1998, 7, 8);
        System.out.println(birthday1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(birthday1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(birthday1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(birthday1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.forLanguageTag("fr-FR"))));
        System.out.println(birthday1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println("LocalDate - " + timeElapsed + "ms");

        startTime = System.currentTimeMillis();
        Date birthday2 = new Date(98, 6, 8);
        System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(birthday2));
        System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(birthday2));
        System.out.println(new SimpleDateFormat("MM/dd/yyyy").format(birthday2));
        System.out.println(new SimpleDateFormat("dd.MM.yyyy").format(birthday2));
        System.out.println(new SimpleDateFormat("yyyy.MM.dd").format(birthday2));
        endTime = System.currentTimeMillis();
        timeElapsed = endTime - startTime;
        System.out.println("Date - " + timeElapsed + "ms");

        startTime = System.currentTimeMillis();
        LocalDateTime birthday3 = LocalDateTime.of(1998, 7, 8, 6, 30, 0);
        System.out.println(birthday3.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println(birthday3.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(birthday3.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        System.out.println(birthday3.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        System.out.println(birthday3.format(DateTimeFormatter.ofPattern("yyyy.MM.dd")));
        endTime = System.currentTimeMillis();
        timeElapsed = endTime - startTime;
        System.out.println("LocalDateTime - " + timeElapsed + "ms");

        startTime = System.currentTimeMillis();
        ZonedDateTime birthday4 = ZonedDateTime.of(birthday1, LocalTime.of(6,30,0), ZoneId.of("Europe/Moscow"));
        System.out.println(birthday4.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println(birthday4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(birthday4.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        System.out.println(birthday4.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        System.out.println(birthday4.format(DateTimeFormatter.ofPattern("yyyy.MM.dd")));
        endTime = System.currentTimeMillis();
        timeElapsed = endTime - startTime;
        System.out.println("ZonedDateTime - " + timeElapsed + "ms");

        startTime = System.currentTimeMillis();
        GregorianCalendar birthday5 = new GregorianCalendar(1998, 7, 8);
        System.out.println(birthday5.toZonedDateTime().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println(birthday5.toZonedDateTime().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(birthday5.toZonedDateTime().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        System.out.println(birthday5.toZonedDateTime().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        System.out.println(birthday5.toZonedDateTime().format(DateTimeFormatter.ofPattern("yyyy.MM.dd")));
        endTime = System.currentTimeMillis();
        timeElapsed = endTime - startTime;
        System.out.println("GregorianCalendar - " + timeElapsed + "ms");

        long endAllTime = System.currentTimeMillis();
        long allTimeElapsed = endAllTime - startAllTime;
        System.out.println("Alltime - " + allTimeElapsed + "ms");


        LocalDate currentDate1 = LocalDate.now();
        System.out.println(currentDate1.isBefore(birthday1));

        Date currentDate2 = new Date();
        System.out.println(currentDate2.before(birthday2));

        LocalDateTime currentDate3 = LocalDateTime.now();
        System.out.println(currentDate3.isBefore(birthday3));

        ZonedDateTime currentDate4 = ZonedDateTime.now();
        System.out.println(currentDate4.isBefore(birthday4));

        GregorianCalendar currentDate5 = new GregorianCalendar();
        System.out.println(currentDate5.before(birthday5));
    }
}
