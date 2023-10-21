package Calculator;

import static java.lang.System.exit;

public class Calculator {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x = y;
    }

    public static int mult(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        if (y == 0) {
            System.out.println("Программа не может быть выполнена.");
            exit(0);
        }
        return x / y;
    }

}
