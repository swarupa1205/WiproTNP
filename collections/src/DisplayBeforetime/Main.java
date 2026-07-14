package DisplayBeforetime;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();

        LocalTime previousTime = currentTime
                .minusHours(5)
                .minusMinutes(30);

        System.out.println("Current Time : "
                + currentTime);

        System.out.println("Time before 5 hours 30 minutes : "
                + previousTime);
    }
}