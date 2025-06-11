import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CountDown For New Year Program!!!!!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of seconds to countdown from:");
        int s = input.nextInt();
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = s;
            @Override
            public void run() {
                System.out.println(count);
                count -- ;
                if(count<=0) {
                    System.out.println("Happy New Year");
                    timer.cancel();
                }

            }
        };
    timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
