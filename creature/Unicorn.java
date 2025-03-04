package creature;

public class Unicorn {

    static int height = 170;
    static String power = "Double.infinity";

    public static void sleep() {
        int minutesToSleep = 120;
        System.out.println(minutesToSleep);
        System.out.println(height);
        System.out.println(power);
    }

    public static void run() {
        int minutesToRun = 60;
        System.out.println(minutesToRun);
        System.out.println(height);
        System.out.println(power);
    }

    public static void main(String[] args) {
        sleep();
        run();
    }
}