import static java.lang.System.exit;

public class Task2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        if(n < 0 || m < 0) {
            System.out.println("Ошибка. Некорректные значения.");
            exit(1);
        }

        for(int i = 0; i < n; i++) {
            m += 10;
        }
        System.out.println("Бригада работала " + (int) m/60 + " часов " + m%60 + " минут.");
    }
}
