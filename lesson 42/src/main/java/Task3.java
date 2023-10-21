public class Task3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
        if(n < 1 || col < 0) {
            System.out.println("Ошибка. Введены некорректные значения.");
        }
        snakePrint(n, col);
    }

    public static void snakePrint(int n, int col) {
        for(int i = 0; i <= n; i++) {
            if(i % col == 0)
                System.out.println();
            System.out.print(i + " ");
        }
    }
}
