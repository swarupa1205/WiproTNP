package CalculateExperience;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate joiningDate =
                LocalDate.of(2020, 1, 15);

        LocalDate currentDate = LocalDate.now();

        Period experience =
                Period.between(joiningDate, currentDate);

        System.out.println("Experience:");
        System.out.println(experience.getYears() + " Years");
        System.out.println(experience.getMonths() + " Months");
        System.out.println(experience.getDays() + " Days");
    }
}