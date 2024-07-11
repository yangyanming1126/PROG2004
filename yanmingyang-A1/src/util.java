import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class Util {


    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy/M/d HH:mm");

    /**
     * 获取当前时间，格式为yyyy/M/d HH
     * @return 格式化后的当前时间字符串
     */
    public static String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        return now.format(FORMATTER);
    }

    /**
     * 获取未来15天内的任意一天的时间，格式为yyyy/M/d HH
     * @return 格式化后的未来任意一天的时间字符串
     */
    public static String getRandomFutureTimeWithin15Days() {
        LocalDateTime now = LocalDateTime.now();
        int randomDays = ThreadLocalRandom.current().nextInt(1, 16); // 随机生成1到15之间的天数
        int randomHour = ThreadLocalRandom.current().nextInt(9, 19); // 随机生成9到18之间的小时
        int randomMinute = ThreadLocalRandom.current().nextBoolean() ? 0 : 30; // 随机生成0或30作为分钟

        LocalDateTime futureDate = now.plusDays(randomDays).withHour(randomHour).withMinute(randomMinute).withSecond(0).withNano(0);
        return futureDate.format(FORMATTER);
    }

    public static void main(String[] args) {
        // 打印当前时间
        System.out.println("当前时间: " + getCurrentTime());

        // 打印未来15天内的任意一天的时间
        System.out.println("未来15天内的任意一天时间: " + getRandomFutureTimeWithin15Days());
    }
}
