package Calculator;

public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String sign = args[1];
        int b = Integer.parseInt(args[2]);

        switch (sign) {
            case "+":
                System.out.println(Calculator.add(a, b));
                break;

            case "-":
                System.out.println(Calculator.sub(a, b));
                break;

            case "*":
                System.out.println(Calculator.mult(a, b));
                break;

            case "/":
                System.out.println(Calculator.divide(a, b));
                break;

            default:
                System.out.println("Не корректный символ операции.");
        }

    }
}
