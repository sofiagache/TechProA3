import java.awt.*;
import java.time.Duration;
import java.time.LocalTime;

public class AlarmClockT7 implements Runnable {

    private final LocalTime alarmTime;

    public AlarmClock(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
    }

    @Override
    public void run() {
        System.out.println("Countdown started...");

        while (true) {
            LocalTime now = LocalTime.now();
            Duration remaining = Duration.between(now, alarmTime);

            if (!remaining.isPositive() || remaining.isZero()) {
                break; // alarm reached
            }

            long hours = remaining.toHours();
            long minutes = remaining.toMinutes() % 60;
            long seconds = remaining.getSeconds() % 60;

            
            System.out.printf("%02d:%02d:%02d remaining%n", hours, minutes, seconds);

            try {
                Thread.sleep(1000); // wait 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
                return;
            }
        }

        System.out.println("\n*ALARM NOISES*");
        Toolkit.getDefaultToolkit().beep(); 
        System.out.println("ALARM! Press Enter to stop...");
    }
}