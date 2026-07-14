package NextMonth;
import java.time.*;
import java.time.temporal.*;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate nextMonth = today.plusMonths(1)
                                  .withDayOfMonth(1);

        LocalDate secondSunday = nextMonth.with(
                TemporalAdjusters.dayOfWeekInMonth(
                        2, DayOfWeek.SUNDAY));

        System.out.println("Second Sunday of next month: "
                + secondSunday);
    }
}