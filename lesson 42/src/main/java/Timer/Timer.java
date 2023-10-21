package Timer;

public class Timer {
    int seconds;

    public void waitSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void printTime() {
        int min = seconds / 60;
        int sec = seconds - (min * 60);

        String minStr;
        String secStr;
        if(Integer.toString(min).length() == 1)
            minStr = "0" + min;
        else
            minStr = Integer.toString(min);

        if(Integer.toString(sec).length() == 1)
            secStr = "0" + sec;
        else
            secStr = Integer.toString(sec);

        System.out.println(minStr + ":" + secStr);
    }

    public void start() {
        while(seconds >= 0) {
            printTime();
            waitSecond();
            seconds--;
        }
    }

    public Timer(int seconds) {
        this.seconds = seconds;
    }
}
