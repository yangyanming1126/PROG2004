import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class Util {


    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy/M/d HH:mm");

    /**
     * Gets the current time in yyyy/M/d HH
     * @return Formatted current time string
     */
    public static String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        return now.format(FORMATTER);
    }

    /**
     * Get the time for any day in the next 15 days in the format of yyyy/M/d HH
     * @return A time string for any future day after formatting
     */
    public static String getRandomFutureTimeWithin15Days() {
        LocalDateTime now = LocalDateTime.now();
        int randomDays = ThreadLocalRandom.current().nextInt(1, 16); // The number of days between 1 and 15 is randomly generated
        int randomHour = ThreadLocalRandom.current().nextInt(9, 19); // Randomly generated hours between 9 and 18
        int randomMinute = ThreadLocalRandom.current().nextBoolean() ? 0 : 30; // 0 or 30 minutes are randomly generated

        LocalDateTime futureDate = now.plusDays(randomDays).withHour(randomHour).withMinute(randomMinute).withSecond(0).withNano(0);
        return futureDate.format(FORMATTER);
    }

    public static void main(String[] args) {
        // Prints the current time
        System.out.println("The current time: " + getCurrentTime());

        // Print the time of any day in the next 15 days
        System.out.println("Any day in the next 15 days: " + getRandomFutureTimeWithin15Days());
    }
}
