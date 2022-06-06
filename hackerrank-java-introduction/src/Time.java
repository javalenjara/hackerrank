import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Time {

    public static void main(String[] args) {
        final int ttl = 86400;
        long epochSecond1 = Instant.now().getEpochSecond() + ttl;
        final long epochSecond2 = Instant.now().plus(86400, ChronoUnit.SECONDS).getEpochSecond();
        System.out.println("epochSecond1: " + epochSecond1);
        System.out.println("epochSecond2: " + epochSecond2);

    }

}
