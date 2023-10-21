package Timer;

public class Main {
    public static void main(String[] args) {
        int seconds = Integer.parseInt(args[0]);
        Timer timer = new Timer(seconds);
        timer.start();
    }
}
