import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Случайные простые числа от 2 до " + n + ":");

        for(int i = 0; i < 5; i++){
            int number = nextInt(n);
            if(isPrime(number)){
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int x) {
        if (x == 2) {
            return true;
        }
        if (x <= 1 || x % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int nextInt (int x){
        Random random = new Random();
        int result = random.nextInt(x);
        return result;
    }
}
